import java.util.ArrayList;
import java.util.List;


public class Meat {
        private static Ingredients ingredient1;
        private static Ingredients ingredient2;
        private static boolean flag1 = false;
        private static boolean flag2 = false;
        
        private void setIngr1(Ingredients ingredient){
                ingredient1 = ingredient;
                flag1 = true;
        }
        
        private void setIngr2(Ingredients ingredient){
                ingredient2 = ingredient;
                flag2 = true;
        }
        
        public String addIngredient(Ingredients ingredient){
                String response = "Yes";
                if(!flag1)
                        setIngr1(ingredient);
                else
                        if(!flag2)
                                setIngr2(ingredient);
                        else
                                response = "No";
                return response;
        }
        
        public void flush(){
                flag1 = false;
                flag2 = false;
        }
        
        public List<Ingredients> getIngredients(){
                List<Ingredients> listOfIngredients = new ArrayList<Ingredients>();
                listOfIngredients.add(ingredient1);
                listOfIngredients.add(ingredient2);
                
                return listOfIngredients;
        }
}