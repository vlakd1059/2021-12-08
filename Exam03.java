import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		int num2 = sc.nextInt();
		System.out.println("ū �� Ȯ�� : " + largerNumbers(num1, num2));
	}

	public static int largerNumbers(int num1, int num2) {
		int result = (num1 == num2 ? 0 : (num1 > num2 ? num1 : num2));
		return result;

		// if��
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
