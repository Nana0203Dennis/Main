package Java;
public class DogLauncher{
    public static void main(String[] args) {
        Dog d = new Dog(15);

        // Dog[] dogs = new Dog[2];
        // dogs[0] = new Dog(8);
        // dogs[1] = new Dog(20);
        // dogs[1].makeNoise();

        Dog d2 = new Dog(100);
        Dog bigger = Dog.maxDog(d,d2);
        bigger.makeNoise();

        System.out.println(Dog.binomen);
    }
}