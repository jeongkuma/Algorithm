package algorithm.programmers.skillCheck;


/**
 * skill chek 정답 찾아서 해보자..
 *
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *
 * 제한 사항
 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
 * 입출력 예
 * n	return
 * 121	144
 * 3	-1
 * 입출력 예 설명
 * 입출력 예#1
 * 121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
 *
 * 입출력 예#2
 * 3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
 *
 */
public class Level1 {
    public static void main(String[] args) {
        System.out.println(practice(122));
        System.out.println(practice(158));
        System.out.println(practice(32335));
        System.out.println(practice(741));
        System.out.println(practice(12));
        System.out.println(practice(445));
        System.out.println(practice(44));
        System.out.println(practice(55));
        System.out.println(practice(898));
        System.out.println(practice(88));
    }

    public static long practice(long n) {
        double temp = Math.sqrt(n);

        System.out.println(temp);
        System.out.println(Math.pow(temp, 2));
        System.out.println(n == Math.pow(temp, 2));
        System.out.println((Math.pow((temp + 1), 2)));



        return n == Math.pow(temp, 2) ? (long) (Math.pow((temp + 1), 2)) : -1;
    }

    public long solution(long n) {
        long answer = 0;
        return answer;
    }
}
