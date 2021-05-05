package test_1030;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 4. strArrStrm 스트림내부에 있는 모든 문자열의 길이의 합을 출력하는 프로그램을 작성하시오
[결과]
총 문자열 길이의 합:30
*/
public class Test4 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
			       new String[]{"홍길동","김삿갓","이몽룡"},
			       new String[]{"서울특별시","금천구","가산동","대륭테크노타운 3차"});

		int sum = strArrStrm.flatMapToInt(s->{
			int[] intArr = new int[s.length];
			for(int i=0; i<s.length; i++) {
				intArr[i] = s[i].length();
			}
			return IntStream.of(intArr);
		}).peek(s->System.out.print(s+",")).sum();
		System.out.println("문자열 길이의 합 ="+sum);
	}
}
