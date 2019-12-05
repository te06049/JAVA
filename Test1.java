/*사용자로부터 일차원 배열의 원소(성분) 개수를 입력 받아 그 만큼의 double 타입 배열을
생성하시오. 또한, 아래와 같은 작업을 하는 메소드를 만들어 테스트하시오.
//initArr(double [] arr): 배열의 성분을 0이상 10미만의 랜덤 넘버로 초기화
//printArr(double [] arr): 배열의 성분을 출력
//sumArr(double [] arr): 배열의 모든 성분의 합을 반환
//maxArr(double [] arr): 배열의 최댓값을 반환
//indexMaxArr(double [] arr): 배열의 최댓값의 인덱스를 반환
//shuffleArr(double [] arr): 배열의 성분의 순서를 랜덤으로 재배치
//rotateR1Arr(double [] arr)/rotateL1Arr(double [] arr): 배열의 성분을 오
른쪽(왼쪽)으로 한 칸 로테이션
//rotateRnArr(double [] arr, int n)/rotateLnArr(double [] arr, int n):
배열의 성분을 오른쪽(왼쪽)으로 n칸 로테이션
*/
import java.util.*;

class Test1{
	public static void main(String [] args){
		double [] array;
		int size;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("배열 성분 개수: ");
		size = s.nextInt();
		
		array = new double[size];
		
		System.out.print("초기화 전 배열 성분: ");
		printArr(array);
		System.out.println();
		
		System.out.print("초기화 후 배열 성분: ");
		initArr(array);
		printArr(array);
		System.out.println();
		
		System.out.print("배열 성분의 합: ");
		System.out.printf("%.1f\n",sumArr(array));
		
		System.out.print("배열 성분의 최댓값: ");
		System.out.printf("%.1f\n",maxArr(array));

		System.out.print("배열 성분의 최댓값의 인덱스: ");
		System.out.printf("%d\n",indexMaxArr(array));
		
		System.out.print("배열의 성분의 순서를 랜덤으로 재배치: ");
		shuffleArr(array);
		printArr(array);
		System.out.println();
		
		System.out.print("배열의 성분을 오른쪽으로 한 칸 로테이션: ");
		rotateR1Arr(array);
		printArr(array);
		System.out.println();
		
		System.out.print("배열의 성분을 왼쪽으로 한 칸 로테이션: ");
		rotateL1Arr(array);
		printArr(array);
		System.out.println();
		
		System.out.print("배열의 성분을 오른쪽으로 3 칸 로테이션: ");
		rotateRnArr(array, 3);
		printArr(array);
		System.out.println();
		
		System.out.print("배열의 성분을 왼쪽으로 3 칸 로테이션: ");
		rotateLnArr(array, 3);
		printArr(array);
		System.out.println();
	}
	//initArr(double [] arr): 배열의 성분을 0이상 10미만의 랜덤 넘버로 초기화
	static void initArr(double [] arr){
		Random r = new Random();
		for (int i=0;i<arr.length;i++){
		arr[i] = r.nextDouble()*10;
		}
		return;
	}
		
	//printArr(double [] arr): 배열의 성분을 출력
	static void printArr(double [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.printf("%.1f  ",arr[i]);
		}
		return;
	}	
	//sumArr(double [] arr): 배열의 모든 성분의 합을 반환
	static double sumArr(double [] arr){
		double sum=0;
		
		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		
		return sum;
	}
	
	//maxArr(double [] arr): 배열의 최댓값을 반환
	static double maxArr(double [] arr){
		double max=arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]) max=arr[i];
		}
		return max;
	}
	
	//indexMaxArr(double [] arr): 배열의 최댓값의 인덱스를 반환
	static int indexMaxArr(double [] arr){
		int index=0;
		double max=arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){ 
				max=arr[i]; index=i;
			}
		}
		return index;
	}
	
	//shuffleArr(double [] arr): 배열의 성분의 순서를 랜덤으로 재배치
	static void shuffleArr(double [] arr){
		double tmp;
		int rNum;
		Random r = new Random();
		
		for(int i=0;i<arr.length-1;i++){
			rNum = r.nextInt(arr.length);
			tmp = arr[i];
			arr[i] = arr[rNum];
			arr[rNum] = tmp;
		}
		return;
	}
	
	//rotateR1Arr(double [] arr)/rotateL1Arr(double [] arr): 배열의 성분을 오른쪽(왼쪽)으로 한 칸 로테이션
	static void rotateR1Arr(double [] arr){
		double tmp = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = tmp;
		return;
	}
	
	static void rotateL1Arr(double [] arr){
		double tmp = arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = tmp;
	}
	
	//rotateRnArr(double [] arr, int n)/rotateLnArr(double [] arr, int n): 배열의 성분을 오른쪽(왼쪽)으로 n칸 로테이션
	static void rotateRnArr(double [] arr, int n){
		double tmp;
		n %= arr.length;
		
		for(int j=0;j<n;j++){
		tmp = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = tmp;
		}
	}
	
	static void rotateLnArr(double [] arr, int n){
		double tmp;
		n %= arr.length;
		
		for(int j=0;j<n;j++){
			tmp = arr[0];
			for(int i=0;i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = tmp;
		}
	}
	
}
