import java.util.ArrayList;
import java.util.List;


public class Prices {
        private static List<Ingredients> prices;
        
        public Prices(){
                prices = new ArrayList<Ingredients>();
                prices.add(new Ingredients("Feta", "cheeses", 10));
                prices.add(new Ingredients("Parmesan", "cheeses", 13));
                prices.add(new Ingredients("Mozarella", "cheeses", 12)); 
                prices.add(new Ingredients("Dor Blue", "cheeses", 18));
                prices.add(new Ingredients("Edam", "cheeses", 11));
                prices.add(new Ingredients("Brinza", "cheeses", 10));
                prices.add(new Ingredients("Bacon", "meat", 30));
                prices.add(new Ingredients("Prosciutto", "meat", 45));
                prices.add(new Ingredients("Salami", "meat", 40));
                prices.add(new Ingredients("Chicken Breast", "meat", 30));
                prices.add(new Ingredients("Ham", "meat", 44));
                prices.add(new Ingredients("Fresh mushrooms", "vegetables", 25));
                prices.add(new Ingredients("Smoked mushrooms", "vegetables", 25));
                prices.add(new Ingredients("Red onion", "vegetables", 20)); 
                prices.add(new Ingredients("Tomatoes", "vegetables", 15));
                prices.add(new Ingredients("Garlic", "vegetables", 10));
                prices.add(new Ingredients("Rucola", "vegetables", 17));
                prices.add(new Ingredients("Marinated Gogoshars", "vegetables", 12));
                prices.add(new Ingredients("Corn", "vegetables", 12));
                prices.add(new Ingredients("Parsley", "vegetables", 11));
                prices.add(new Ingredients("Chili pepper", "vegetables", 10));
        }
        
        public Ingredients getIngredient(String name){
                Ingredients ingridient = null;
                
                for(Ingredients ing : prices){
                        if(ing.getName().equals(name))
                                ingridient = ing;
                }
                return ingridient;
        }
}