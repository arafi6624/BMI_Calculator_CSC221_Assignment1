import java.util.Calendar;

/**
 * This class creates a BMI object which has the following three methods:
 * 1. calculateAge
 * 2. calculateBMI
 * 3. classifyBMI
 * All three methods take in the Person object as a parameter and uses its methods to calculate the age, BMI, and BMI classification of the object.
 *
 * @author Abdul Rafi
 * @version 1.0
 */
public class BMI {
    public int calculateAge(final Person person) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - person.getBirthYear();
    }

    public double calculateBMI(final Person person) {
        return person.getWeight()/(person.getHeight() * person.getHeight());
    }

    public String classifyBMI(final Person person) {
        double BMI = calculateBMI(person);
        if(BMI < 18.5) {
            return "Underweight";
        } else if(BMI >= 18.5 && BMI < 25) {
            return "Normal Weight";
        } else if(BMI >= 25 && BMI <= 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
