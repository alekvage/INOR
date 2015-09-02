//Oppgavetekst:
//Lag et program som virker som en kalkulator med meny. Programmet skal kunne
//legge sammen, trekke fra, dele og gange brukerens tall. Programmet skal også
//ikke avslutte, med mindre bruker gir beskjed om det.

import java.util.Scanner;

public class MinOppgave2 {

  static void Adding() {
    Scanner inputAdd = new Scanner(System.in);
    System.out.print("Please type in your first number: ");
    int num1 = Integer.parseInt(inputAdd.nextLine());
    System.out.print("and your second number: ");
    int num2 = Integer.parseInt(inputAdd.nextLine());
    System.out.println("\n" + num1 + " added to " + num2 + " equals " + (num1 + num2) + "\n");
  }

  static void Subtracting() {
    Scanner inputSub = new Scanner(System.in);
    System.out.print("Please type in your first number: ");
    int num1 = Integer.parseInt(inputSub.nextLine());
    System.out.print("and your second number: ");
    int num2 = Integer.parseInt(inputSub.nextLine());
    System.out.println("\n" + num1 + " subtracted " + num2 + " equals " + (num1 - num2) + "\n");
  }

  static void Dividing() {
    Scanner inputDiv = new Scanner(System.in);
    System.out.print("Please type in your first number: ");
    int num1 = Integer.parseInt(inputDiv.nextLine());
    System.out.print("and your second number: ");
    int num2 = Integer.parseInt(inputDiv.nextLine());
    System.out.println("\n" + num1 + " divided by " + num2 + " equals " + (num1/num2) + "\n");
  }

  static void Multiplying() {
    Scanner inputMul = new Scanner(System.in);
    System.out.print("Please type in your first number: ");
    int num1 = Integer.parseInt(inputMul.nextLine());
    System.out.print("and your second number: ");
    int num2 = Integer.parseInt(inputMul.nextLine());
    System.out.println("\n" + num1 + " times " + num2 + " equals " + (num1*num2) + "\n");
  }

  static void Menu() {
    System.out.println("\nFor addition, press 1");
    System.out.println("For subtraction, press 2");
    System.out.println("For divition, press 3");
    System.out.println("For multiplication, press 4");
    System.out.println("To quit, press 0");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean run = true;
    while (run) {
      Menu();
      int choiceMenu = Integer.parseInt(input.nextLine());
      System.out.println("\n");
      if (choiceMenu == 1) {
        Adding();
      }
      else if (choiceMenu == 2) {
        Subtracting();
      }
      else if (choiceMenu == 3) {
        Dividing();
      }
      else if (choiceMenu == 4) {
        Multiplying();
      }
      else if (choiceMenu == 0){
        run = false;
      }
      else {
        System.out.println("Invalid buttonpress, please try again");
      }
    }
  }
}
