package training.day6;

import java.util.Arrays;

/*
Day 6 조건문, 반복문
코딩테스트 연습 > 코딩 기초 트레이닝 > 마지막 두 원소

정수 리스트 num_list 가 주어질 때,
마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여
return 하도록 solution 함수를 완성해주세요.

입출력 예
num_list	        result
[2, 1, 6]	        [2, 1, 6, 5]
[5, 2, 1, 7, 5]	    [5, 2, 1, 7, 5, 10]

입출력 예 설명
입출력 예 #1
마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return 합니다.
입출력 예 #2
마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return 합니다.
*/
public class Solution1 {

    public static int[] solution(int[] num_list) {

        // 배열은 재사용이 안되어, 기존 배열 크기 +1 인 배열 생성
        int length = num_list.length;
        int[] answer = new int[length + 1];

        // 신규 배열에 기존 값 다시 넣기
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }

        // 마지막 숫자, 뒤에서 두번째 숫자 가져와서 값 마지막 값 설정
        int lastNum = num_list[length - 1];
        int secondLastNum = num_list[length - 2];
        int returnNum = lastNum > secondLastNum ? lastNum - secondLastNum : lastNum * 2;

        // 마지막 원소에 값 넣기
        answer[length] = returnNum;

        return answer;
    }


    public static void main(String[] args) {
//        int[] num_list = {2, 1, 6};
        int[] num_list = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(solution(num_list)));
    }




}