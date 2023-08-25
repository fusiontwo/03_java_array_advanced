package step3_01.arrayAdvanced;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 oneToNine 배열에 저장하고,
 *    숫자 10~18은 tenToEightTeen 배열에 저장한다.
 */


public class ArrayEx26_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		Random ran = new Random();
		
		final int SIZE = 9;
		
		int[] oneToNine = new int[SIZE];
		int[] tenToEightTeen  = new int[SIZE];
		boolean[] isCheck = new boolean[SIZE * 2];
		
		int i = 0;
		int ranNum = 0;
		int userInput = 0;
		
		while (i < oneToNine.length) {
			ranNum = ran.nextInt(9);
			if (!isCheck[ranNum]) {  // isCheck 배열에 저장된 값이 false이면 실행
				isCheck[ranNum] = true;  // isCheck은 1~9의 값이 사용되었는지 사용되지 않았는지 표시하는 배열
				oneToNine[i++] = ranNum + 1;
			}
		}
		
		i = 0;
		while (i < tenToEightTeen.length) {
			ranNum = ran.nextInt(9);
			if (!isCheck[ranNum + 9]) {
				isCheck[ranNum + 9] = true;
				tenToEightTeen[i++] = ranNum + 10;
			}
		}
		
		int cnt = 1;
		while (true) {
			System.out.print("인덱스를 입력하시오 : ");
			userInput = scan.nextInt();

			for (int j = 0; j < oneToNine.length; j++) {
				if (oneToNine[j] == cnt) {
					if (isCheck[userInput] == false) {
						isCheck[userInput] = true;
					}
					else if (isCheck[userInput] == true) {
						System.out.println("이미 입력하셨습니다.");
					}
				}
				else
					System.out.println("배열에 해당 숫자가 존재하지 않습니다.");
				}
			cnt++;
			}
		
	}
	
}
