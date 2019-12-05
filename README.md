# JAVA

## 1. Test6.java
```java
//문자열과 문자를 입력 받아, 해당 문자열에서 문자가 몇 번 검색되었는지 출력
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
asdfasdfasdf
