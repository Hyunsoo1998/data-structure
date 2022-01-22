
public class chapter3_multiArray_2 {
public static void main(String[]args) {
	/*사과	 포도	 	오렌지
	 10000	20000 	12000 
	 8000	3000	15000	
	 20000	15000	38000
	 13000	20000	30000
	 30000	12000	20000
	 35000	30000	25000
	 50000	23000	10000
	 
	 */
	int [][] fruitMarket = new int [] [] {
		{10000, 20000, 12000},
		{8000 , 3000 , 15000},
		{20000 , 15000, 38000},
		{13000 , 20000, 30000},
		{30000, 12000 , 20000},
		{35000, 30000, 25000 },
		{50000, 23000, 10000} 
	
	};
	int total =0;
	int apple = 0; 
	int grape = 0;
	int orange = 0;
	
	for (int i = 0 ; i< fruitMarket.length; i ++) {
		//j의 조건식 주의
		for(int j = 0 ; j <fruitMarket[i].length; j ++) {
			if (j==0) {
				apple += fruitMarket[i][j];
			}else if(j==1) {
				grape += fruitMarket[i][j];
				
			}else  {
				orange += fruitMarket[i][j];
			}
			total += fruitMarket[i][j];
		}
	}
	System.out.println("총합: " + total);
	System.out.println("사과 평균: "+apple/ fruitMarket.length);
	System.out.println("포도 평균: "+grape/ fruitMarket.length);
	System.out.println("오렌지 평균:"+orange / fruitMarket.length);
}
}
//위 코드에서 주의 깊게 볼 부분은 두번째 for문이다. 첫번째로 사용된 for문은 일주일 간의 수익을 계산하기
//위한 반복문이며, 두번째 for문은 하루의 총 수익과 평균값을 계산하기 위한 반복문이다.
//두번째 for문의 조건식은 fruitMarket의 크기가 아닌 fruitMarket[i]의 크기가 된다.
//하루 동안의 과일 판매량을 구하고자 만약 fruitMarket.length의 크기로 반복문을 한다면 j가 3이되는 시점에 배열 요소에 접근할때
//ArrayIndexOutOfboundsException 예외가 발생한다.
