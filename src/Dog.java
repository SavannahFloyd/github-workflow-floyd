/**
 * Created by Savannah on 1/18/2017.
 */
public class Dog extends Animal{
    public Dog(String name, String breed, int cost){
        this.setName("Dog");
        this.setBreed(breed);
        this.setPrice(cost);
    }
    public void Bark(){
        System.out.println("Bark");
    }
    public void Beg(){
        System.out.println("The dog begs for your food!");
    }
}
