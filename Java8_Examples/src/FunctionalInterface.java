
interface Predicate<T>{
	boolean test(T t);
}  

interface Consumer<T>{
	void accept(T t);
}

/*interface <T> Consumer<T>{
	void supply(T t);
}
*/
public class FunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (x)->{
			if(x>0) return true;
			else return false;
		};
		
		Consumer<String> consumer = (s)->{
			System.out.println("Input String is :"+s);
		};
		
		System.out.println(predicate.test(12));
		consumer.accept("Anadi");
		
	}

}
