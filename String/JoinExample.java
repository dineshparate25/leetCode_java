package String;

public class JoinExample {

    public static void main(String args[]){  
        String joinString1=String.join("-","welcome","to","javatpoint");  
        System.out.println(joinString1);

        String str = null;  
  
// one of the element is null however it will be treated as normal string  
str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");  
System.out.println(str);  
    }
}
