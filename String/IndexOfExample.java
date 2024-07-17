package String;

public class IndexOfExample {
 
        public static void main(String[] args) {          
            String s1 = "This is indexOf method";         
            // Passing char and index from  
            //check first occurence of character from fromIndex
   
            //13(from index) - 20(first occurence of e after 13)
            int index = s1.indexOf('e', 12); //Returns the index of this char  
            System.out.println("index of char "+index);  
            
            

            int index1=s1.indexOf("is",6);
            System.out.println("index of substring "+index1); 
        }  
    }
