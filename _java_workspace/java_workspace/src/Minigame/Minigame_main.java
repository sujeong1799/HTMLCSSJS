package Minigame;

import java.util.Scanner;

public class Minigame_main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		
		while(true) {
				System.out.println();
		        
		        System.out.println
		        			("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄ 미니게임 어서오고~⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⡿⠟⠙⠛⠛⠁⠀⠈⠙⢿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⠀⠀⠊⣉⡙⠆⣤⣞⡉⠃⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⣿⣿⡆⠀⠀⠈⢁⣠⣈⡛⠁⠀⢸⣿⡟⠀⠀⢀⢀⠀⠀⠀\n"
		        		+ " ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⠃⠀⠀⠰⣯⣼⣿⣿⠀⠀⠀⢻⣿⣦⡀⡏⠉⠑⡄\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⡇⠀⠀⠀⠀⠙⠿⠿⠋⠀⠀⠀⠈⣿⣿⡃⢱⠀⠀⡇⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣷⠤⣄⣀⣀⣀⠀⠀⠀⠀⢀⡠⠾⠿⠟⢡⠃⠀⠀⡇⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠓⠀⠀⠀⣴⣿⣧⣼⣽⣷⣾⣟⠉⠉⠒⠒⠊⠀⠀⠀⡇⠀⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⣠⠎⠀⠀⠀⠀\n"
		        		+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠜⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣀⡤⠖⠋⠀⠀");
		        System.out.println();
		        System.out.printf("%32s \n","🕹게임 리스트🕹");
		        System.out.printf("%30s \n","1.블랙잭");
		        System.out.printf("%30s \n","2.폭탄돌리기");
		        System.out.printf("%30s \n","3.속담맞추기");
		        System.out.printf("%30s \n","4.베스킨라빈스31");
		        System.out.printf("%30s \n","5.야구게임");
		        System.out.printf("%30s \n","6.업다운");
		        System.out.printf("%30s \n","7.악어이빨누르기");
		        System.out.printf("%30s \n","0.게임종료");
		        
		        System.out.println();
		        System.out.printf("%30s \n","게임을 선택해주세요 : ");
		        int pick = scan.nextInt();
		        
		        if(pick==0) {
		        	System.out.printf("%30s \n","미니게임천국을 종료합니다.");
		        	scan.close();
		        	break;
		        }
		        
		        switch(pick) {
		        case 1 :
		        	Blackjack black = new Blackjack();
		        	black.exe();
		        	break;
		        case 2 :
		        	Boom boom = new Boom();
		        	boom.exe();
		        	break;
		        case 3 :
		        	Idiom idiom = new Idiom();
		        	idiom.exe();
		        	break;
		        case 4 :
		        	BaskinRobbins baskin = new BaskinRobbins();
		        	baskin.exe();
		        	break;
		        case 5 :
		        	Baseball baseball = new Baseball();
		        	baseball.exe();
		        	break;
		        case 6 :
		        	Updown updown = new Updown();
		        	updown.exe();
		        	break;
		        case 7 :
		        	CrocodileTeeth crocodileteeth = new CrocodileTeeth();
		        	crocodileteeth.exe();
		        	break;
		        	
		        	
		        	
		        default :
		        	System.out.printf("%30s \n","잘못된 숫자입니다. 다시 입력해주세요.");
		        	break;
		        }
		}
	}
}

