import java.util.*;

class FindEvenNumbers {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    // All three positions must be different
                    if (i == j || j == k || i == k)
                        continue;

                    // First digit cannot be 0
                    if (digits[i] == 0)
                        continue;

                    // Last digit must be even
                    if (digits[k] % 2 != 0)
                        continue;

                    int num = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];

                    set.add(num);
                }
            }
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}