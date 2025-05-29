package 프로그래머스.완전탐색.카펫_42842;

public class Solution {
    public int[] solution(int brown, int yellow) {
        // 갈색 세로는 최소 1
        // 가로의 길이를 늘려가다가 brown의 수가 떨이지면 세로 늘리기
        // 갈색의 총 개수 = (세로) * 2 + (가로) * 2 + 4(모서리)
        // 노란색이 세로의 개수로 나누어지지 않으면 세로 한칸 늘리기


        int[] answer = cal(yellow, brown, 1);
        return answer;
    }

    public int[] cal(int yellow, int brown, int brownY) {
        if (yellow%brownY != 0) {
            return cal(yellow, brown, ++brownY);
        }

        int brownX = yellow / brownY;

        int calBrown = (brownX * 2) + (brownY * 2) + 4;

        if (calBrown == brown) {
            return new int[] {brownX + 2, brownY + 2};
        } else {
            return cal(yellow, brown, ++brownY);
        }
    }
}
