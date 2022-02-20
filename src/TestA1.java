import java.util.Scanner;

public class TestA1 {
    public static void main(String[] args) {

        Person person1 = new Person();

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("First Instance Prompts\n");

        System.out.printf("Enter person's name: ");
        person1.setFullName(keyboard.nextLine());

        System.out.printf("Enter person's year of birth: ");
        person1.setBirthYear(keyboard.nextInt());

        System.out.printf("Enter person's height in meters: ");
        person1.setHeight(keyboard.nextDouble());

        System.out.printf("Enter person's weight in kilograms: ");
        person1.setWeight(keyboard.nextDouble());
        keyboard.nextLine();

        System.out.printf("\nSecond Instance Prompts\n");

        System.out.printf("Enter person's name: ");
        String person2FullName = keyboard.nextLine();

        System.out.printf("Enter person's year of birth: ");
        int person2BirthYear = keyboard.nextInt();

        System.out.printf("Enter person's height in meters: ");
        double person2Height = keyboard.nextDouble();

        System.out.printf("Enter person's weight in kilograms: ");
        double person2Weight = keyboard.nextDouble();

        keyboard.close();

        Person person2 = new Person(person2FullName, person2BirthYear, person2Height, person2Weight);

        BMI bmi = new BMI();

        System.out.printf("\n1st Instance Output\n");
        System.out.printf("%16s", "Full Name: ");
        System.out.printf("%s%n", person1.getFullName());
        System.out.printf("%16s", "Age: ");
        System.out.printf("%s%n", bmi.calculateAge(person1));
        System.out.printf("%16s", "Year: ");
        System.out.printf("%s%n", person1.getBirthYear());
        System.out.printf("%16s", "Height: ");
        System.out.printf("%.2f%n", person1.getHeight());
        System.out.printf("%16s", "Weight: ");
        System.out.printf("%.2f%n", person1.getWeight());
        System.out.printf("%16s", "Classification: ");
        System.out.printf("%s%n", bmi.classifyBMI(person1));

        System.out.printf("\n2nd Instance Output\n");
        System.out.printf("%16s", "Full Name: ");
        System.out.printf("%s%n", person2.getFullName());
        System.out.printf("%16s", "Age: ");
        System.out.printf("%s%n", bmi.calculateAge(person2));
        System.out.printf("%16s", "Year: ");
        System.out.printf("%s%n", person2.getBirthYear());
        System.out.printf("%16s", "Height: ");
        System.out.printf("%.2f%n", person2.getHeight());
        System.out.printf("%16s", "Weight: ");
        System.out.printf("%.2f%n", person2.getWeight());
        System.out.printf("%16s", "Classification: ");
        System.out.printf("%s%n", bmi.classifyBMI(person2));
    }
}
