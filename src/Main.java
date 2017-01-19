/**
 * Created by Savannah on 1/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();
        petStore.Buy("dog", "corgie", 200);
        petStore.Buy("fish", "beta", 300);
        petStore.Buy("cat", "persian", 300);
        petStore.Buy("cat", "hairless", 400);
        petStore.Buy("dog", "german sheppard", 100);
        System.out.println(petStore.Inventory());
        petStore.Sell("cat");
        String inventory = petStore.Inventory();
        System.out.println(petStore.Inventory());
    }
}

