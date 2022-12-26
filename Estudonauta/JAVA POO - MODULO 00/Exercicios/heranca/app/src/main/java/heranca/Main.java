package heranca;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
    
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCpf("12345678911");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salário do vendendor é de R$" + v.calcularSalario());
        
        Motorista m = new Motorista();
        m.setNome("Tobias");
        m.setSalario(1000.0f);
        m.setCpf("12345678911");
        m.setDataNascimento(new Date());
    }
}
