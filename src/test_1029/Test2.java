package test_1029;

import java.util.Scanner;
import java.util.stream.IntStream;

/* 2. ȭ�鿡�� ������ �Է¹޾�  �Էµ� ���ڱ����� ��, ¦���� ��, Ȧ���� ���� ���ϴ� ���α׷� �ۼ��ϱ�
		IntStream.rangeClosed �޼��� �̿� */

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����(����)�� �Է��ϼ���");
		int num = sc.nextInt();
		System.out.println("�Էµ� ���ڱ����� ��:" + IntStream.rangeClosed(1, num).sum());
		System.out.println("�Էµ� ���ڱ����� ¦���� ��:" + IntStream.rangeClosed(1, num).filter(n -> n % 2 == 0).sum());
		System.out.println("�Էµ� ���ڱ����� Ȧ���� ��:" + IntStream.rangeClosed(1, num).filter(n -> n % 2 != 0).sum());
	}
}
