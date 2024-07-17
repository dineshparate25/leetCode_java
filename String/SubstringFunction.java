package String;

public class SubstringFunction {

    public static void main(String args[]){  
        String s1="javatpoint";  
        String s2="dinesh@gmail.com";
        System.out.println(s1.substring(2,4));//returns va  
        System.out.println(s1.substring(2));//returns vatpoint  
        System.out.println(s2.substring(0,s2.indexOf('.')));
        }
    
}
