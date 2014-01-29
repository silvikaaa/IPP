
public class Ingredients {
        private String name;
        private String category;
        private int price;
        
        public Ingredients(String name, String category, int price){
                this.name = name;
                this.category = category;
                this.price = price;
        }
        
        public Ingredients(){
                this.name = null;
                this.category = null;
                this.price = 0;
        }
        
        public String getName(){
                return this.name;
        }
        
        public int getPrice(){
                return this.price;
        }
        
        public String getCategory(){
                return this.category;
        }
        
        public void setName(String name){
                this.name = name;
        }
        
        public void setPrice(int price){
                this.price = price;
        }
        
        public void setCategory(String category){
                this.category = category;
        }
}