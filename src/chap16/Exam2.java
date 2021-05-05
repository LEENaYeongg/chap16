package chap16;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/* 1���� 100������ ���� �� 100���� IntStream�� �����ϰ� 
 * ����� ���� ����, ���, ¦���� ���, Ȧ���� ���, ¦���� ����, Ȧ���� ���� ����ϱ� 
 * Random Ŭ������ �̿��Ͽ� ���� ��Ʈ������ �����ϱ�
 * */
public class Exam2 {
	public static void main(String[] args) {
		IntStream is = new Random().ints(100,1,101);
		int[] arr = is.toArray();
		for(int a : arr) System.out.print(a+" ");
		System.out.println();
//		System.out.println("����:"+is.sum());
//		System.out.println("���:"+is.average().getAsDouble());
		System.out.println();
		System.out.println("����:"+Arrays.stream(arr).sum());
		System.out.println("���:"+Arrays.stream(arr).average().getAsDouble());
		System.out.println("¦���� ����:"+Arrays.stream(arr).filter(i->i%2==0).count());
		System.out.println("Ȧ���� ����:"+Arrays.stream(arr).filter(i->i%2==1).count());
		System.out.println("¦���� ���:"+Arrays.stream(arr).filter(i->i%2==0).average().getAsDouble());
		System.out.println("Ȧ���� ���:"+Arrays.stream(arr).filter(i->i%2==1).average().getAsDouble());
		System.out.println("�ߺ��� ���ڸ� ���� �� ����:"+Arrays.stream(arr).distinct().count());
		System.out.println("���� �� ���� ū��:"+Arrays.stream(arr).max().getAsInt());
		System.out.println("���� �� ���� ������:"+Arrays.stream(arr).min().getAsInt());
		System.out.println("¦�� �� ���� ū��:"+Arrays.stream(arr).filter(i->i%2==0).max().getAsInt());
		System.out.println("¦�� �� ���� ������:"+Arrays.stream(arr).filter(i->i%2==0).min().getAsInt());
	}
}
