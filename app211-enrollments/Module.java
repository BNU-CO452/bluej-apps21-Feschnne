
/**
 * Write a description of class Module here.
 *
 * @author Felipe Schol
 * @version 17.10.2021
 */
public class Module
{
    // Variables for the code, title and credit
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }

    /**
     * The next three methods to get the value of the code,
     * title and credit variables.
     */
    public String getCode()
    {
        return this.code;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public int getCredit()
    {
        return this.credit;
    }
    
    /* Method to set a value for the module's credit
     * 
     */
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println(" Credit: "+ credit);
    }
}
