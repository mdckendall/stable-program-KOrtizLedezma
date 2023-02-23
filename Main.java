import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the address of the stable?");
    String address = scanner.nextLine();
    Stable stable = new Stable(address);

    while (true) {
      System.out.println("Do you wish to add a horse to the stable?");
      String input = scanner.nextLine();

      if (input.equalsIgnoreCase("n")) {
        break;
      }

      System.out.println("What is the name of the horse?");
      String name = scanner.nextLine();

      System.out.println("What is the weight of the horse?");
      double weight = scanner.nextDouble();
      scanner.nextLine(); // consume the newline character

      System.out.println("Enter true if the horse is tame or false if it is not.");
      boolean isTame = scanner.nextBoolean();
      scanner.nextLine(); // consume the newline character

      Horse horse = new Horse(name, weight, isTame);
      stable.addHorse(horse);
    }
    stable.showHorses();
  }
}
