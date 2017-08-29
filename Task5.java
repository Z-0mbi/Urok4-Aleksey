import java.util.Scanner;

/*Дано предложение. Определить долю
 *(в %) последней буквы в нем. (находим последнюю букву
 * в слове, находим количество таких букв в предложении 
 * и считаем пропорцией)
 */
public class Task5 {

	public static void main(String[] args) {
		//Вводим предложение
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		
		int oldLength = sentence.length();
		String newSent = sentence.replace("" + sentence.charAt(sentence.length() - 1), "");
		int newLength = newSent.length();
		double delta = (double)(oldLength - newLength) / oldLength;
		System.out.println("Доля последней буквы " + delta);

	}

}
