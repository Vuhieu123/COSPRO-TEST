package test1;

import java.util.*;

public class Main {

    public int[] solution(String[] shirtSize) {
        int[] answer = {};
        String[] sizeOrder = {"XS", "S", "M", "L", "XL", "XXL"};
        Map<String, Integer> sizeMap = new HashMap<>();
        for (int i = 0; i < sizeOrder.length; i++) {
            sizeMap.put(sizeOrder[i], i);
        }
        int[] sizeCount = new int[sizeOrder.length];
        for (String size : shirtSize) {
            if (sizeMap.containsKey(size)) {
                sizeCount[sizeMap.get(size)]++;
            }
        }
        answer = new int[sizeOrder.length];
        for (int i = 0; i < sizeOrder.length; i++) {
            answer[i] = sizeCount[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);

        System.out.println("Answer" + Arrays.toString(ret));
    }

}
