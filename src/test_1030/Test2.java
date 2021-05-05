package test_1030;

import java.util.Arrays;
import java.util.List;

/*2. 실행 결과가 다음과 같이 나오도록 수정하기

[결과]
This
is
a
Java
book
Lambda
Expressions
Java8
supports
lambda
Expressions
 * */
public class Test2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
	               "This is a Java book",
	               "Lambda Expressions",
	               "Java8 supports lambda Expressions");
		list.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(System.out::println);
		System.out.println();
		list.stream().flatMap(s->{String[] strr = s.split(" ");
		return Arrays.stream(strr);
		}).forEach(s->System.out.println(s));
		System.out.println();
	}
}
