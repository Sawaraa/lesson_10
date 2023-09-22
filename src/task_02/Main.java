package task_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner scanner = new Scanner(System.in);

  public Main(Scanner scanner) {
    this.scanner = scanner;
  }

  public static void main(String[] args) {

    Menu menu = new Menu();
    menu.menu();
    menu.scanner.close();



  }


}
