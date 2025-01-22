package _03_charStream;

import java.io.FileWriter;
import java.io.IOException;

/*
 문자 기반 스트림
  - 문자 스트림 : 데이터를 2바이트 단위로 전송하는 통로
  - 기반 스트림 : 외부 매체와 직접 연결되는 통로
  
  xxxReader : 입력용 스트림
  xxxWriter : 출력용 스트림
  
 */

public class CharStream {
	public void fileSave() {
		FileWriter fw = null;
		try {
			// 1. 스트림 만들기
			fw = new FileWriter("b_char.txt");
			
			// 2. 문자 스트림으로 데이터를 출력(메소드 활용)
			fw.write("A");
			fw.write('A');
			fw.write(' ');
			fw.write("와우! 쉬는시간이다.");
			
			char[] arr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(arr);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
