
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

    /**
     * Stockmanager with our 10 products we are selling. 
     */
    public StockDemo()
    {
        this.stock = new StockList();
    
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
        runDemo();
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
     * Specifies how many units have we bought for each product. 
     */
    
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
        stock.buyProduct(102, 200);
        stock.buyProduct(103, 100);
        stock.buyProduct(104, 800);
        stock.buyProduct(105, 250);
        stock.buyProduct(106, 450);
        stock.buyProduct(107, 600);
        stock.buyProduct(108, 200);
        stock.buyProduct(109, 900);
        stock.buyProduct(110, 150);
    }

    /**
     * Specifies how many units have we sold for each product.
     */
    private void sellProducts()
    {
        stock.sellProduct(101, 300);
        stock.sellProduct(102, 125);
        stock.sellProduct(103, 71);
        stock.sellProduct(104, 486);
        stock.sellProduct(105, 121);
        stock.sellProduct(106, 371);
        stock.sellProduct(107, 456);
        stock.sellProduct(108, 105);
        stock.sellProduct(109, 717);
        stock.sellProduct(110, 56);
    }    
}