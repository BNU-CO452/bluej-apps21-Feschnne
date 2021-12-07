
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Felipe Schol Negrin
 * @version 29.11.2021
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("add"))
        {
            
            int prodId = reader.getInt("Please enter the ID: ");
            String prodName = reader.getString("Please enter the name of the product: ");
            Product product = new Product(prodId, prodName); 
            
            stock.add(product);
            
            System.out.println("----------------------------------------");
            System.out.println("Product " + product.getID() + ", "
            + product.getName() + " has been ADDED");
            System.out.println("----------------------------------------");
            
        }
        
        else if (choice.equals("remove"))
        {
            int prodId = reader.getInt("Please enter the ID: ");
            Product product = stock.findProduct(prodId);
            
            stock.remove(prodId);
            
            System.out.println("----------------------------------------");
            System.out.println("Product " + product.getID() + ", " 
            + product.getName() + " has beem REMOVED"); 
            System.out.println("----------------------------------------");
        }
        
        else if (choice.equals("buy"))
        {
            int amount = reader.getInt("How many units do you want to buy: ");
            int prodId = reader.getInt("Please enter the ID: ");
            Product product = stock.findProduct(prodId);
            
            stock.buyProduct(prodId, amount);
            
            System.out.println("----------------------------------------");
            System.out.println(amount + " units of " + product.getID() + ", " 
            + product.getName() + " have been BOUGHT");
            System.out.println("----------------------------------------");
        }
        
        else if (choice.equals("sell"))
        {
            int amount = reader.getInt("How many units do you want to sell: ");
            int prodId = reader.getInt("Please enter the ID: ");
            Product product = stock.findProduct(prodId);
            
            stock.sellProduct(prodId, amount);
            
            System.out.println("----------------------------------------");
            System.out.println(amount + " units of" + product.getID() + ", " 
            + product.getName() + " have been SOLD");
            System.out.println("----------------------------------------");
            
        }
        
        else if (choice.equals("search"))
        {
            int prodId = reader.getInt("Please enter the ID of the item you are looking for: ");
            Product product = stock.findProduct(prodId);
            
            System.out.println("----------------------------------------");
            System.out.println("ID searched " + product.getID()
            + " ,this product is " + product.getName());
            System.out.println("----------------------------------------");
            
            
        }
        else if (choice.equals("print"))
        {
            stock.print();
        }
        
        return false;
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Sell:       Sell stock");
        System.out.println("    Buy:        Buy stock");
        System.out.println("    Search:     Search through ID");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("================================");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("    by Felipe Schol Negrin");
        System.out.println("================================");
    }
}