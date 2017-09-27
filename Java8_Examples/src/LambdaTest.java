
interface Math{
	abstract int operation(int a, int b);
}

public class LambdaTest {

	public static void main(String[] args) {
		/*Math m = new Math(){
			public int operation(int a, int b){
				System.out.println(a+b);
				return a+b;
			}
		};
		
		System.out.println(m.operation(5, 9));*/
		
		//Using Lambda Expression
		Math m = (a,b)->(a+b);
		System.out.println("Operration:"+m.operation(5, 9));
		
		Square sq  = (a)->(a*a);
		System.out.println("Square:"+sq.square(5));
		LambdaTest ltest = new LambdaTest();
		ltest.locaMethod();
		
		
	}
	public void locaMethod(){
		int varLocal = 10;
		LocalVariableTest ltest = ()->{
			//varLocal = 20;
			System.out.println("locaMethod inside:"+varLocal);
		};
		ltest.mone();
		System.out.println("locaMethod outside:"+varLocal);
	}	
	
	
}

interface Square{
	abstract int square(int a);
}

interface LocalVariableTest{
	public void mone();
} 