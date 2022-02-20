import java.util.Calendar;

/**
 * This class creates a BMI object which has the following three methods:
 * 1. calculateAge
 * 2. calculateBMI
 * 3. classifyBMI
 * All three methods take in the Person object as a parameter and uses its methods to calculate the age,
 * BMI, and BMI classification of the object.
 *
 * @author Abdul Rafi
 * @version 1.0
 */
public class BMI {

    /**
     * Calculates the age of a person by using the getBirthYear method of the person class and the current year.
     * @param person A Person class object
     * @return Returns the age of the person as an int
     */
    public int calculateAge(final Person person) {
        Calendar calendar = Calendar.getInstance(); //Initializes the calendar object
        int currentYear = calendar.get(Calendar.YEAR); //Retrieves the current year
        return currentYear - person.getBirthYear(); //Returns the calculated age
    }

    /**
     * Calculates the BMI by using the Person class methods getWeight and getHeight.
     * @param person A Person class object
     * @return Returns the BMI of a person as a double
     */
    public double calculateBMI(final Person person) {
        return person.getWeight()/(person.getHeight() * person.getHeight()); //Returns the calculated BMI
    }

    /**
     * Classifies the BMI of a person by using the calculateBMI method
     * @param person A Person class object
     * @return Returns a String classification of the calculated BMI based on a pre-determined index
     */
    public String classifyBMI(final Person person) {
        double BMI = calculateBMI(person); //Passes the person object into the calculateBMI method and stores the output
        if(BMI < 18.5) {
            return "Underweight"; //Returns 'underweight' if BMI is under 18.5
        } else if(BMI >= 18.5 && BMI < 25) {
            return "Normal Weight"; //Returns 'Normal Weight' if BMI is between 18.5 and 25
        } else if(BMI >= 25 && BMI <= 30) {
            return "Overweight"; //Returns 'Overweight' if BMI is between 25 and 30
        } else {
            return "Obese"; //Returns 'Obese' if failed to return any of the above classifications
        }
    }
}
