package sunday_roast;

import java.util.ArrayList;

public class SuperSecretSundayRoast {

    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<String> guestList = new ArrayList<String>();
    public void addIngredient(Ingredient i){
        guestList.add("Chicken");
        guestList.add("Roast Potatoes");
        guestList.add("Broccoli");
        guestList.add("Cauliflower");
        guestList.add("Peas");
        guestList.add("Carrots");
        guestList.add("Cabbages");
        guestList.add("Parsnips");
        guestList.add("Secret Ingredient");
        if (guestList.contains(i.ingredientName)){
        this.ingredients.add(i);
        } else {
            System.out.println("EXTERMINATE! " + i.ingredientName);
        }

    }

    public ArrayList<Ingredient> getIngredients(String password){
        if (password.equals("strongpassword123")){
        return this.ingredients;
        } else return null;
    }
}
