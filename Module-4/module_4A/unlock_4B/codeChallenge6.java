package module_4A.unlock_4B;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class codeChallenge6 {
    // Using  Java  Code,  check  for  Anagrams  in  these  strings:
    // "Despite commuting at the peek hour, she was able to keep to time"

        private static Set anagrams;

        public static Collection getAllAnagrams(String string) {
            anagrams = new HashSet();
            permutation("", string);
            return anagrams;
        }

        public static void main(String[] args) {
            Collection anagrams = getAllAnagrams("Despite commuting at the peek hour, she was able to keep to time");
            for (Object newWord: anagrams) System.out.println(newWord);
        }

        private static void permutation(String prefix, String suffix) {
            int suffixLength = suffix.length();
            if (suffixLength == 0) {
                anagrams.add(prefix);
            } else {
                for (int i = 0; i < suffixLength; i++) {
                    permutation(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1, suffixLength));
                }
            }
        }
    }

