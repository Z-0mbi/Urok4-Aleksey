import java.util.Scanner;

/*Разработать программу вывода слова на экран 
 *справа – налево. Через Scanner вводите предложение 
 *и на выходе получаем строку в обратной последовательности.
 */


public class Task7 {

	public static void main(String[] args) {
		//Вводим слово
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();		
		//String sentence = "we wer rew";
		sentence.trim();
		
		//Вычисляем кол-во слов
		int oldLength = sentence.length();
		String newSent = sentence.replace(" ", "");
		int newLength = newSent.length();
		int amountWords = oldLength - newLength + 1;
		
		//Делаем массив char
		char[] mas = sentence.toCharArray();
		char a = 0x0020;
		int nam = mas.length;
		
		for (int i = mas.length - 1; i >= 0; i--) {
			if (mas[i] == a) {				
				for (int j = i+1; j < nam; j++) {
					System.out.print(mas[j]);
				}
				nam = i;
				System.out.print(" ");
			}
			else if (i == 0) {				
				for (int j = i; j < nam; j++) {
					System.out.print(mas[j]);
				}
			}
		}
		
		
		
		
		
		
	}
}
