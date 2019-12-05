//사용자로부터 두 정수 a,b 입력받아 a, b사이 수들 (a, b포함)의 약수들 출력
import java.util.Scanner;

class Test5{
	public static void main(String [] args){
		int a, b;
		Scanner s = new Scanner (System.in);
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		
		for(int i=a;i<=b;i++){
			System.out.printf("%d의 약수: ",i);
			for(int j=1;j<=i;j++){
				if(i%j==0) System.out.printf("%d, ",j);
			}
			System.out.println("\b\b ");
			
		}
	}
}
