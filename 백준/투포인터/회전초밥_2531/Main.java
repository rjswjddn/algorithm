package 백준.투포인터.회전초밥_2531;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public void solution() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 스시 개수
        int d = sc.nextInt(); // 초밥 가짓수
        int k = sc.nextInt(); // 연속 먹는 수
        int c = sc.nextInt(); // 보너스 초밥

        List<Integer> sushi = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            sushi.add(sc.nextInt());
        }

        int max = 0;

        for (int i = 0; i < N - 1 - k; i++) {
            List<Integer> eaten = new ArrayList<>();
            for (int j = i; j < i + k; j++) {
                if (eaten.contains(sushi.get(j))) {
                    continue;
                }
                eaten.add(sushi.get(j));
            }

            if (eaten.size() >= max) {
                if (!eaten.contains(c)) {
                    max = eaten.size() + 1;
                }
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        new Solution().solution();
    }
}
