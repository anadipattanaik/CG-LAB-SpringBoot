
interface Left{
	int a = 10;
	public default void mone(){
		System.out.println("Calling from Left : mone "+ a);
	};	
}

interface Right{
	int a = 20;
	public default void mone(){
		System.out.println("Calling from Right : mone "+ a);
	};
}

public class DefaultMethodImpl implements Left, Right{

	public static void main(String[] args) {
		DefaultMethodImpl impl = new DefaultMethodImpl();
		impl.mone();
	}
	
	/*public void mone(){
		Left.super.mone();
	}
	
	public void mone(){
		Right.super.mone();
	}*/

	public void mone(){
		System.out.println("Calling from own : mone "+ Right.a);
	}
}
