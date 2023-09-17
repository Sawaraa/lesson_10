import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Massif {

  public void massif(){

    Random random = new Random();
    Integer [] massif = new Integer[random.nextInt(15)];

    for(int i = 0; i < massif.length ; i++){
      massif[i] = random.nextInt(101);
    }

    System.out.println( "Оригінальний масив: " + Arrays.toString(massif));

    Arrays.sort(massif);
    System.out.println("Від сортаваний за зростанням: " + Arrays.toString(massif));

    Arrays.sort(massif, Collections.reverseOrder());
    System.out.println("Від сортований за спаданням: " + Arrays.toString(massif));


  }

}
