import java.util.Scanner;

// Дано предложение. Определить число слов в нем. 

public class Task4 {

	public static void main(String[] args) {
		
		//Вводим предложение
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sentence = sentence.trim();
		
		//Преобразуем строку в массив
		char[] sentenceChar = new char[sentence.length()];
		sentenceChar = sentence.toCharArray();
		
		//Считаем кол-во пробелов
		int count = 1;
		for (int i = 1; i < sentenceChar.length; i++) {
			if (sentenceChar[i] == ' ') {
				count++;
			}
		}
		System.out.println("Кол-во слов " + (count));
		
		//Решение 2
		int oldLength = sentence.length();//Длина оригинала
		String newSent = sentence.replace(" ", "");
		int newLength = newSent.length();//Длина без пробелов
		System.out.println("Кол-во слов " + (oldLength - newLength + 1));

	}

}
