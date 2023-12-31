package step3_01.arrayAdvanced;

public class ArrayEx36 {

	public static void main(String[] args) {

		int[][] arr = new int[2][4];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		
		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		arr[1][3] = 80;
		
		// 배열의 주소 출력
		System.out.println("arr : " + arr);
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println();
		
		System.out.println("arr[0][0] : " + arr[0][0] );  // 데이터
		System.out.println("arr[0][0] : " + arr[0][1] );  // 데이터
		System.out.println("arr[0][0] : " + arr[0][2] );  // 데이터
		System.out.println("arr[0][0] : " + arr[0][3] );  // 데이터
		
		System.out.println("arr[0][0] : " + arr[1][0] );  // 데이터
		System.out.println("arr[0][0] : " + arr[1][1] );  // 데이터
		System.out.println("arr[0][0] : " + arr[1][2] );  // 데이터
		System.out.println("arr[0][0] : " + arr[1][3] );  // 데이터

		System.out.println("arr.length : " + arr.length);
		System.out.println("arr[0].length : " + arr[0].length);
		
		for (int i = 0; i < arr.length; i++) {  // 상수 2보다는 arr.length 사용을 권장
			for (int j = 0; j < arr[i].length; j++) {  // 상수 4보다는 arr[i].length 사용을 권장
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 생각해보기
		int[][] temp1 = arr;  // 주소
		int[] temp2 = arr[0];  // 주소
		int[] temp3 = arr[1];  // 주소
		int temp4 = arr[0][0];  // 데이터
		int temp5 = arr[1][1];  // 데이터
		
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
		System.out.println(temp4);
		System.out.println(temp5);
		System.out.println();
		
		// 축약형 2차원 배열
		int[][] testArr = {{10, 20, 30, 40, 50},
						   {60, 70, 80, 90, 100},
						   {110, 120, 130, 140, 150}};
		
		for (int i = 0; i < testArr.length; i++) {
			for (int j = 0; j < testArr[i].length; j++) {
				System.out.print(testArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
