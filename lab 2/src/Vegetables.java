import java.util.ArrayList;
import java.util.List;


public class Vegetables {
        private static Ingredients ingredient1;
        private static Ingredients ingredient2;
        private static Ingredients ingredient3;
        private static Ingredients ingredient4;
        private static Ingredients ingredient5;
        private static boolean flag1 = false;
        private static boolean flag2 = false;
        private static boolean flag3 = false;
        private static boolean flag4 = false;
        private static boolean flag5 = false;
        
        private void setIngr1(Ingredients ingredient){
                ingredient1 = ingredient;
                flag1 = true;
        }
        
        private void setIngr2(Ingredients ingredient){
                ingredient2 = ingredient;
                flag2 = true;
        }
        
        private void setIngr3(Ingredients ingredient){
                ingredient3 = ingredient;
                flag3 = true;
        }
        
        private void setIngr4(Ingredients ingredient){
                ingredient4 = ingredient;
                flag4 = true;
        }
        
        private void setIngr5(Ingredients ingredient){
                ingredient5 = ingredient;
                flag5 = true;
        }
        
        public String addIngredient(Ingredients ingredient){
                String response = "Yes";
                if(!flag1)
                        setIngr1(ingredient);
                else
                        if(!flag2)
                                setIngr2(ingredient);
                        else
                                if(!flag3)
                                        setIngr3(ingredient);
                                else
                                        if(!flag4)
                                                setIngr4(ingredient);
                                        else
                                                if(!flag5)
                                                        setIngr5(ingredient);
                                                else
                                                        response = "No";
                return response;
        }
        
        public void flush(){
                flag1 = false;
                flag2 = false;
                flag3 = false;
                flag4 = false;
                flag5 = false;
        }
        
        public List<Ingredients> getIngredients(){
                List<Ingredients> listOfIngredients = new ArrayList<Ingredients>();
                listOfIngredients.add(ingredient1);
                listOfIngredients.add(ingredient2);
                listOfIngredients.add(ingredient3);
                listOfIngredients.add(ingredient4);
                listOfIngredients.add(ingredient5);
                
                return listOfIngredients;
        }
}