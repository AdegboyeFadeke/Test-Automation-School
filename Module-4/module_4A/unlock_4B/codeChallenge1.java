package module_4A.unlock_4B;

public class codeChallenge1 {
    //Write  Java  code  to  check  if  racecar  and  10801  is  a palindromes


    public static boolean isPalindrome(String palinds){
        // create an empty variable to store the reverse of the original string
        String reverse = "";
        // create a boolean variable for the answer
        boolean newWord = false;

        for (int i = palinds.length() - 1; i>= 0; i--) {
            reverse = reverse + palinds.charAt(i);
        }
        // check if the two strings are equal
        if (palinds.equals(reverse)){
            newWord = true;
        }
        return newWord;
    }
    public static void main(String[] args) {
        String number = "10801";
        String palinds = "racecar";
        String anotherWord = "great";

     //convert the string to lowercase
        palinds = palinds.toLowerCase();
        number = number.toLowerCase();
        anotherWord  = anotherWord .toLowerCase();

        boolean result = isPalindrome(palinds);
        boolean result2 = isPalindrome(number);
        boolean result3 = isPalindrome(anotherWord );
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
}
