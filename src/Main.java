import java.util.Scanner;

import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

/*Напишете задача, която отпечатва на екрана всички
 *  нечетни числа от 1 до n (въвежда се от клавиатурата),
 *   използвайки цикъла while.
*/

/*Напишете програма, която приема две 
 * числа N и M. Програмата трябва да
 *  пресметне колко е N на степен М.
*/
public class Main {

	public static void task1() {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (num < n) {
			if (num % 2 != 0) {
				System.out.println(num);
			}

			num++;
		}

		sc.close();
	}

	public static void main(String[] args) {
//task1();
/*Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();
int s =1;

for(int i = 1; i <= m; i++){

    s *= n;
}

System.out.println(s);*/

		
		//Напишете програма, която кара 
		//потребителя за въвежда числа и 
		//ги сумира. Края на програмата настъпва, 
		//единствено когато потребителя въведе 
		//числото 0.
	/*	Scanner sc = new Scanner(System.in);
		int chislo = sc.nextInt();
		int sum =0;
		while(chislo !=0){

			sum += chislo; 
			System.out.println(sum);
			chislo = sc.nextInt();
			
		}
		System.out.println(sum);*/
		
		/*
		 * Направете програма, която извежда на
		 *  конзолата
		 *  всички числа от 1 до
		 * 100, които се делят или на 7, или на 11,
		 *  без остатък.
		 */

		for (int i = 1; i < 100; i++){
			if(i % 7 ==0 || i % 11 ==0){
				System.out.print(i + " ");
			}
			
		}
	}
}
