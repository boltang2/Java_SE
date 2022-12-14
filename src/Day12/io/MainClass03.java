package Day12.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * BufferedInputStream / BufferedOutputStream
 * 		- 버퍼 보조스트림
 * 		- 성능도 더 향상된다.
 * 
 */
public class MainClass03 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			File f4 = new File("./upload2");	
			File f5 = new File(f4, "Hello2.txt");
			// Hello.txt 파일을 읽기 위한 객체
			fis = new FileInputStream("./upload/Hello.txt");
			bis = new BufferedInputStream(fis);			
			fos = new FileOutputStream(f5);	
			bos = new BufferedOutputStream(fos);
			
			// println 같은 메소드를 파일에 사용할수 있다.
			ps = new PrintStream(bos, true);
			
			int readByteCnt = 0;
			byte[] b  = new byte[3];		
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}		
			
			ps.println();
			ps.println("====================");
			ps.println("printStream으로 남겨요.");
			System.out.println("실행 완료");
		} catch (IOException e) {
			System.out.println("에러");
		} finally {
			if(bos != null) bos.close();
			if(bis != null) bis.close();
			if(fos != null) fos.close();
			if(fis != null) fis.close();
			if(ps != null) ps.close();
		}
		
	}
}
