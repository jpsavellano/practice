package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSum {

    void main() {
        IO.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 3)));
    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i + 1};
            } else{
                map.put(numbers[i], i + 1);
            }
        }
        throw new RuntimeException("No solution found!");
    }
}
