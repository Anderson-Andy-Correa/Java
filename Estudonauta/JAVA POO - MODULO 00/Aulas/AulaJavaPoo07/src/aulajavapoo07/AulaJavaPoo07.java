package aulajavapoo07;

import java.util.Random;

public class AulaJavaPoo07 {
    public static void main(String[] args) {
        
        Lutador l[] = new Lutador [6];
        Random ran = new Random();
        
        l[0] = new Lutador("PrettyBoy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.5f, 12, 2, 4);
        
        Luta UEC[] = new Luta[6];
        
        UEC[0] = new Luta();
        UEC[0].marcarLuta(l[ran.nextInt(2)], l[ran.nextInt(2)]);
        UEC[0].lutar();
        UEC[1] = new Luta();
        UEC[1].marcarLuta(l[ran.nextInt(2)], l[ran.nextInt(2)]);
        UEC[1].lutar();
        UEC[2] = new Luta();
        UEC[2].marcarLuta(l[ran.nextInt(4-2)+2], l[ran.nextInt(4-2)+2]);
        UEC[2].lutar();
        UEC[3] = new Luta();
        UEC[3].marcarLuta(l[ran.nextInt(4-2)+2], l[ran.nextInt(4-2)+2]);
        UEC[3].lutar();
        UEC[4] = new Luta();
        UEC[4].marcarLuta(l[ran.nextInt(6-4)+4], l[ran.nextInt(6-4)+4]);
        UEC[4].lutar();
        UEC[5] = new Luta();
        UEC[5].marcarLuta(l[ran.nextInt(6-4)+4], l[ran.nextInt(6-4)+4]);
        UEC[5].lutar();
        
        for (int i = 0; i < 6; i++){
            System.out.println("---------------------------------");
            l[i].status();

        }
        System.out.println("---------------------------------");
    }
}
