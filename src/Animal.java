/**
 * Created by Savannah on 1/19/2017.
 */
public abstract class Animal {
    String name;
    String breed;
    int cost;
    public String getName(){
        return name;
    }
    public void setName(String name2){
        name = name2;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed2){
        breed = breed2;
    }
    public int getPrice(){
        return cost;
    }
    public void setPrice(int price2){
        cost = price2;
    }
}
