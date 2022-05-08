package WebPageExericse.Javalin;

public class Groceryitem {
    /*
    private is 1 of 4 access modifers
     */
    private String itemName;

    public Groceryitem(){

    }
    public Groceryitem(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
}
