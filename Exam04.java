import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		int num2 = sc.nextInt();

		System.out.println("10�� ����� �� : " + close10(num1, num2));

	}

	public static int close10(int num1, int num2) {
		
//		int des = num1 - 10;
//		int des2 = num2 - 10;
//
//		// ���� ������
//		// des=des>0? des:(des*-1);
//		// des2=des2>0? des2:(des2*-1);
//		
//		// if��
//		if (des < 0) {
//			des = -des;
//		}
//		if (des2 < 0) {
//			des2 = -des2;
//		}
		
		// Math Class�� �ִ� abs() ���밪 �Լ� ����ϱ�
		int a=Math.abs(10-num1);  //-��ȣ �������� �������
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
