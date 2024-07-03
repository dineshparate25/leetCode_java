public class ReverseVowelString {
    
    public static boolean isVowels(char c)
    {
        return (c == 'a' || c == 'A' || c == 'e'
        || c == 'E' || c == 'i' || c == 'I'
        || c == 'o' || c == 'O' || c == 'u'
        || c == 'U');
    }
    public static void main(String args[])
    {
        String str="RevjrsiStrong";

        char ch[]=str.toCharArray();

        String vowels="";
        int j=0;
        //add vowel into vowels 
        for(int i=0;i<ch.length;i++)
        {
            if(isVowels(ch[i]))
            {
                j++;
                vowels=vowels+ch[i];
            }
          
        }
        //System.out.println(vowels);
        //System.out.println(j);
        //add vowel into vowels 
        for(int i=0;i<ch.length;i++)
        {
            if(isVowels(ch[i]))
            {
                //System.out.println(vowels.charAt(--j));
               
                ch[i]=vowels.charAt(--j);
                System.out.println(j);
            }
          
        }
        //System.out.println(j);
        System.out.println(String.valueOf(ch));
    }
}
