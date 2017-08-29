import java.util.Scanner;

/*
 * В предложении заменить все пробелы символом «_»
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		char a = 0x0020;
		char b = 0x005F;
		String newSentence = sentence.replace(a, b);
		System.out.println(newSentence);

	}

}
