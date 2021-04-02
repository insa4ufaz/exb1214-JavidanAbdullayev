public class Palindrome{
    public static boolean is_palindrome(String s)
    {
       int length = s.length()
       for(int i=0; i<length/2; i++){
         if(s.charAt(i) != s.charAt(length-1-i)){
           return false;
         }
       }
        return true;
    }

    public static void main(String[]args){
      if(is_palindrome(args[0])){
        System.out.println("is Palindrome");
      }
      else{
        System.out.println("not Palindrome");

      }
    }
}
        