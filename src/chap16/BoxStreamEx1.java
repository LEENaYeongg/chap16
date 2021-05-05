package chap16;
/* boxed() : IntStream => Stream<Integer> 
 * asLongStream() : IntStream=> LongStream
 * asDoubleStream() : IntStream=> DoubleStream */

import java.util.Arrays;

public class BoxStreamEx1 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println("IntStream->Stream<Integer>");
		Arrays.stream(arr).boxed().forEach(i -> System.out.println(i.hashCode())); // i는 참조자료형 integer
		Integer arr2[] = { 10, 20, 30, 40, 50, 60 };
		Arrays.stream(arr2).forEach(i -> System.out.println(i.hashCode()));
		System.out.println("Stream<Integer>->IntStream");
		// IntStream으로 변경 후 sum() 출력하기
		int sum = Arrays.stream(arr2).mapToInt(a -> a.intValue()).sum();
		System.out.println("합계:" + sum);
		// IntStream => DoubleStream
		Arrays.stream(arr).asDoubleStream().forEach(i -> System.out.println(i));
		// IntStream => LongStream
		Arrays.stream(arr).asLongStream().forEach(i -> System.out.println(i));
	}
}
