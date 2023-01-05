public class Dog {
    public int weight;

    public void makeNoise() {
        if (weight < 10){
            System.out.println("Bark!");
        } else if (weight < 30){
            System.out.println("woof");
        } else {
            System.out.println("Wooffffff!");
        }
        
        
    }
}