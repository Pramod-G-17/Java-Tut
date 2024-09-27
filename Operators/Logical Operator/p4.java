class pamu4{
	public static void main(String[]args){
		int a=2;
		int b=9;
		boolean c=++a < b++ || a++ < ++b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}

O/P:-

3
10
true