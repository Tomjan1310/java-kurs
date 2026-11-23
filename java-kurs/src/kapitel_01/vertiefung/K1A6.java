package kapitel_01.vertiefung;
public class K1A6 {
    public static void main(String[] args) {
        int jahre = 20;
        int monate = 3;
        int tage = 7;
        int stunden = 18;
        int minuten = 5;
        
        System.out.println("Frau Pedant ist " + (jahre * 365) + (monate * 30) + tage + " Monate alt");
        System.out.println("Frau Pedant ist " + (jahre * 12) + monate + " Tage alt");
        System.out.println("Frau Pedant ist " + (jahre * 365 * 24) + (monate * 30 * 24) + (tage * 24) + stunden + " Stunden alt");
        System.out.println("Frau Pedant ist  " + (jahre * 365 * 24 * 60) + (monate * 30 * 24 * 60) + (tage * 24 * 60) + (stunden * 60) + minuten + " Minuten alt");
        System.out.println("Frau Pedant ist " + (jahre * 365 * 24 * 60 * 60) + (monate * 30 * 24 * 60 * 60) + (tage * 24 * 60 * 60) + (stunden * 60 * 60) +(minuten * 60) + " Sekunden alt");
    }
}

