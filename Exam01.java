import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();

		System.out.print("������ �Է�(-, *) >> ");
		String op = sc.next();

		System.out.println("����� : " + cal(num1, num2, op));
	}

	// cal �޼ҵ� ����
	public static int cal(int num1, int num2, String op) {
		// ����� ���� �� �ִ� ���� ����
		// int result = 0;
		// ������ ���ϱ�

		if (op.equals("-")) {
			// ���꿡 ���� �۾� ����.
			return num1 - num2;
		} else {
			return num1 * num2;

		}
		// return result

	}

}
