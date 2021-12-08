import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		System.out.println("큰 수 확인 : " + largerNumbers(num1, num2));
	}

	public static int largerNumbers(int num1, int num2) {
		int result = (num1 == num2 ? 0 : (num1 > num2 ? num1 : num2));
		return result;

		// if문
		// if(num1>num2){
		// return num1;
		// }
		// else if(num2>num1){
		// return num2;
		// }
		// else{
		// return 0;
		// }
	}
}
