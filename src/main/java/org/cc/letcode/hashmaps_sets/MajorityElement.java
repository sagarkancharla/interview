package org.cc.letcode.hashmaps_sets;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {
    public static long majorityElement(int[] nums) {
        //boyer moore
        /*int count = 0, candidate = 0;
        for (int num : nums) {
            if(count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;*/
        Map<Integer, Long> map =
                Arrays.stream(nums)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long max = 0, key= 0;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max= entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    public static void main(String[] args) {
        long element = majorityElement(new int[]{2, 2, 1, 1, 1, 2, 8});
        System.out.println(element);
    }
}

