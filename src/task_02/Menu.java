package task_02;

import java.util.Arrays;

public class Menu extends ArrayWork{


  public void list(){

    System.out.println("Оберіть дію яку ви бажаєте:");
    System.out.println("1. Вивести дані масиву");
    System.out.println("2. Замінити всі дані масиву");

  }

  public void menu(){

    while (true){

      list();

      switch (scanner.nextLine()){

        case "1":{
          Massif();

          for(Auto[] row: autos){
            System.out.println(Arrays.deepToString(row));
          }
        }
        break;

        case "2":{
          Massif();
          System.out.println("Введіть значення на яке ви бажаєте замінити всі дані масиву");

          if(scanner.hasNextInt()){
            int value = scanner.nextInt();
            scanner.nextLine(); // Додали цей рядок
            for(int i = 0; i < autos.length; i++ ){
              for (int j = 0; j < autos[i].length; j++) {
                Arrays.fill(autos[i], new Auto(value, value));
              }
            }

            for(Auto[] row: autos){
              System.out.println(Arrays.toString(row));
            }
          }else{System.out.println("Ви ввели не числове значення");}

        }
        break;
      }
    }

  }

}
