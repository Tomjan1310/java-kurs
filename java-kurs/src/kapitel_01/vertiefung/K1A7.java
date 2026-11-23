package kapitel_01.vertiefung;
public class K1A7 {
    public static void main(String[] args) {
        int minuten = 7993;
        int tage = minuten / (24 * 60);
        int stunden = (minuten % (24 * 60)) / 60;
        int restMinuten = minuten % 60;

        System.err.println("Event in: "+ tage + ":" + stunden + ":" + restMinuten );

    }
}
