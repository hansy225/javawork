package chap01_print;

public class Escape_05 {

	public static void main(String[] args) {
		// 이스케이프 문자(escape sequence)
		/*
		 * 문자 조합으로 특수 기능을 수행(\(한글일때는 원, 영어일때는 역슬래시))
		   \n : 줄 바꿈
		   \t : 탭만큼 띄우기
		   \" : 쌍따옴표 출력
		   \\ : 역슬래시(\) 표시
		 */
		System.out.print("더조은 학원\n수강중\n");
		System.out.print("801호\t수업중\n");
		// System.out.print("인포에서 얘기했습니다."결석은 안됩니다."라고 했습니다."); --> error(따옴표 인식 못함)
		System.out.print("인포에서 얘기했습니다.\"결석은 안됩니다.\"라고 했습니다.\n"); // \"(역슬래시 + 따옴표는 인식함)
		// System.out.print("java책 \ 김지원 저자"); --> error (역슬래시 하나는 이스케이프 문자로 인식)
		System.out.print("java책 \\ 김지원저");
	}

}
