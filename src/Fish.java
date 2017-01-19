/**
 * Created by Savannah on 1/18/2017.
 */
public class Fish extends Animal{
    String name;
    public Fish(String name, String breed, int cost){
        this.setName("Fish");
        this.setBreed(breed);
        this.setPrice(cost);
    }
    public void Swim(){
        System.out.println("The fish swims");
    }
    public void Blub(){
        System.out.println("Blub blub blub");
    }
}
