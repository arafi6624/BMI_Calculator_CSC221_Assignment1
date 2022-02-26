import java.util.Scanner;

/**
 * This class contains the main method which tests the Person and BMI classes.
 *
 * @author Abdul Rafi
 * @version 1.0
 */
public class TestA1 {

    /**
     * The main method that executes when the class is compiled.
     * @param args Any command-line arguments passed in when the class is run
     */
    public static void main(String[] args) {

        Person person1 = new Person(); //Initializes a new Person class object

        Scanner keyboard = new Scanner(System.in); //Initializes a new Scanner object for command-line inputs

        System.out.printf("First Instance Prompts\n");

        System.out.printf("Enter person's name: "); //Prompts the user to enter a person's full name
        person1.setFullName(keyboard.nextLine()); //Takes in an input from the user and passes it as a parameter for the setFullName method of the person1 object

        System.out.printf("Enter person's year of birth: "); //Prompts the user to enter a person's birth year
        person1.setBirthYear(keyboard.nextInt()); //Takes in an input from the user and passes it as a parameter for the setBirthYear method of the person1 object

        System.out.printf("Enter person's height in meters: "); //Prompts the user to enter a person's height
        person1.setHeight(keyboard.nextDouble()); //Takes in an input from the user and passes it as a parameter for the setHeight method of the person1 object

        System.out.printf("Enter person's weight in kilograms: "); //Prompts the user to enter a person's weight
        person1.setWeight(keyboard.nextDouble()); //Takes in an input from the user and passes it as a parameter for the setWeight method of the person1 object
        keyboard.nextLine();

        System.out.printf("\nSecond Instance Prompts\n");

        System.out.printf("Enter person's name: "); //Prompts the user to enter a person's name
        String person2FullName = keyboard.nextLine(); //Takes in an input from the user and stores it in the String variable person2FullName

        System.out.printf("Enter person's year of birth: "); //Prompts the user to enter a person's birth year
        int person2BirthYear = keyboard.nextInt(); //Takes in an input from the user and stores it in the int variable person2BirthYear

        System.out.printf("Enter person's height in meters: "); //Prompts the user to enter a person's height
        double person2Height = keyboard.nextDouble(); //Takes in an input from the user and stores it in the double variable person2Height

        System.out.printf("Enter person's weight in kilograms: "); //Prompts the user to enter a person's weight
        double person2Weight = keyboard.nextDouble(); //Takes in an input from the user and stores it in the double variable person2Weight

        keyboard.close(); //Closes the Scanner keyboard

        Person person2 = new Person(person2FullName, person2BirthYear, person2Height, person2Weight); //Initializes the person2 object with specified parameters

        BMI bmi = new BMI(); //Initializes a BMI class object

        System.out.printf("\n1st Instance Output\n");
        System.out.printf("%16s", "Full Name: ");
        System.out.printf("%s%n", person1.getFullName()); //Prints the full name from the person1 object using the getFullName method
        System.out.printf("%16s", "Age: ");
        System.out.printf("%d%n", bmi.calculateAge(person1)); //Calculates the age by passing in the person1 object into the calculateAge method of bmi and prints it
        System.out.printf("%16s", "Year: ");
        System.out.printf("%d%n", person1.getBirthYear()); //Prints the birth year from the person1 object using the getBirthYear method
        System.out.printf("%16s", "Height: ");
        System.out.printf("%.2f%n", person1.getHeight()); //Prints the height from the person1 object using the getHeight method
        System.out.printf("%16s", "Weight: ");
        System.out.printf("%.2f%n", person1.getWeight()); //Prints the weight from the person1 object using the getWeight method
        System.out.printf("%16s", "Classification: ");
        System.out.printf("%s%n", bmi.classifyBMI(person1)); //Classifies the BMI using the person1 object as the parameter for the classifyBMI method and prints it

        System.out.printf("\n2nd Instance Output\n");
        System.out.printf("%16s", "Full Name: ");
        System.out.printf("%s%n", person2.getFullName()); //Prints the full name from the person2 object using the getFullName method
        System.out.printf("%16s", "Age: ");
        System.out.printf("%d%n", bmi.calculateAge(person2)); //Calculates the age by passing in the person2 object into the calculateAge method of bmi and prints it
        System.out.printf("%16s", "Year: ");
        System.out.printf("%d%n", person2.getBirthYear()); //Prints the birth year from the person2 object using the getBirthYear method
        System.out.printf("%16s", "Height: ");
        System.out.printf("%.2f%n", person2.getHeight()); //Prints the height from the person2 object using the getHeight method
        System.out.printf("%16s", "Weight: ");
        System.out.printf("%.2f%n", person2.getWeight()); //Prints the weight from the person2 object using the getWeight method
        System.out.printf("%16s", "Classification: ");
        System.out.printf("%s%n", bmi.classifyBMI(person2)); //Classifies the BMI using the person2 object as the parameter for the classifyBMI method and prints it
    }
}
