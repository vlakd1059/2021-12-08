import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();

		System.out.print("연산자 입력(-, *) >> ");
		String op = sc.next();

		System.out.println("결과값 : " + cal(num1, num2, op));
	}

	// cal 메소드 정의
	public static int cal(int num1, int num2, String op) {
		// 결과를 담을 수 있는 변수 생성
		// int result = 0;
		// 연산자 비교하기

		if (op.equals("-")) {
			// 연산에 따른 작업 진행.
			return num1 - num2;
		} else {
			return num1 * num2;

		}
		// return result

	}

}
