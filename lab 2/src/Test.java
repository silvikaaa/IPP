import junit.framework.*;


public class Test extends TestCase{
        public Test(String name){
                super(name);
        }
        
        public void test1(){
                Cheeses cheeses = new Cheeses();
                Meat meat = new Meat();
                Vegetables vegetables = new Vegetables();
                
                Calculator theCalculator;
                
                cheeses.addIngredient(new Ingredients("Feta", "cheeses", 10));
                cheeses.addIngredient(new Ingredients("Mozarella", "cheeses", 12));
                cheeses.addIngredient(new Ingredients("Brinza", "cheeses", 10));
                
                meat.addIngredient(new Ingredients("Prosciutto", "meat", 45));
                
                vegetables.addIngredient(new Ingredients("Fresh mushrooms", "vegetables", 25));
                vegetables.addIngredient(new Ingredients("Rucola", "vegetables", 17));
                
                theCalculator = new Calculator(vegetables, cheeses, meat);
                
                // Price = 119
                
                assertEquals(119, theCalculator.computePrice(), 0);
        }
                
}
    
  