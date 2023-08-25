package Tasks;

public class Task_6 {
    public static void main(String[] args) {
        String word = "democracy";
        StringBuilder newWord = new StringBuilder(word);
        String reversedStr = newWord.reverse().toString();
        System.out.println(word.substring(5,8));
        System.out.println(newWord);
        System.out.println(reversedStr.substring(4,8));

    }
}
