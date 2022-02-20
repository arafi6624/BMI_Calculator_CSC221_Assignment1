/**
 * This class creates a Person object which stores the following information about a person:
 * 1. A person's full name.
 * 2. A person's year of birth.
 * 3. A person's height.
 * 4. A person's weight.
 *
 * @author Abdul Rafi
 * @version 1.0
 */
public class Person {
    /**
     * Stores the full name of a person as a String.
     */
    private String fullName;

    /**
     * Stores the year of birth of a person as an int.
     */
    private int birthYear;

    /**
     * Stores the height of a person as a double.
     */
    private double height;

    /**
     * Stores the weight f a person as a double.
     */
    private double weight;

    /**
     * Constructor for the Person class with default values for member variables.
     */
    public Person() {
        fullName = "";
        birthYear = -1;
        height = -1.0;
        weight = -1.0;
    }

    /**
     * Constructor for the Person class with parameter values for member variables.
     * @param fullName String parameter for full name
     * @param birthYear int parameter for birth year
     * @param height double parameter for height
     * @param weight double parameter for weight
     */
    public Person(String fullName, int birthYear, double height, double weight) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Sets the fullName member variable's value equal to the passed in fullName parameter.
     * @param fullName String parameter for the full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the full name of the Person object from its fullName member variable.
     * @return Returns the fullName member variable
     */
    public String getFullName() { return fullName; }

    /**
     * Sets the birthYear member variable's value equal to the passed in birthYear parameter.
     * @param birthYear int parameter for the birth year
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * Gets the brith year of the Person object from its birthYear member variable.
     * @return Returns the birthYear member variable
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the height member variable's value equal to the passed in height parameter.
     * @param height double parameter for the height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the height of the Person object from its height member variable.
     * @return Returns the height member variable
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the weight member variable's value equal to the passed in weight parameter.
     * @param weight double parameter for the weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the weight of the Person object from its weight member variable.
     * @return Returns the weight member variable
     */
    public double getWeight() {
        return weight;
    }

}
