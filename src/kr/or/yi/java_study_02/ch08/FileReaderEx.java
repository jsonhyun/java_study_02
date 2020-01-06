package kr.or.yi.java_study_02.ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		readex01();
//		readex02();
//		System.out.println(System.getProperty("user.dir"));
		
		String filePath = System.getProperty("user.dir") + "\\data\\department.txt";
		System.out.println(filePath);
		
		readFile("department.txt");
		readFile("employee.txt");
		
		readFileInputStream("department.txt");
		
		

	}

	private static void readFileInputStream(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\data\\" + fileName;
		File file = new File(filePath);
		try(FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, "UTF8")){
			int c;
			while((c=isr.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

	private static void readFile(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\data\\" + fileName;
		File file = new File(filePath);
		
		//try-catch-resource문 => 자동으로 close 호출 closable interface를 구현한 클래스만 가능
		try (FileReader fr = new FileReader(file);){
			int c;
			while((c = fr.read())!=-1) {
				System.out.print((char)c);
			}
			System.out.println("Encoding : "+fr.getEncoding());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

	private static void readex02() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("C:\\Windows\\system.ini");
		int c;
		while((c = fr.read()) != -1) {
			System.out.print((char)c);
		}
	}

	private static void readex01() {
		try {
			readex02();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당 파일이 존재하지 않음");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 읽는 도중에 문제 발생");
		}
	}

}
