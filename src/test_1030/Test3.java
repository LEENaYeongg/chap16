package test_1030;

import java.util.Arrays;
import java.util.List;

/*3. 2�� ������ ����� �ߺ����� �ʵ��� �ϰ�, �����Ͽ� ����ϱ� 
[���]
Expressions
Java
Java8
Lambda
This
a
book
is
lambda
supports*/
public class Test3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
	               "This is a Java book",
	               "Lambda Expressions",
	               "Java8 supports lambda Expressions");
		list.stream().flatMap(data->Arrays.stream(data.split(" "))).distinct().sorted().forEach(System.out::println);
		System.out.println();
	}
}
