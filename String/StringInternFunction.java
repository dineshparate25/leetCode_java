package String;

public class StringInternFunction {

    /**
     * @return
     */
    public static boolean internMethod()
    {
        String str = new String("Welcome to JavaTpoint").intern(); // statement - 1  
        String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
        if(str1 == str) // prints true 
        { return true;
        } else{
            return false;
        }      
    }
    public static void main(String[] args) {
        boolean flag=internMethod();

        if(flag==true)
        {
            System.out.println("Intern method used");
        }
        else{
            System.out.println("Intern method not used");
        }
        }
    
}
