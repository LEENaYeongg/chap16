package test_1030;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 4. strArrStrm ��Ʈ�����ο� �ִ� ��� ���ڿ��� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
[���]
�� ���ڿ� ������ ��:30
*/
public class Test4 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
			       new String[]{"ȫ�浿","���","�̸���"},
			       new String[]{"����Ư����","��õ��","���굿","�븢��ũ��Ÿ�� 3��"});

		int sum = strArrStrm.flatMapToInt(s->{
			int[] intArr = new int[s.length];
			for(int i=0; i<s.length; i++) {
				intArr[i] = s[i].length();
			}
			return IntStream.of(intArr);
		}).peek(s->System.out.print(s+",")).sum();
		System.out.println("���ڿ� ������ �� ="+sum);
	}
}
