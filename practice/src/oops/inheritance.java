package oops;

 class example {
	public void add() {
		System.out.println("add method");
	}}
	 class sample extends example{
		public void sub() {
			System.out.println("sub method");
		}}
	
	public class inheritance{
		
	public static void main(String[] args) {
		sample i=new sample();
		i.add();
		i.sub();
		
		
		
	}

}
