package task_02;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import task_01.Massif;

public class ArrayWork {

  Scanner scanner = new Scanner(System.in);
  Random random = new Random();
  int numRows = random.nextInt(5) + 1;
  int numCols = random.nextInt(5) + 1;
  Auto [][] autos;

  public void Massif(){

    autos = new Auto[numRows][numCols];

    for(int i = 0; i < autos.length; i++){

      for(int j = 0; j < autos[0].length; j++){
        int randomForYear = random.nextInt(50)+1;
        int randomForHorsepower = random.nextInt(100)+1;
        autos[i][j] = new Auto(randomForHorsepower, randomForYear);
      }
    }

    /*for(Auto[] row: autos){
      System.out.println(Arrays.toString(row));
    }*/
  }


}
