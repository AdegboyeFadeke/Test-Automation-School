package module_4A.unlock_4B;

public class codeChallenge2 {
    //Reverse the position of words in "I am the best AutomationTester" using recursion
    public void reverseWordPost(String word){
        if((word ==null)||(word.length() <= 1)) System.out.println(word);
        else {
            System.out.println(word.charAt(word.length()-1));
            reverseWordPost(word.substring(0,word.length()-1));
        }
    }

    public static void main(String[] args) {
        String reverseWord = "I am the best AutomationTester";
        codeChallenge2 result = new codeChallenge2();
        result.reverseWordPost(reverseWord);
    }

}
