package test_1029;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/* 1. 1���� 100������ ������ ������ ���� 100���� �����ϰ�, ���� �Ҽ��� ������ ��ϰ�, ������ ����ϱ�
      Random Ŭ������ �̿� */
public class Test1 {
	public static void main(String[] args) {
		IntStream is = new Random().ints(100, 1, 101);
		int[] arr = new Random().ints(10, 1, 101).toArray();
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();
		System.out.println("�Ҽ����: ");
		//forEach :  ���� ó�� �ݺ���.
		//peek : �߰� ó�� �ݺ���.
		IntPredicate f = a -> { //�Ҽ��� ��� true, �Ҽ� �ƴ� ��� false
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
		System.out.println("�Ҽ��� ����:" + Arrays.stream(arr).filter(f).distinct().count());
		System.out.println("===============================");
		System.out.println("�Ҽ����: ");
		//Arrays.stream(arr).filter(f).distinct().peek(s -> System.out.print(s + " ")); --> �������� ���� ��¾ȵ�.
		long count = Arrays.stream(arr).filter(f).distinct().peek(s -> System.out.print(s + " ")).count();
		System.out.println();
		System.out.println("�Ҽ��� ����:" + count);
	}
}
