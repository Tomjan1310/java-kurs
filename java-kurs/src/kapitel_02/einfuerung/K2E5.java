package kapitel_02.einfuerung;

import java.util.Scanner;

/**
 * Zeigt das typische Problem beim Mischen von nextInt()
 * und nextLine() und die passende Lösung.
 */
public class K2E5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Wie alt bist du? ");
    int alter = scanner.nextInt();

    // nextInt() liest nur die Zahl.
    // Das Zeilenende bleibt noch übrig.
    // Dieses nextLine() entfernt den Rest der Zeile.
    scanner.nextLine();

    System.out.print("Wie heißt dein Lieblingsspiel? ");
    String lieblingsspiel = scanner.nextLine();

    System.out.println();
    System.out.println("Alter: " + alter);
    System.out.println("Lieblingsspiel: " + lieblingsspiel);

    scanner.close();
  }
}