import java.util.LinkedHashSet;
 
  
//Create RemoveDuplicatesExample3 for removing duplicate characters  
class RemoveDuplicate   
{   
    //Create removeDuplicates() method for removing duplicates using LinkedHashSet  
    static void removeDuplicates(String str)   
    {     
        //Create LinkedHashSet of type character   
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
        //Add each character of the string into LinkedHashSet   
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            
        // print the string after removing duplicate characters   
        for(Character ch : set)   
            System.out.print(ch);   
            //kjndd
    }   
        
    //main() method start  
    public static void main(String args[])   
    {   
        //Create string variable with default value  
        String str = "javaTpoint is the best learning website";   
        //removeDuplicates() method by passing the string as an argument   
        removeDuplicates(str);   
    }   
}  