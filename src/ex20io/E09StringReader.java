package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReader {
	
	public static void main(String[] args) {
		
		try {
			// 문자열을 읽기 위한 입력 스트림 생성
			BufferedReader in = new BufferedReader(
					new FileReader("src/ex20io/string.txt"));
			
			String str;
			while(true) {
				/*
				개행(줄 바꿈)이 등장하기 전까지의 데이터를 한 번에
				읽어온다. 즉 한 줄씩 읽어온다.
				 */
				str = in.readLine();
				
				if(str == null) {
					break;
				}
				/*
				입력시 newLine()을 통해 개행정보가 입력되지만
				읽어들인 문자열에는 개행정보가 포함되지 않는다.
				따라서 개행을 하려면 println()을 사용해야 한다.
				즉 개행정보는 문자열을 라인별로 구분하는 용도로만
				사용된다.
				 */
				System.out.println(str);
			}
			
			in.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
