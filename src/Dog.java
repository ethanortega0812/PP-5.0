public class Dog {
    private String name;
    private int age;
    private String breed;
    private double weightInPounds;
    private static int dogCount = 0;

    // Default constructor
    public Dog() {
        dogCount++;
    }

    // Full constructor
    public Dog(String name, int age, String breed, double weightInPounds) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weightInPounds = weightInPounds;
        dogCount++;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public void displayWeightInKilograms() {
        double weightInKilograms = weightInPounds * 0.453592;
        System.out.println(name + "'s weight in kilograms: " + weightInKilograms);
    }

    public String toString() {
        return name + " is a " + age + " year old " + breed + " weighing " + weightInPounds + " pounds.";
    }

    // Static method to get the dog count
    public static int getDogCount()
    {
        return dogCount;
    }
}
