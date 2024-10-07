package Arrarys클래스;
// 배열과 관련된 다양한 메소드를 제공하는 클래스

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysClassEx {
    public static void main(String[] args) {
        sortAndSearchFunc();
        System.out.println();
        sortAndSearchFunc2();
        System.out.println();
        sortComparatorFunc();
        System.out.println();

        Integer[] array = {5,4,7,9,13,3,1,88,23};
        List<Integer> list = Arrays.asList(array);  // 배열을 리스트로 변환하는 메소드
    }
    // 정렬과 검색
    static void sortAndSearchFunc() {
        int[] array = {5,4,7,9,13,3,1,88,23};
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array, 88));   // 출력결과 : 7

        Arrays.sort(array);     // 해당 값을 오름차순 정렬
        System.out.println(Arrays.toString(array));
        for (int e : array) System.out.print(e + " ");
        System.out.println();
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array, 88));   // 출력결과 : 8
        //for (int i = 0; i < array.length; i++) {}
    }

    static void sortAndSearchFunc2() {
        Integer[] array2 = {5,4,7,9,13,3,3,1,88,23};
        Arrays.sort(array2, Collections.reverseOrder());    // 내림차순 정렬
        for (int e : array2) System.out.print(e + " ");
        System.out.println();
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array2, 23));
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array2, 3));
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array2, 3));
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array2, 1));
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array2, 88));
    }

    // 정렬 오버라이딩 : 상속받은 메소드를 재정의
    // 과일이름을 정렬하는 길이가 짧은 순으로 정렬하고 길이가 같은 경우 사전 정렬 해주세요
    // Comparator클래스의 compare메소드를 오버라이딩해서 정렬조건을 만듬
    static void sortComparatorFunc() {
        Integer[] array3 = {5,4,7,9,13,3,3,1,88,23};
        Arrays.sort(array3, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;  // 양수가 넘어가면 정렬
                return -1;
            }
        });

        for (int e : array3) System.out.print(e + " ");
    }
}
