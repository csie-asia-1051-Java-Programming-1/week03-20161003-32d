package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021055 王浚維
 */
import java.util.Scanner;
public class ex03_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入英文");
		char ch1 = scn.next().charAt(0);
		int v1 = (ch1);
		char ch2 = 0;
		if (v1>=65&&v1<=90){ch2 = (char) (v1+32);
		}
		else if (v1>=97&&v1<=122){ch2 = (char)(v1-32);}
		
		
		System.out.print(ch2);
		
	}

}
