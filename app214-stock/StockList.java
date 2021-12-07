import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author 
 * 
 * modified by Felipe Schol Negrin  
 * 
 * @version 15/11/2021
 */
public class StockList
{
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    public void remove(int prodId)
    {
        Product product = findProduct(prodId);
        if(product != null)
        {
            stock.remove(product);
        }
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int prodId)
    {
        buyProduct(prodId, 1);
    }
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     */
    public void buyProduct(int prodId, int amount)
    {
        Product product = findProduct(prodId);
        
        if(product != null) 
        {
            if(product.getQuantity() < 1000)
            {
                product.increaseQuantity(amount);
                System.out.println("Bought " + amount + " units of " + product.getName());
            }
            else
            {
                System.out.println("Not enough shelf space for " + product.getName() +
                                  ", Please sell the existance stock");
            }
        }
        else
        {
            System.out.println("Couldn't find product");
        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int prodId)
    {
        for (Product product : stock)
        {
            if(product.getID() == prodId)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }
    
    /**
     * Sell many of the given product.
     * Show the before and after status of the product.
     */
    public void sellProduct(int prodId, int amount)
    {
        Product product = findProduct(prodId);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0 && product.getQuantity() >= amount)
            {
                product.decreaseQuantity(amount);
                System.out.println("Sold " + amount + " units of " 
                                   + product.getName());
            }
            else if(product.getQuantity() == 0)
            {
                System.out.println("The product " + product.getName() +
                                   " is out of stock.");
            }
            else
            {
                System.out.println("Can't sell " + amount + " of " + product.getName() 
                                   + " because only have " + product.getQuantity()
                                   + " units.");
            }
        }
        else
        {
            System.out.println("Couldn't find product");
        }
    }    

    public void search(String phrase)
    {
        if(phrase.contains("Apple"))
        {
            System.out.println(stock);
        }
    }
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. 
     */
    public int numberInStock(int prodId)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     */
    public void printProduct(int prodId)
    {
        Product product = findProduct(prodId);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    /**
     * Prints out our stock list heading.
     */
    public void printHeading()
    {
        System.out.println();
        System.out.println(" ==================================");
        System.out.println("      Schol's Store Stock List     ");
        System.out.println(" ==================================");
        System.out.println();
    }
}