package kapitel_02.einfuerung;

import java.util.Locale;
import java.util.Scanner;

/**
 * Kombiniert mehrere Eingaben verschiedener Datentypen.
 */
public class K2E4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.GERMAN);

    System.out.print("Wie heißt du? ");
    String name = scanner.nextLine();

    System.out.print("Wie alt bist du? ");
    int alter = scanner.nextInt();

    System.out.print("Wie groß bist du in Metern? ");
    double groesse = scanner.nextDouble();

    System.out.println();
    System.out.println("Zusammenfassung:");
    System.out.println("Name: " + name);
    System.out.println("Alter: " + alter);
    System.out.println("Größe: " + groesse + " m");

    scanner.close();
  }
}