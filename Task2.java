import java.util.Scanner;

/*Дано слово. Верно ли, что оно начинается 
 *и заканчивается на одну и туже букву?
 */
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		if (word.charAt(0) == word.charAt(word.length()-1)) {
			System.out.println("Слово начинается и заканчивается на одну и туже букву");
		}
		else {
			System.out.println("Слово начинается и заканчивается на разные буквы");
		}
		

	}

}
