import java.util.List;


public class Calculator {
        private Vegetables vegetableingredients;
        private Cheeses cheeseingredients;
        private Meat meatingredients;
        
        public Calculator(Vegetables vegetables, Cheeses cheeses, Meat meat){
                this.cheeseingredients = cheeses;
                this.vegetableingredients = vegetables;
                this.meatingredients = meat;
        }
        
        public int computePrice(){
                int price = 0;
                
                List<Ingredients> aux = this.vegetableingredients.getIngredients();
                for(Ingredients ing : aux){
                        try{
                                price += ing.getPrice();
                        }catch(Exception e){};
                }
                
                System.out.println("Vegetables price: " + price);
                
                aux.clear();
                aux = this.meatingredients.getIngredients();
                for(Ingredients ing : aux){
                        try{
                                price += ing.getPrice();
                        }catch(Exception e){};
                        
                }
                
                System.out.println("Meat price: " + price);
                
                aux.clear();
                aux = this.cheeseingredients.getIngredients();
                for(Ingredients ing : aux){
                        try{
                                price += ing.getPrice();
                        }catch(Exception e){};
                }
                
                System.out.println("Cheeses price: " + price);
                
                aux.clear();
                
                return price;
        }
}