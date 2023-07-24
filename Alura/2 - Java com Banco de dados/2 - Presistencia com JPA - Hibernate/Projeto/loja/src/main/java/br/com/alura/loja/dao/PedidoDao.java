package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Pedido;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class PedidoDao {

    private EntityManager em;

    public PedidoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar (Pedido pedido){ this.em.persist(pedido); }

    public void atualizar (Pedido pedido) { this.em.merge(pedido); }

    public void remover (Pedido pedido) {
        pedido = this.em.merge(pedido);
        this.em.remove(pedido);
    }

    public Pedido buscarPorId(Long id) { return this.em.find(Pedido.class, id); }

    public List<Pedido> buscarTodos() {
        return this.em.createQuery("SELECT p FROM Pedido p", Pedido.class).getResultList();
    }

    public BigDecimal valorTotalVendido() {
        String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
        return this.em.createQuery(jpql, BigDecimal.class)
                .getSingleResult();
    }
}
