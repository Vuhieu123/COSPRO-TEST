package test2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public int solution(int price, String grade) {
        int answer = 0;
        Map<String,Double> discoutMap = new HashMap<>();
        discoutMap.put("S", 0.05);
        discoutMap.put("G", 0.1);
        discoutMap.put("V", 0.15);

        if(discoutMap.containsKey(grade)){
            double discountRate = discoutMap.get(grade);
            answer = (int) (Math.floor(price*(1 - discountRate)));
        }else{
            answer = price;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);

        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);

        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }

}
