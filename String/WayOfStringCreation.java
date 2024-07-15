package String;
public class WayOfStringCreation {
    
    public static void main(String args[])
    {
        //String Literals
        String str="Literal";
        String str1="Literal";

        System.out.println(str1);
        System.out.println(str);

        //By Using new keyword

        String s=new String("Literal");
        String s1=new String("Literal");


        System.out.println(str == str1);  // true, both refer to the same interned string
        System.out.println(str == s);     // false, 's' refers to a different object
        System.out.println(str.equals(s)); // true, contents are the same
        System.out.println(s1.equals(s)); //true, contents are the same

    }
}
