package Day12.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileInputStream
 * 		- 파일을 읽는 객체 
 * FileOutputStream
 * 		- 파일에 쓰는 객체
 */
public class MainClass02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// Hello.txt 파일을 읽기 위한 객체
			fis = new FileInputStream("./upload/Hello.txt");
			
			File f4 = new File("./upload2");
			f4.mkdirs();
			
			File f5 = new File(f4, "Hello2.txt");
			f5.createNewFile();
			
			// Hello2.txt에 쓰기위한 객체
			// FileOutputStream 디렉토리 경로는 존재해야함
			// 해당 파일이 없으면 자동 생성
			fos = new FileOutputStream(f5);
			
			int readByteCnt = 0;
			byte[] b  = new byte[3];
			
			// fis.read(b) => b 단위 만큼 읽어서 b에 저장
			// 읽은 길이값을 readByteCnt에 저장
			while((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("실행 완료");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException 발생");
		} finally {
			if(fos != null) fos.close();
			if(fis != null) fis.close();
		}
	}
}
