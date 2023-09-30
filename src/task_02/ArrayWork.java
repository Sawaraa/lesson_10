package task_02;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import task_01.Massif;

public class ArrayWork {
  Random random = new Random();
  int numRows = random.nextInt(5) + 1;
  int ramdomSize = random.nextInt(5) + 1;


  ArrayList <Auto> autos;
 // Auto [][] autos;

  public void Massif(){

    autos = new ArrayList<>(ramdomSize);

    for (int i = 0; i < ramdomSize; i++){
      int randomForYear = random.nextInt(50)+1;
      int randomForHorsepower = random.nextInt(100)+1;

      Auto auto = new Auto(randomForHorsepower,randomForYear);
      autos.add(auto);
    }

   /* for(int i = 0; i < autos.length; i++){
      for(int j = 0; j < autos[0].length; j++){
        int randomForYear = random.nextInt(50)+1;
        int randomForHorsepower = random.nextInt(100)+1;
        autos[i][j] = new Auto(randomForHorsepower, randomForYear);
      }
    } */

  }


}
