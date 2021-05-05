package chap16;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/* 1부터 100까지의 임의 수 100개를 IntStream에 저장하고 
 * 저장된 수의 총합, 평균, 짝수의 평균, 홀수의 평균, 짝수의 갯수, 홀수의 갯수 출력하기 
 * Random 클래스를 이용하여 난수 스트림으로 구현하기
 * */
public class Exam2 {
	public static void main(String[] args) {
		IntStream is = new Random().ints(100,1,101);
		int[] arr = is.toArray();
		for(int a : arr) System.out.print(a+" ");
		System.out.println();
//		System.out.println("총합:"+is.sum());
//		System.out.println("평균:"+is.average().getAsDouble());
		System.out.println();
		System.out.println("총합:"+Arrays.stream(arr).sum());
		System.out.println("평균:"+Arrays.stream(arr).average().getAsDouble());
		System.out.println("짝수의 갯수:"+Arrays.stream(arr).filter(i->i%2==0).count());
		System.out.println("홀수의 갯수:"+Arrays.stream(arr).filter(i->i%2==1).count());
		System.out.println("짝수의 평균:"+Arrays.stream(arr).filter(i->i%2==0).average().getAsDouble());
		System.out.println("홀수의 평균:"+Arrays.stream(arr).filter(i->i%2==1).average().getAsDouble());
		System.out.println("중복된 숫자를 제거 후 갯수:"+Arrays.stream(arr).distinct().count());
		System.out.println("숫자 중 가장 큰수:"+Arrays.stream(arr).max().getAsInt());
		System.out.println("숫자 중 가장 작은수:"+Arrays.stream(arr).min().getAsInt());
		System.out.println("짝수 중 가장 큰수:"+Arrays.stream(arr).filter(i->i%2==0).max().getAsInt());
		System.out.println("짝수 중 가장 작은수:"+Arrays.stream(arr).filter(i->i%2==0).min().getAsInt());
	}
}
