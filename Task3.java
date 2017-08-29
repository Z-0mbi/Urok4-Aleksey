
/*Дано слово из четного числа букв. Поменять местами его 
 *половины. Вывести полученную строку в верхнем регистре.
 */
public class Task3 {

	public static void main(String[] args) {
		
		String word = new String("жало");
		String newWord = word.substring(word.length()/2) + word.substring(0, word.length()/2);
		System.out.println(newWord.toUpperCase());
	}

}
