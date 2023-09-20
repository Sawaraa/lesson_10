package task_02;

public class Auto {

  int numberOfHorsepower ;

  int year;

  public Auto(int numberOfHorsepower, int year) {
    this.numberOfHorsepower = numberOfHorsepower;
    this.year = year;
  }

  @Override
  public String toString() {
    return "Auto{" +
        "numberOfHorsepower=" + numberOfHorsepower +
        ", year=" + year +
        '}';
  }
}
