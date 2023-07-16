package br.com.alura.bytebank.domain.conta;

import br.com.alura.bytebank.ConnectionFactory;
import br.com.alura.bytebank.domain.RegraDeNegocioException;

import java.math.BigDecimal;
import java.util.Set;

import java.sql.Connection;

public class ContaService {

    private ConnectionFactory connection;

    public ContaService(){
        this.connection = new ConnectionFactory();
    }

    public Set<Conta> listarContasAbertas() {
        Connection conn = connection.recuperarConexao();
        return new ContaDAO(conn).listar();
    }

    public BigDecimal consultarSaldo(Integer numeroDaConta) {
        var conta = buscarContaPorNumero(numeroDaConta);
        return conta.getSaldo();
    }

    public void abrir(DadosAberturaConta dadosDaConta) {
        Connection conn = connection.recuperarConexao();
        new ContaDAO(conn).salvar(dadosDaConta);                    
    }

    public void realizarSaque(Integer numeroDaConta, BigDecimal valor) {
        var conta = buscarContaPorNumero(numeroDaConta);
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RegraDeNegocioException("Valor do saque deve ser superior a zero!");
        }

        if (valor.compareTo(conta.getSaldo()) > 0) {
            throw new RegraDeNegocioException("Saldo insuficiente!");
        }

        if (!conta.getEstaAtiva()) {
            throw new RegraDeNegocioException("A conta está inativa!");
        }

        new ContaDAO(connection.recuperarConexao()).alterar(conta.getNumero(), (conta.getSaldo().subtract(valor)));
    }

    public void realizarDeposito(Integer numeroDaConta, BigDecimal valor) {
        var conta = buscarContaPorNumero(numeroDaConta);
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RegraDeNegocioException("Valor do deposito deve ser superior a zero!");
        }
        new ContaDAO(connection.recuperarConexao()).alterar(conta.getNumero(), (conta.getSaldo().add(valor)));
    }

    public void realizarTrasferencia(Integer numedoDaContaOrigem, Integer numeroContaRecebedora, BigDecimal valor){
        var contaOrigem = buscarContaPorNumero(numedoDaContaOrigem);
        var contaRecebidora = buscarContaPorNumero(numeroContaRecebedora);
        this.realizarSaque(numedoDaContaOrigem, valor);
        this.realizarDeposito(numeroContaRecebedora, valor);
    }

    public void encerrar(Integer numeroDaConta) {
        var conta = buscarContaPorNumero(numeroDaConta);
        if (conta.possuiSaldo()) {
            throw new RegraDeNegocioException("Conta não pode ser encerrada pois ainda possui saldo!");
        }

        new ContaDAO((connection.recuperarConexao())).encerrar(numeroDaConta);
    }

    private Conta buscarContaPorNumero(Integer numero) {
        Connection conn = connection.recuperarConexao();
        var conta = new ContaDAO(conn).listarConta(numero);
        if (conta != null) return conta;

        throw new RegraDeNegocioException("Não existe conta cadastrada com esse número!");

    }
}
