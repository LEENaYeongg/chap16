package test_1030;

import java.util.Arrays;
import java.util.List;



/*1. ������ ������ �������� ���α׷��� �ϼ��Ͻÿ�*/
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
				new Student("ȫ�浿", 60, 70, "�İ�"), new Student("���", 65, 55, "�濵"),
				new Student("�̸���", 80, 75, "ȭ��"), new Student("�Ӳ���", 85, 65, "�İ�"));
		System.out.println("���� ���� ����: "+list.stream().mapToInt(s->s.getMath()).sum());
		System.out.println("���� ���� ����:"+list.stream().mapToInt(s->s.getEng()).sum());
		System.out.println("���� ���� ���:"+list.stream().mapToInt(s->s.getMath()).average().getAsDouble());
		System.out.println("���� ���� ���:"+list.stream().mapToInt(s->s.getEng()).average().getAsDouble());
		System.out.println("�İ��л� �ο���:"+list.stream().filter(s->s.getMajor().equals("�İ�")).count());
		System.out.println("�İ��л� ���");
		list.stream().filter(s->s.getMajor().equals("�İ�")).forEach(s->System.out.println(s));
		System.out.println("�İ� ���� ���� ����:"+list.stream().filter(s->s.getMajor().equals("�İ�"))
				.mapToInt(s->s.getMath()).sum());
		System.out.println("�İ����� ���� ����:"+list.stream().filter(s->s.getMajor().equals("�İ�"))
				.mapToInt(s->s.getEng()).sum());
		System.out.println("�İ� ���� ���� ���:"+list.stream().filter(s->s.getMajor().equals("�İ�"))
				.mapToInt(s->s.getMath()).average().getAsDouble());
		System.out.println("�İ����� ���� ���:"+list.stream().filter(s->s.getMajor().equals("�İ�"))
				.mapToInt(s->s.getEng()).average().getAsDouble());
		System.out.println("�İ� �л��� ���(�̸���):");
		list.stream().filter(s->s.getMajor().equals("�İ�")).
				sorted((s1,s2)->s1.name.compareTo(s2.name)).forEach(s->System.out.println(s));
		System.out.println("�İ� �л��� ���(������):");
		list.stream().filter(s->s.getMajor().equals("�İ�"))
		.sorted((s1,s2)->(s1.getMath()+s1.getEng())-(s2.getMath()+s2.getEng())).forEach(s->System.out.println(s));
	}
}
