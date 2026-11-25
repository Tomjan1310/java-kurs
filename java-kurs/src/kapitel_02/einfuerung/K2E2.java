package kapitel_02.einfuerung;

import java.util.Scanner;

/**
 * Liest eine ganze Zahl ein.
 */
public class K2E2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Wie alt bist du? ");
    int alter = scanner.nextInt(); /* Nur Ganzkommazahl */

    System.out.println("Du bist " + alter + " Jahre alt.");

    scanner.close();
  }
}