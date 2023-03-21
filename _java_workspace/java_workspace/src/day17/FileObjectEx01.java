package day17;

import java.io.File;
import java.util.StringTokenizer;

public class FileObjectEx01 {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보를 출력
		// C:\Users\EZENIC-171\Desktop\_java_workspace\java_workspace
		File f = new File("C:\\Users\\EZENIC-171\\Desktop\\_java_workspace\\out.txt");
		
		String fileName = f.getName();
		
		System.out.println(fileName); // 경로를 제외한 파일이름만 출력
		System.out.println(f.getPath()); // 경로 + 이름
		System.out.println(f.getAbsolutePath()); // 경로 + 이름 // 절대 경로
		System.out.println(f.getParent()); // 파일이 속하고있는 경로만.
		
		System.out.println("\n파일 구분자");
		System.out.println(File.separator); // 파일 구분자 (가장 많이 사용)
		System.out.println();
		System.out.println(File.separatorChar);
		
		//시스템에서 직접 알아낸 사용자파일의 경로를 분리
		// 실제 자주 사용하는 방법
		String fstr = f.toString(); 
		System.out.println(fstr); // 해당 경로와 파일 이름 출력
		
		// fstr에서 드라이브만 추출 출력
		System.out.println("드라이브 : "+fstr.substring(0, fstr.indexOf("\\")));
		System.out.println("드라이브 : "+fstr.substring(0, fstr.indexOf(File.separator))); // 더 많이 쓴다.
		
		// fstr에서 파일명만 추출 출력
		System.out.println("파일명 : " + fstr.substring(fstr.lastIndexOf("\\")+1));
		System.out.println("파일명 : "+fstr.substring(fstr.lastIndexOf(File.separator)+1));
		
		// fstr에서 파일경로만 추출 출력
		System.out.println("파일경로만 : " + fstr.substring(fstr.indexOf(File.separator)+1, fstr.lastIndexOf(File.separator)));
		
		// 파일명과 확장자 분리
		System.out.println(f.getName()); // 파일명.확장자 (.기준으로 분리)
//		String[] str = f.getName().split(".");
//		System.out.println("파일명 : " + str[0] + "확장자 : " + str[1]); //값을 찾을수 없다는 에러가 나옴.
		
		String[] str2 = f.getName().split(File.separator+".");
		System.out.println();
		System.out.println("파일명 : " + str2[0] + " 확장자 : " + str2[1]);
		
		// StirngTokenizer 클래스 사용
		StringTokenizer stk = new StringTokenizer(f.getName(),"."); // f.getName .을 기준으로 나눠주겠다.
		
		while(stk.hasMoreElements()){// 토큰요소의 값이 있다면 true, 없으면 false리턴 
			System.out.println(stk.nextElement());
		}
		
	}

}
