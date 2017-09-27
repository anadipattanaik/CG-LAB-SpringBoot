
public class RunnableTest {

	public static void main(String[] args) {
		RunnableTest rTest = new RunnableTest();
		rTest.testThisKeyWord();
		
	}

	public void testThisKeyWord(){
		Thread threadMine = new Thread(new Runnable(){
            public void run(){
            	System.out.println(this);
                for(int i =0; i<3; i++){
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
            }
        }, "Thread B");
		threadMine.start();
		System.out.println(this);
	}
	
}
