package aulajavapoo05;

import java.util.Scanner;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    Scanner l = new Scanner(System.in);
    boolean c;
    
    public ContaBanco() {
        Metodos.titulo("Seja bem vindo ao sistema Banco Andy's");
        this.setStatus(false);
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        if (status){
            return "Ativo";
        }else{
            return "Inativo";
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
       
    public void abrirConta(){
        if("Inativo".equals(this.getStatus())){
            int resp = 0;
            System.out.print("Qual é o seu nome? ");
            this.setDono(l.next());
            System.out.println("-----------------------------------");
            while (resp != 1 && resp != 2){
            System.out.println("Qual tipo de conta gostaria de abrir?");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta poupança");
            System.out.print("Sua escolha: ");
            resp = l.nextInt();
            if (resp != 1 && resp != 2){
                System.out.println("Tipo inválido, tente novamente.");
                continue;
            }
            System.out.println("-----------------------------------");
            if (resp == 1){
                this.setTipo("Conta Corrente");
                this.setSaldo(50);
            }else{
                this.setTipo("Conta poupança");
                this.setSaldo(150);
            }
            this.setNumConta(Metodos.numAle());
            this.setStatus(true);
            }
        }else{
            System.out.println(this.getTipo() + "já existente!");
        }
    }
    
    public void fecharConta(){
        if ("Ativo".equals(this.getStatus())){
            this.setStatus(false);
            if (this.getSaldo() > 0) {
                if (this.getSaldo() < 0) {
                    System.out.println("Conta fechada com sucesso!");
                } else {
                    System.out.println("Conta com saldo devedor, favor zerar débitos");
                }
            } else {
                System.out.println("Conta com dinheiro, favor sacar todo o conteudo.");
            }
            
        }else{
            System.out.println("Conta inexistente!");
        }
        
        System.out.println("-----------------------------------");
    }
    
    public void sacar(){
        if ("Ativo".equals(this.getStatus())){
            int resp;
            while (true){
                System.out.print("Qual o valor que gostarias de sacar? ");
                resp = l.nextInt();
                if (resp < 0){
                    System.out.println("Valor Inválido, tente novamente.");
                    continue;
                }else if(resp > this.getSaldo()){
                    System.out.println("Valor maior que o saldo atual, tente novamente.");
                    continue;
                }
                this.setSaldo(this.saldo - resp);
                break;
            }
        }else{
            System.out.println("Conta inexistente!");
        }
        System.out.println("-----------------------------------");
    }
    
    public void depositar(){
        if ("Ativo".equals(this.getStatus())){
            int resp = -1;
            while (resp <0){
                System.out.print("Quanto gostaria de depositar? ");
                resp = l.nextInt();
                if (resp <0){
                    System.out.println("Valor inválido!");
                    continue;
                }
                this.saldo += resp;
            }
        }else{
            System.out.println("Conta inexistente!");
        }
        System.out.println("-----------------------------------");
    }
    
    public void pagarMensal(){
        if ("Ativo".equals(this.getStatus())){
            if (this.getSaldo() > 125){
                this.setSaldo(this.saldo - 125);
                System.out.println("Valor da mensalidade recebido, obrigado. ");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta inexistente!");
        }
        System.out.println("-----------------------------------");
    }
    
    public void status(){
        if (this.status){
            System.out.println("Número da conta: " + this.getNumConta());
            System.out.println("Tipo da conta: " + this.getTipo());
            System.out.println("Titular da conta: " + this.getDono());
            System.out.println("Saldo da conta: " + this.getSaldo());
            System.out.println("Status da conta: " + this.getStatus());
        }else{
            System.out.println("Nenhuma conta encontrada.");
        }
        System.out.println("-----------------------------------");
    }
    
    public boolean menu(){
        System.out.println("O que gostarias de fazer? ");
        System.out.println("1 - Abrir conta");
        System.out.println("2 - Fechar conta");
        System.out.println("3 - Ver conta");
        System.out.println("4 - Sacar");
        System.out.println("5 - Depositar");
        System.out.println("6 - Pagar Mensalidade");
        System.out.println("7 - Sair");
        int resp;
        
        while (true){
            System.out.print("Sua opção: ");
            resp = l.nextInt();
            System.out.println("-----------------------------------");
            if (resp < 8 && resp > 0){
                break;
            }
            System.out.println("Opção inválida, tente novamente.");
        }
        switch(resp){
            case 1:
                abrirConta();
                c = true;
                break;
            case 2:
                fecharConta();
                c = true;
                break;
            case 3:
                status();
                c = true;
                break;
            case 4:
                sacar();
                c = true;
                break;
            case 5:
                depositar();
                c = true;
                break;
            case 6:
                pagarMensal();
                c = true;
                break;
            case 7:
                System.out.println("Saindo...");
                Metodos.titulo("Obrigado e volte sempre!");
                c = false;
        }
        return c;
    }
}
