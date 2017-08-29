import java.util.Scanner;

/*Реализовать программу расчета прибыли от депозита в банке
 *для нескольких клиентов. Используйте массив
 */
public class Task1 {

	public static void main(String[] args) {
		int pr = 10; // Процентная ставка
		int year = 2;// Кол-во лет 
		
		// Кол-во человек и сумма их депозитов
		int[] money = new int[3];// Кол-во человек
		Scanner sc = new Scanner(System.in);
		for (int j=0; j < money.length; j++) {
			if (sc.hasNextInt()) {
				money[j] = sc.nextInt();
			}
			else {
				System.out.println("Ошибка ввода");
				return;
			}
		}
		
		//Начисления
		for (int j = 0; j < money.length; j++) {
			System.out.println("Клиент № " + (j+1));
			for(int i=1;i<=year;i++){
				int pribil = money[j] * pr / 100;
				money[j] += (money[j] * pr / 100);
				System.out.println("за "+i+" год прибыль составила  "+pribil+" у вас "+money[j]);
			}
		}

	}

}
