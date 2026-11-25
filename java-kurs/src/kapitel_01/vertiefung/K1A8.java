package kapitel_01.vertiefung;
public class K1A8 {

        /** public class Main {
    # Mein erstes Java Program!                                     Kommentare in Java nicht mi #                                       -Syntaxfehler
    public static void start(String[] args) {                       Die Methode muss "main" statt "start" heißen                        -Logischer Fehler
       print("Hallo Leute! Das ist mein erstes Java Programm!")     System.out.println(...)     -Syntaxfehler      ; am Ende fehlt      -Syntaxfehler
       int stunden am tag = 24;                                     Keine Leerzeichen in Variablennamen                                 -Synzaxfehler
       minuten = 60;                                                kein Datentyp angegeben                                             -Syntaxfehler
       print("Ein Tag hat" + 24 * 60  + minuten)                    Variablen nicht benutzt     -                  ; am Ende fehlt      -Syntaxfehler
    }
}*/
        
    /* Mein erstes Java Program! */
    public static void main(String[] args) {
       System.out.println("Hallo Leute! Das ist mein erstes Java Programm!");
       int stunden_am_tag = 24;
       int minuten = 60;
       System.out.println("Ein Tag hat" + (stunden_am_tag * minuten) + "minuten");
    }
}

