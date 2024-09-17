package training.day6;

/*
Day 6 조건문, 반복문
코딩테스트 연습 > 코딩 기초 트레이닝 > 수 조작하기 2

정수 배열 numLog가 주어집니다.
처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
"w" : 수에 1을 더한다.
"s" : 수에 1을 뺀다.
"d" : 수에 10을 더한다.
"a" : 수에 10을 뺀다.
그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다.
즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.
주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.

제한사항
2 ≤ numLog의 길이 ≤ 100,000
-100,000 ≤ numLog[0] ≤ 100,000
1 ≤ i ≤ numLog의 길이인 모든 i에 대해 |numLog[i] - numLog[i - 1]|의 값은 1 또는 10입니다.

입출력 예
numLog	                                    result
[0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]	"wsdawsdassw"

입출력 예 설명
입출력 예 #1
result인 "wsdawsdassw"를 따라 numLog[0]에서부터 시작해 조작을 하면 numLog의 값과 순서대로 일치합니다. 따라서 "wsdawsdassw"를 return 합니다.

Hint
"수 조작하기 1" 문제의 n값이 numLog[0]에 해당하며, 이 문제에서 주어진 numLog에 따라 "수 조작하기 1" 문제의 control을 구하는 문제라고 이해할 수 있습니다.
입출력 예 #1은 "수 조작하기 1" 문제의 입출력 예 #1과 같은 예시이므로 참고하시기 바랍니다.
*/
public class Solution3 {

    public static String solution(int[] numLog) {
        // 문자열 합치기 시 += 는 계속 새로운 객체를 생성하기 때문에 성능에 이슈가 있음.
        StringBuilder answer = new StringBuilder();

        for (int i=0; i < numLog.length; i++) {
            // 이전 배열 값 비교를 위해, 이전 값이 없는 첫번째 요소는 넘김
            if (i == 0) continue;

            int currentNum = numLog[i];
            int prevNum = numLog[i - 1];

            // (이전 값 - 현재 값) 계산 후 입력한 값을 찾기 위해 부호 변환
            int control = -(prevNum - currentNum);

            switch (control) {
                case 1 :
                    answer.append("w");
                    break;
                case -1 :
                    answer.append("s");
                    break;
                case 10 :
                    answer.append("d");
                    break;
                case -10 :
                    answer.append("a");
                    break;
                default :
                    break;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }
}