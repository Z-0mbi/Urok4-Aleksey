import java.util.Scanner;

/*Написать программу, которая проверяет является ли 
 * введенное с клавиатуры число – дробным 
 */
public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double namber = sc.nextDouble();
		if(namber % 1 != 0) {
			System.out.println("Дробное");
		}
		else {
			System.out.println("Целое");
		}

	}

}
