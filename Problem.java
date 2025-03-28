package ch01.sec06;

import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		char check = 'n';
		Scanner sc = new Scanner(System.in);
		while(true) {
			int ans = (int)(Math.random()*100 + 1);
			if (check == 'n') {
				System.out.println("=====================");
				System.out.println("   [숫자맞추기게임 시작]");
				System.out.println("=====================");
				int a = 0;
				while(a != ans) {
					 System.out.print(">>");
					a = sc.nextInt();
					if (a < ans) {
						 System.out.println("더 높게");
					}
					else if (a > ans) {
						 System.out.println("더 낮게");
					}
					else {
						 System.out.println("맞았습니다.");
					}
				}
			}
			else {
				System.out.println("=====================");
				System.out.println("   [숫자맞추기게임 종료]");
				System.out.println("=====================");
				break;
			}
			 System.out.println("게임을 종료하시겠습니까?(y/n) >>");
			 String buffer;
			 buffer = sc.nextLine();
			 check = sc.next().charAt(0);
		}
	}
}