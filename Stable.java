import java.util.*;

class Stable{
  private String address;
  private ArrayList<Horse> horses;

  public Stable(String address) {
    this.address = address;
    this.horses = new ArrayList<>();
  }

  public void addHorse(Horse horse) {
    this.horses.add(horse);
  }

  public void showHorses() {
  int i = 1;
    for (Horse horse : this.horses) {
      System.out.printf("Horse #%d Name: %s Weight: %.1f Tame: %b\n",i, horse.getName(), horse.getWeight(), horse.isTame());
      i++;
    }
  }
}