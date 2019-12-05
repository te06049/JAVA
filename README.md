# JAVA

## 1. Test6.java
```java
import java.util.Scanner;

class Test6{
	public static void main(String [] args){
		String st1, st2;
		char c;
		int count=0;
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("문자열: ");
		st1 = s.nextLine();
		
		System.out.print("문자: ");
		st2 = s.nextLine();
		c = st2.charAt(0);
		
		for(int i = 0;i<st1.length();i++){
			if(st1.charAt(i) == c){
				count++;
				System.out.printf("%d번째 ",i+1);
			}
		}
		System.out.println();
		System.out.println("문자열 \"" + st1 +"\"에서 문자 \'" + c + "\'는" + count +"번 검색되었습니다.");
		
		
	}
}
```
문자열과 문자를 입력 받아, 해당 문자열에서 문자가 몇 번 검색되었는지 출력하는 프로그램이다.

##2. Test5.java
```java
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
```
사용자로부터 두 정수 a,b 입력받아 a, b사이 수들 (a, b포함)의 약수들 출력하는 프로그램.
