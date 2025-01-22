package _02_byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    /*
     바이트 기반 스트림
      - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로
      - 기반 스트림 : 외부 매체와 직접적으로 연결하는 통로
      
      xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부 매체로부터 데이터를 읽어옴)
      xxxOutputStream : xxx매체로부터 데이터를 출력하는 통로(외부 매체로 데이터를 내보냄. 쓰겠다)
      
     */
    
    // 외부 매체 = file
    public void fileSave() {
        // 순서
        // 1. 스트림 생성(통로 만들기)
        // 2. 스트림으로 데이터를 출력(메소드 활용)
        // 3. 모두 사용 후에는 스트림 반납
        
        // fileOutputStream : 파일과 직접적으로 연결하여 1바이트 단위로 출력하는 스트림
        
        FileOutputStream fout = null;
        try {
            // 1. 스트림 생성(통로 만들기)
            fout = new FileOutputStream("a_byte.txt");
            // 해당 파일이 없으면 새로 만들어주고 통로 연결. 만약 파일이 있으면 기존 파일에 통로 연결
            
            // 2. 스트림으로 데이터를 출력(메소드 활용)
            fout.write(97);  // a 저장
            fout.write('b');
            fout.write('랑');
            
            byte[] arr = {99, 100, 101};
            fout.write(arr);
            
            // writer(byte[] b, int offset, int len)
            fout.write(arr, 1, 2);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 3. 모두 사용 후에는 스트림 반납
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } 
    }
    
    public void fileRead() {
        // FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
        
        // 순서
        // 1. 스트림 생성(통로 만들기)
        // 2. 스트림을 통해 입력을 받아옴(메소드 활용)
        // 3. 사용이 끝나면 스트림 반납
        
        FileInputStream fin = null;
        
        try {
            fin = new FileInputStream("a_byte.txt");
            
            while(fin.read() != -1) {
				System.out.println(fin.read()); 
			}
			/*
			// 해결방법 1
			while (true) {
				int value = fin.read();
				if(value == -1)
					break;
				System.out.println(value);
			}
			*/
            
            // 해결방법 2 (권장사항)
            int value = 0;
            while ((value = fin.read()) != -1) {
                System.out.println(value);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 스트림 반납
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
