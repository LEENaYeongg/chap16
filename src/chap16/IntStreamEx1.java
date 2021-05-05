package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

/* IntStream 예제
 * int형(정수형)값들의 모임. */

public class IntStreamEx1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Array.stream 메서드를 이용하여 IntStream 생성하기");
		IntStream is1 = Arrays.stream(arr);
//		is1.forEach(System.out::print); //메서드 참조
		//Stream.forEach(Consumer)
		//Consumer 인터페이스 : 매개변수있다. 리턴값 없다.
		is1.forEach(i->System.out.print(i)); //메서드 호출
		System.out.println("IntStream.of메서드를 이용하여 IntStream 생성하기");
		IntStream is2 = IntStream.of(arr);
		is2.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("IntStream.range(1,5) 메서드를 이용하여 IntStream 생성하기");
		IntStream is3 = IntStream.range(1, 5);
		is3.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("IntStream.rangeClosed(1,5) 메서드를 이용하여 IntStream 생성하기");
		IntStream is4 = IntStream.rangeClosed(1, 5);
		is4.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("1~100까지의 합:"+IntStream.range(1, 101).sum()); // sum 변수를 사용하지 않아도 범위내의 합을 구해줌.
		System.out.println("1~100까지 짝수의 합:"+IntStream.range(1, 101).filter(i->i%2==0).sum());
		System.out.println("1~100까지 홀수의 합:"+IntStream.range(1, 101).filter(i->i%2==1).sum());
		System.out.println("1~100까지 짝수의 갯수:"+IntStream.range(1, 101).filter(i->i%2==0).count());
		System.out.println("1~100까지 홀수의 갯수:"+IntStream.range(1, 101).filter(i->i%2==1).count());
		System.out.println("1~100까지의 평균:"+IntStream.range(1, 101).average().getAsDouble());

	}

}
