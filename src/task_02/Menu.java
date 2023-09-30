package task_02;

import java.util.Arrays;
import java.util.Scanner;
import task_01.Massif;

public class Menu extends ArrayWork{

  Scanner scanner = new Scanner(System.in);

  Main main = new Main(scanner);
  public void list(){

    System.out.println("Оберіть дію яку ви бажаєте:");
    System.out.println("1. Вивести дані масиву");
    System.out.println("2. Замінити всі дані масиву");

  }

  public void menu(){

    while (true){

      list();

      switch (main.scanner.nextLine()){

        case "1":{
          Massif();

          for(Auto auto : autos){
            System.out.println(auto);
          }
        }
        break;

        case "2":{
          Massif();
          System.out.println("Введіть значення на яке ви бажаєте замінити всі дані масиву");

          if(main.scanner.hasNextInt()){
            int value = main.scanner.nextInt();
            main.scanner.nextLine(); // Додали цей рядок

            for (int i = 0; i < ramdomSize; i++){

              Auto auto = new Auto(value, value);
              autos.set(i,auto);
            }

            /*for(int i = 0; i < autos.length; i++ ){
              for (int j = 0; j < autos[i].length; j++) {
                Arrays.fill(autos[i], new Auto(value, value));
              }
            }*/

            for(Auto auto: autos){
              System.out.println(auto);
            }
          }else{System.out.println("Ви ввели не числове значення");}

        }
        break;
      }
    }

  }

}
