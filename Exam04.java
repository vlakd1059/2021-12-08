import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();

		System.out.println("10에 가까운 수 : " + close10(num1, num2));

	}

	public static int close10(int num1, int num2) {
		
//		int des = num1 - 10;
//		int des2 = num2 - 10;
//
//		// 삼항 연산자
//		// des=des>0? des:(des*-1);
//		// des2=des2>0? des2:(des2*-1);
//		
//		// if문
//		if (des < 0) {
//			des = -des;
//		}
//		if (des2 < 0) {
//			des2 = -des2;
//		}
		
		// Math Class에 있는 abs() 절대값 함수 사용하기
		int a=Math.abs(10-num1);  //-부호 때버리는 기능있음
		int b=Math.abs(10-num2);
		if (a > b) {
			return num2;
		} else if (a < b) {
			return num1;
		} else {
			return 0;
		}
	}

}
