package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale lang = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(lang.getDisplayLanguage());
        
    }
}
