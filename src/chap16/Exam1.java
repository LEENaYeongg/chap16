package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

/* 1부터 100까지의 임의 수 10개를 IntStream에 저장하고 
 * 저장된 수의 총합, 평균, 짝수의 평균, 홀수의 평균, 짝수의 갯수, 홀수의 갯수 출력하기 
 * */
public class Exam1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i]+",");
			}
		IntStream is1 = Arrays.stream(arr);
		System.out.println();
		System.out.println("총합:"+Arrays.stream(arr).sum());
		System.out.println("평균:"+Arrays.stream(arr).average().getAsDouble());
		System.out.println("짝수의 갯수:"+Arrays.stream(arr).filter(i->i%2==0).count());
		System.out.println("홀수의 갯수:"+Arrays.stream(arr).filter(i->i%2==1).count());
		System.out.println("짝수의 평균:"+Arrays.stream(arr).filter(i->i%2==0).average().getAsDouble());
		System.out.println("홀수의 평균:"+Arrays.stream(arr).filter(i->i%2==1).average().getAsDouble());
		System.out.println("중복된 숫자를 제거 후 갯수:"+Arrays.stream(arr).distinct().count());
	}

}
