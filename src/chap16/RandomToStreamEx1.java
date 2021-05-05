package chap16;

import java.util.Random;

public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.println("int 형 난수 3개를 가진 스트림 생성");
		new Random().ints(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~2사이의 int형 난수 10개를 가진 스트림 생성");
		new Random().ints(10,0,3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("long 형 난수 3개를 가진 스트림 생성");
		new Random().longs(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("char 형 난수 3개를 가진 스트림 생성");
		new Random().ints(3,'A','Z'+1).forEach(s->System.out.print((char)s+" "));
		System.out.println("double 형 난수 3개를 가진 스트림 생성");
		new Random().doubles(3).forEach(s->System.out.print(s+" "));
	}
}
