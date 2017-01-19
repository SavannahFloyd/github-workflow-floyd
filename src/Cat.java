/**
 * Created by Savannah on 1/18/2017.
 */
public class Cat extends Animal{
    public Cat(String name, String breed, int cost){
         this.setName("Cat");
        this.setBreed(breed);
         this.setPrice(cost);
         }
    public void Meow(){
        System.out.println("Meow");
    }
    public void Purr(){
        System.out.println("Purr");
    }
}
