import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * 
 * modified by Felipe Schol Negrin 
 * 
 * @version 15/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    private Random random;

    /**
     * Stockmanager with our 10 products we are selling. 
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        this.random = new Random();
    
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Apple iPhone 12"));
        stock.add(new Product(103, "Google Pixel 4A"));        
        stock.add(new Product(104, "Iphone 13 Pro Max"));
        stock.add(new Product(105, "Play Station 5"));
        stock.add(new Product(106, "Play Station 4"));
        stock.add(new Product(107, "Apple MacBook 2021"));
        stock.add(new Product(108, "Apple AirPods 2nd Gen"));
        stock.add(new Product(109, "Apple AirPods Pro"));
        stock.add(new Product(110, "Apple Watch Series 6"));
    }
    
    /**
     * It first prints out our product list, after it prints out how
     * many units have we bought for each product, and then it prints out
     * how many units have we sold of each product. 
     */
    public void runDemo()
    {
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    /**
     * Random amount of items bought
     */
    
    private void buyProducts()
    {
        for (int prodId = 101; prodId <=110; prodId++)
        stock.buyProduct(prodId, random.nextInt(11));
    }

    /**
     * Random amount of items sold
     */
    private void sellProducts()
    {
        for (int prodId = 101; prodId <= 110; prodId++)
        stock.sellProduct(prodId, random.nextInt(11));
    }    
}