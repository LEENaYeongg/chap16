package test_1029;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/* 1. 1부터 100까지의 정수형 임의의 난수 100개를 저장하고, 그중 소수인 숫자의 목록과, 갯수를 출력하기
      Random 클래스를 이용 */
public class Test1 {
	public static void main(String[] args) {
		IntStream is = new Random().ints(100, 1, 101);
		int[] arr = new Random().ints(10, 1, 101).toArray();
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();
		System.out.println("소수목록: ");
		//forEach :  최종 처리 반복자.
		//peek : 중간 처리 반복자.
		IntPredicate f = a -> { //소수인 경우 true, 소수 아닌 경우 false
			int cnt = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0)
					cnt++;
			}
			if (cnt > 0)
				return false;
			else
				return true;
		};
		Arrays.stream(arr).filter(f).distinct().forEach(a -> System.out.print(a + " "));
		System.out.println();
		System.out.println("소수인 갯수:" + Arrays.stream(arr).filter(f).distinct().count());
		System.out.println("===============================");
		System.out.println("소수목록: ");
		//Arrays.stream(arr).filter(f).distinct().peek(s -> System.out.print(s + " ")); --> 마지막에 쓰면 출력안됨.
		long count = Arrays.stream(arr).filter(f).distinct().peek(s -> System.out.print(s + " ")).count();
		System.out.println();
		System.out.println("소수인 갯수:" + count);
	}
}
