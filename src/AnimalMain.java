import java.util.Scanner;
import java.util.ArrayList;
public class AnimalMain {
    public static void main(String[] args) {


        ArrayList<Animal> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.println("Please enter a name:");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Is it a dog? yes or no: ");
            String isDogStr = scanner.nextLine();
            boolean isDog;
            if (isDogStr.equalsIgnoreCase("yes")) {
                isDog = true;
            } else {
                isDog = false;
            }

            Animal animal = new Animal(name, isDog);
            animalList.add(animal);
        }

        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }

    }

}
