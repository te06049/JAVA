//구구단 출력하기
import java.util.Scanner;

class Test2{
	public static void main(String [] args){
		int x;
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("몇 단: ");
		x = s.nextInt();
		
		for(int i = 1; i <= 9; i++){
			System.out.printf("%d X %d = %d\n", x, i, x*i);
		}
	}
}
