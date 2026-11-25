package kapitel_02.einfuerung;

import java.util.Locale;
import java.util.Scanner;

/**
 * Liest eine Kommazahl ein.
 * Bei deutscher Locale wird in der Konsole ein Komma verwendet.
 */
public class K2E3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.GERMAN);

    System.out.print("Wie groß bist du in Metern? ");
    double groesse = scanner.nextDouble(); /* mit Komma die zahlen trennen 1,83 nicht 1.83 */

    System.out.println("Du bist " + groesse + " m groß.");

    scanner.close();
  }
}