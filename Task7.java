import java.util.Scanner;

/*Разработать программу вывода слова на экран 
 *справа – налево. Через Scanner вводите предложение 
 *и на выходе получаем строку в обратной последовательности.
 */

// НЕ РЕШИЛ
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		int oldLength = sentence.length();
		String newSent = sentence.replace("" + sentence.charAt(sentence.length() - 1), "");
		int newLength = newSent.length();
		int delta = oldLength - newLength + 1;
		
		int beginIndex = 0;
		int endIndex = 0;
		String[] mas = new String[delta];
		int j = 0;
		char a = 0x0020;
		for (int i=0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == a) {
				endIndex = i;
				mas[j] = sentence.substring(beginIndex, endIndex);
				beginIndex = i + 1;
				j++;
			}
			else if(i == sentence.length() - 1 ) {
				mas[j] = sentence.substring(beginIndex, sentence.length() - 1);
			}
		}
		
		for (int i = mas.length - 1; i >= 0; i--) {
			System.out.print(mas[i]);
		}

	}

}
