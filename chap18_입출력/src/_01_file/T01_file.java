package _01_file;

import java.io.File;

public class T01_file {

	public static void main(String[] args) {
		// 1.
		File f1 = new File("test.txt");
		f1.createNewFile();
		
		

		// 2. 경로 지정하여 파일 생성
		File f2 = new File("C:\\Users\\tj\\hsy\\test.txt");
		f2.createNewFile();
		
		// 3. 폴더를 생성하고 파일까지 생성하기
		File tempFolder = new File("C:/temp");
		tempFolder.mkdir();  // mkdir는 폴더 생성
		
		File f3 = new File("C:/temp/test.txt");
		f3.createNewFile();
		
		System.out.println(f1.exists());  // f1파일은 존재하는가 ?
		System.out.println(f1.isFile());  // f1은 파일인가 ?
		
		System.out.println(tempFolder.isFile());
		
		System.out.println("파일명 : " +f3.getName());
		System.out.println("절대 경로 : " +f3.getAbsolutePath());
		System.out.println("파일 용량 : " +f3.length());
		System.out.println("상위 폴더 : " +f3.getParent());
		

	}

}
