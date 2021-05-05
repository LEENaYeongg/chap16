package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

/* IntStream ����
 * int��(������)������ ����. */

public class IntStreamEx1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Array.stream �޼��带 �̿��Ͽ� IntStream �����ϱ�");
		IntStream is1 = Arrays.stream(arr);
//		is1.forEach(System.out::print); //�޼��� ����
		//Stream.forEach(Consumer)
		//Consumer �������̽� : �Ű������ִ�. ���ϰ� ����.
		is1.forEach(i->System.out.print(i)); //�޼��� ȣ��
		System.out.println("IntStream.of�޼��带 �̿��Ͽ� IntStream �����ϱ�");
		IntStream is2 = IntStream.of(arr);
		is2.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("IntStream.range(1,5) �޼��带 �̿��Ͽ� IntStream �����ϱ�");
		IntStream is3 = IntStream.range(1, 5);
		is3.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("IntStream.rangeClosed(1,5) �޼��带 �̿��Ͽ� IntStream �����ϱ�");
		IntStream is4 = IntStream.rangeClosed(1, 5);
		is4.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("1~100������ ��:"+IntStream.range(1, 101).sum()); // sum ������ ������� �ʾƵ� �������� ���� ������.
		System.out.println("1~100���� ¦���� ��:"+IntStream.range(1, 101).filter(i->i%2==0).sum());
		System.out.println("1~100���� Ȧ���� ��:"+IntStream.range(1, 101).filter(i->i%2==1).sum());
		System.out.println("1~100���� ¦���� ����:"+IntStream.range(1, 101).filter(i->i%2==0).count());
		System.out.println("1~100���� Ȧ���� ����:"+IntStream.range(1, 101).filter(i->i%2==1).count());
		System.out.println("1~100������ ���:"+IntStream.range(1, 101).average().getAsDouble());

	}

}