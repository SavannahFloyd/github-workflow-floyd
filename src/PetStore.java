/**
 * Created by Savannah on 1/18/2017.
 */
import java.util.ArrayList;
public class PetStore {
    private ArrayList AnimalInventory;
    public PetStore(){
        AnimalInventory = new ArrayList();
    }
    //buy method
    public void Buy(String name, String breed, int cost){
        if (name.equals("cat")){
            AnimalInventory.add(new Cat(name, breed, cost));
        }
        else if(name.equals("dog")){
            AnimalInventory.add(new Dog(name, breed, cost));
        }
        else if(name.equals("fish")){
            AnimalInventory.add(new Fish(name, breed, cost));
        }
    }
    //sell method
    public void Sell(String name){
        for (int i = 0; i > AnimalInventory.size(); i++){
            if (AnimalInventory.get(i) == name){
                AnimalInventory.set(i, null);
            }
        }
    }
    public String Inventory(){
        String string = "Number of Animals in Store: " + AnimalInventory.size() + "\n" + "Animals available: " + "\n" + AnimalInventory;
        return string;
    }
}

