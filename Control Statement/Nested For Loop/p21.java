class pamu{
	public static void main(String[]args){
		int a=1;
		for(int i=1;i<=4;i++){
			for(int j=4;j>=1;j--){
				if(i<j){
				System.out.print("="+" ");
				}else{
					System.out.print("*"+" ");
				}
			}
		System.out.println();
		}
	}
}
=>
= = = *
= = * *
= * * *
* * * *