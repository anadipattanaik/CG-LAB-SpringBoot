import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptInJava {

	public static void main(String[] args) {
		ScriptEngineManager seManager = new ScriptEngineManager();
		ScriptEngine nashhorn = seManager.getEngineByName("nashorn");
		
		String name = "Anadi";
		Integer result = null;
		try {
			nashhorn.eval("print('"+name+"')");
			result = (Integer)nashhorn.eval("10+2");
			System.out.println(result);
		} catch( Exception e){
			
		}
	}

}
