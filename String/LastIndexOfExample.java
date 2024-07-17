package String;

public class LastIndexOfExample {
            
            // Passing char and index from  
            //check first occurence of character from fromIndex
   
           
            public static void main(String[] args) {
                
            String s1 = "This is indexOf method is"; 
            int index = s1.lastIndexOf('e', 20); //Returns the index of this char  
            System.out.println("index of char "+index);  
    
            int index1=s1.lastIndexOf("is",20);
            System.out.println("index of substring "+index1);
            
            System.out.println(s1.length());
            }  
}
