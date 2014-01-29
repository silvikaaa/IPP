import java.util.List;
import java.util.Random;


public class Program {
      
        private Calculator priceCalculator;
        private Vegetables vegetables;
        private Meat meat;
        private Cheeses cheeses; 
        private Prices prices;
        private List<String> choices;
        
        public Program(String userName, List<String> choices){
                System.out.println(choices.size());

                this.choices = choices;
                vegetables = new Vegetables();
                cheeses = new Cheeses();
                meat = new Meat();
                prices = new Prices();
        }
        
        private String initPriceCalculator(){
                String response = "Yes";
                for(String name : this.choices){
                        Ingredients ing = this.prices.getIngredient(name);
                        if(ing.getCategory().equals("vegetables")){
                                response = this.vegetables.addIngredient(ing);
                                if(response.equals("No"))
                                        return "Limit is exceeded. Max nr types of vegetables is 5";
                        }
                        if(ing.getCategory().equals("meat")){
                                response = this.meat.addIngredient(ing);
                                if(response.equals("No"))
                                        return "Limit is exceeded. Max nr types of meat is 2";
                        }
                        if(ing.getCategory().equals("cheeses")){
                                response = this.cheeses.addIngredient(ing);
                                if(response.equals("No"))
                                        return "Limit is exceeded. Max nr types of cheeses is 3";
                        }
                }
                
                priceCalculator = new Calculator(this.vegetables, this.cheeses, this.meat);
                return response;
        }
        
        public void flush(){
                this.vegetables.flush();
                this.cheeses.flush();
                this.meat.flush();
        }
        
        public String getPrice(){
                String response = initPriceCalculator();
                if(!response.equals("Yes"))
                        return response;
                else
                        return String.valueOf("PRICE: " + priceCalculator.computePrice());
        }
        
        public String getRandomNumber(){
                Random rand = new Random();
                return String.valueOf(rand.nextInt(9) + 1) + String.valueOf(rand.nextInt(9) + 1) + String.valueOf(rand.nextInt(9) + 1);
        }
}