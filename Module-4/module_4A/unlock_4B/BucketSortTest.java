package module_4A.unlock_4B;

import org.testng.annotations.Test;

public class BucketSortTest {
    @Test
    public void testBucketSortFor1To9() {
        int[] array = {
                2, 1, 5, 1, 2, 3, 4, 3, 5, 6, 7, 8, 5, 6, 7, 0
        };
        int[] sort = new codeChallenge8().sort(array, 0, 8);

        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort[i]; j++) {
                System.out.println(i);
            }
        }
    }
}
