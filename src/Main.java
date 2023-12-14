public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80.0);
        System.out.println(dog1.getBreed() + " " + dog1.getAge());
        Dog dog2 = new Dog("Piper", 3, "Australian Shepard", 45.0);
        System.out.println(dog2.getName() + " weighs " + dog2.getWeightInPounds() + " lbs");
        Dog dog3 = new Dog("Chop", 4, "Rottweiler", 70.0);
        System.out.println(dog3);
        //Dog dog = new Dog(dog1.getName(), dog1.getAge(), dog1.getBreed(),dog2.getWeightInPounds());

        System.out.println("I have: " + Dog.getDogCount() + " dogs");
        // System.out.println(dog4);
    }
}