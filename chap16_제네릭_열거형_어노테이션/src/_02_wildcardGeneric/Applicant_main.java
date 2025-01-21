package _02_wildcardGeneric;

public class Applicant_main {

	public static void main(String[] args) {
		// 모든 사람이 신청 가능
		/*
		Person p = new Person();
		Applicant<Person> a1 = new Applicant<>(p);
		Course.registerCourse1(null);
		*/
		System.out.println("-- 모든 사람이 등록 가능한 코스 --");
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		// 학생만 등록 가능
		System.out.println("-- 학생만 등록 가능한 코스 --");
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

	}

}
