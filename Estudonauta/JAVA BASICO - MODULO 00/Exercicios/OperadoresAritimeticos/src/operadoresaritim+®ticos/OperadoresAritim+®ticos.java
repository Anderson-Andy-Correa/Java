package operadoresaritiméticos;

import java.util.Scanner;

public class OperadoresAritiméticos {

    public static void main(String[] args) {
        
        /*int n1;
        int n2;
        Scanner leia = new Scanner(System.in);
       
        System.out.print("Digite o Numerador: ");
        n1 = leia.nextInt();
        System.out.print("Digite o Denominador: ");
        n2 = leia.nextInt();
        float divisão = n1/n2;
        float resto = n1%n2;
        
        System.out.printf("O valor intiro da divisão é %s \n", divisão);
        System.out.printf("E o resto da divisão é %s \n", resto);*/
        
        
        /*int numero = 10;
        int valor = 4 + ++numero;
        System.out.println(valor);
        System.out.println(numero);*/
        
        /*int a = 4, b = 4, c = 4, d = 4, e = 4;
        a += 2; // a = a + 2
        b -= 2; // b = b - 2
        c *= 2; // c = c * 2
        d /= 2; // d = d / 2
        e %= 2; // e = e % 2        
        System.out.printf("a = 4, a = a + 2 -> %s\n", a);
        System.out.printf("b = 4, b = b - 2 -> %s\n", b);
        System.out.printf("c = 4, c = c * 2 -> %s\n", c);
        System.out.printf("d = 4, d = d / 2 -> %s\n", d);
        System.out.println("e = 4, e = e % 2 -> " + e);*/
        
        /*int base;
        Scanner leia = new Scanner(System.in);
       
        System.out.print("Digite o valor da base: ");
        base = leia.nextInt();
        float raiz = (float) Math.sqrt(base);
        float raizCubica = (float) Math.cbrt(base);
        int potencia = (int)Math.pow(base, 2);
        
        System.out.printf("O resultado da raiz é %s \n", raiz);
        System.out.printf("O resultado da raiz cúbica é %s \n", raizCubica);
        System.out.printf("O resultado da potencia é %s \n", potencia);*/
        
        int v = (int)(-1000+(float)Math.random()*(1000-(-1000)));
        System.out.println(v);
        /*int floor = (int)Math.floor(v);
        System.out.println(floor);
        int ceil = (int)Math.ceil(v);
        System.out.println(ceil);
        int round = (int)Math.round(v);
        System.out.println(round);*/
        
        int resto = (int)(v % 2);
        System.out.printf("Resto da divisão por 2: %s \n", resto);
        double cubo = Math.pow(v, 3);
        System.out.printf("Elevado ao cubo: \t%.2f \n", cubo);
        double sqrt = Math.sqrt(v);
        System.out.printf("Raiz quadrada: \t\t%.2f \n", sqrt);
        double cbrt = Math.cbrt(v);
        System.out.printf("Raiz Cúbica: \t\t%.2f \n", cbrt);
        int valorAbsoluto = Math.abs(v);
        System.out.printf("Valor Absoluto: \t%s \n",valorAbsoluto);
        
        /*int n1 = 2, n2 = 5;
        double resultado = n2/n1;
        System.out.println(resultado);*/
    }
    
}
