class pamu{
	public static void main(String[]args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j<=i){
				System.out.print(i+" ");
				}else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}
O/P:-
1
2 2
3 3 3
4 4 4 4