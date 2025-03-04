// Java code to alternatively merge two strings 
public class MergeString { 
  
    // Function for alternatively merging two strings 
    public static String merge(String s1, String s2) 
    { 
        // To store the final string 
        StringBuilder result = new StringBuilder(); 
  
        // For every index in the strings 
        for (int i = 0; i < s1.length() || i < s2.length(); i++) { 
  
            // First choose the ith character of the 
            // first string if it exists 
            if (i < s1.length()) 
                result.append(s1.charAt(i)); 
  
            // Then choose the ith character of the 
            // second string if it exists 
            if (i < s2.length()) 
                result.append(s2.charAt(i)); 
        } 
  
        return result.toString(); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s1 = "geeks"; 
        String s2 = "forgeeks"; 
        System.out.println(merge(s1, s2)); 
    } 
    //No data chabfes
} 