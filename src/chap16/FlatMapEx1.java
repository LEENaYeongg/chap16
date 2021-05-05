package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/* flatMap ���� 
 * flatMap : Stream�� ������ ���� 
 * flatMapToInt : Stream => IntStream���� ����*/
public class FlatMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("�ڹ� 8������","�߰��� ��Ʈ����","������ ��������");
		list1.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(System.out::println);
		System.out.println();
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		//flatMapToInt : IntStream���� ����
		IntStream isr = list2.stream().flatMapToInt(data->{
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr); //IntStream Ÿ��
		});
//		isr.forEach(n->System.out.println(n));
		//��ü �� ���
//		System.out.println("��ü��: "+isr.sum());
//		System.out.println("��� �Ǽ�: "+isr.count());
		System.out.println("��� ���: "+ isr.average().getAsDouble());
	}
}