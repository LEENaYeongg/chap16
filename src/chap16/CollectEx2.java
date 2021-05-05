package chap16;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student3 {
	String name;
	boolean isMale;
	int grade;
	int ban;
	int score;

	Student3(String name, boolean isMale, int grade, int ban, int score) {
		this.name = name; //이름
		this.isMale = isMale; //남녀
		this.grade = grade; //학년
		this.ban = ban; //반
		this.score = score; //점수
	}
//gettter
	String getName() {return name;}
	boolean isMale() {return isMale;}
	int getGrade() {return grade;}
	int getBan() {return ban;}
	int getScore() {return score;}

	public String toString() {
		return String.format("[%s,%s,%d학년,%d반,%3d점]", name, isMale ? "남" : "여", grade, ban, score);
	}

	enum Level { //열거형
		HIGH, MID, LOW
	}
}

public class CollectEx2 {
	public static void main(String[] args) {
		Student3[] stuArr = { new Student3("나자바", true, 1, 1, 300), 
				new Student3("김자바", false, 1, 1, 250),
				new Student3("김홍도", false, 1, 1, 200), 
				new Student3("남홍도", true, 1, 1, 150),
				new Student3("강호동", true, 2, 1, 300), 
				new Student3("백창현", false, 2, 1, 250),
				new Student3("김삿갓", false, 2, 1, 200), 
				new Student3("남미리", true, 2, 3, 150),
				new Student3("김삿갓", false, 2, 3, 300), 
				new Student3("남미리", true, 2, 3, 270) };
		System.out.println("1. 성별로 분할");
		//partitioningBy(Student3::isMale): 
		//				return 값이 boolean 형이어야 함.
		Map<Boolean, List<Student3>> stuByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale));
		System.out.println("남자:");
		List<Student3> maleList = stuByGender.get(true);
		for (Student3 s : maleList) { //키값
			System.out.println(s);
		}
		System.out.println("여자:");
		for (Student3 s : stuByGender.get(false)) {
			System.out.println(s);
		}
		System.out.println("2. 성별로 분할 + 성별 학생수");
		Map<Boolean,Long> stuNumByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale,
						Collectors.counting())); //목록은 필요없고 갯수들만~
		System.out.println("남학생수:"+stuNumByGender.get(true));
		System.out.println("여학생수:"+stuNumByGender.get(false));
		System.out.println("3. 성별로 분할 + 성별 1등");
		Map<Boolean,Optional<Student3>> stuScoreByGender = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student3::isMale,
						Collectors.maxBy //값이 큰 객체 선택
						(Comparator.comparingInt(Student3::getScore))));
		//인터페이스와 static 차이 : 구현부
				System.out.println("남학생1등:"+stuScoreByGender.get(true).get());
				System.out.println("여학생1등:"+stuScoreByGender.get(false).get());
				
	}
}
