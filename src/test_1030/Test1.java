package test_1030;

import java.util.Arrays;
import java.util.List;



/*1. 다음의 내용이 나오도록 프로그램을 완성하시오*/
class Student {
	String name;
	private int eng;
	private int math;
	private String major;

	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getMajor() {
		return major;
	}

	public String toString() {
		return "[name=" + name + ", eng=" + eng + ", math=" + math + ", major=" + major + "]";
	}
}

public class Test1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 60, 70, "컴공"), new Student("김삿갓", 65, 55, "경영"),
				new Student("이몽룡", 80, 75, "화공"), new Student("임꺽정", 85, 65, "컴공"));
		System.out.println("수학 점수 총점: "+list.stream().mapToInt(s->s.getMath()).sum());
		System.out.println("영어 점수 총점:"+list.stream().mapToInt(s->s.getEng()).sum());
		System.out.println("수학 점수 평균:"+list.stream().mapToInt(s->s.getMath()).average().getAsDouble());
		System.out.println("영어 점수 평균:"+list.stream().mapToInt(s->s.getEng()).average().getAsDouble());
		System.out.println("컴공학생 인원수:"+list.stream().filter(s->s.getMajor().equals("컴공")).count());
		System.out.println("컴공학생 목록");
		list.stream().filter(s->s.getMajor().equals("컴공")).forEach(s->System.out.println(s));
		System.out.println("컴공 수학 점수 총점:"+list.stream().filter(s->s.getMajor().equals("컴공"))
				.mapToInt(s->s.getMath()).sum());
		System.out.println("컴공영어 점수 총점:"+list.stream().filter(s->s.getMajor().equals("컴공"))
				.mapToInt(s->s.getEng()).sum());
		System.out.println("컴공 수학 점수 평균:"+list.stream().filter(s->s.getMajor().equals("컴공"))
				.mapToInt(s->s.getMath()).average().getAsDouble());
		System.out.println("컴공영어 점수 평균:"+list.stream().filter(s->s.getMajor().equals("컴공"))
				.mapToInt(s->s.getEng()).average().getAsDouble());
		System.out.println("컴공 학생의 목록(이름순):");
		list.stream().filter(s->s.getMajor().equals("컴공")).
				sorted((s1,s2)->s1.name.compareTo(s2.name)).forEach(s->System.out.println(s));
		System.out.println("컴공 학생의 목록(총점순):");
		list.stream().filter(s->s.getMajor().equals("컴공"))
		.sorted((s1,s2)->(s1.getMath()+s1.getEng())-(s2.getMath()+s2.getEng())).forEach(s->System.out.println(s));
	}
}
