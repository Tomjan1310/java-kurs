package kapitel_02.einfuerung;

import java.util.Scanner;

/**
 * Liest einen Namen ein und gibt eine Begrüßung aus.
 */
public class K2E1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Wie heißt du? ");
    String name = scanner.nextLine(); /* Benutzer kann was eingeben. Egal ob Buchstabe oder Zahl */

    System.out.println("Hallo " + name + "!");

    scanner.close();
  }
}