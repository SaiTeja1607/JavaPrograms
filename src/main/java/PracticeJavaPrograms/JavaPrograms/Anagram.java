import java.util.Arrays;
class Main {
   
    public static void main(String[] args)
    {
        String one= "angles";
        String two= "anlegs";
        if(order(one).equals(order(two)))
        {
            System.out.println("is a anagram");
        }
        else System.out.println("not an anagram");
    }
    
    public static String order(String word)
    {
        String[] letters= word.split("");
        Arrays.sort(letters);
        String returnWord="";
        for(int i=0; i<letters.length; i++)
        {
            returnWord+= letters[i];
        }
        return returnWord;
    }
}
