package Java;

public class Dog {
    public int weight;
        // instance variable, you can have as many of these as you want.

    public Dog(int w){
        // integer constructor ( this is similar to a mehod, but not a method.)
        // This determines how to instantiate the class.
        weight = w;
    }

    public void makeNoise() {
        // non static method, INstance method.
        // if this method is going to be invoked by an instance of the class, 
        // then it should be non - static.
        if (weight < 10){
            System.out.println("Bark!");
        } else if (weight < 30){
            System.out.println("woof");
        } else {
            System.out.println("Wooffffff!");
        }
        
        
    }
}