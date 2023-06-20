class ArrayTest2{

	public static void main(String[] args){
		//Java를 포함한 대부분의 배열은 동적으로 
		String[][] arr=new String[3][2];

		arr[0][0] ="사과";
		arr[0][1] ="딸기";
		arr[1][0] ="벤츠";
		arr[1][1] ="아우디";
		arr[2][0] ="Java";
		arr[2][1] ="Oracle";

		for(int a=0; a<arr.length;a++){
			for(int i=0; i<arr[a].length; i++){
				System.out.print(arr[a][i]);
			}
			System.out.println(""); //println에서 ln 은 줄바꿈. 줄바꿈은 층수과 관련.
		}
	}
}