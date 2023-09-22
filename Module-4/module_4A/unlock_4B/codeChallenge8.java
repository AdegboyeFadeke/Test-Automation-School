package module_4A.unlock_4B;

import org.testng.annotations.Test;

public class codeChallenge8 {
    //Given a collection of 1 million integers, all ranging between1 to 9,
    // sort them in Big O(n) time
    public int[] sort(int[] array, int min, int max) {
        int range = max - min + 1;
        int[] result = new int[range];
        for (int i: array) {
            result[i]++;
        }
        return result;
    }
}

