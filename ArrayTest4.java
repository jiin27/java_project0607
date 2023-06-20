class ArrayTest4{
	public static void main(String[] args){
		String[] arr={
			"사과", "딸기", "바나나"
		};
		String[][] data={
			{"사과","딸기","바나나"},
			{"벤츠","아우디","BMW"}
		};

		for(int a=0; a<data.length; a++){
			for(int i=0; i<data[a].length; i++){
				System.out.print(data[a][i]);
			}
			System.out.println("");
		}
	}
}