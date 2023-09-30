package task_01;

import java.util.*;

public class Massif {

  public void massif(){

    Random random = new Random();
    int randomSize = random.nextInt(15);
    ArrayList <Integer> arrayList = new ArrayList<>(randomSize);

   // Integer [] massif = new Integer[random.nextInt(15)];

    for(int i = 0; i < randomSize ; i++){
      int randomValue = random.nextInt(100);
      arrayList.add(randomValue);
    }

    System.out.println( "Оригінальний масив: " + arrayList);

    Collections.sort(arrayList);
    System.out.println("Від сортаваний за зростанням: " + arrayList);

    Collections.sort(arrayList, Collections.reverseOrder());
    System.out.println("Від сортований за спаданням: " + arrayList);


  }

}
