import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();
		names.add("");names.add("Anadi");names.add("Lila");names.add("");names.add("Kanak");
		
		Set<String> filteredSet = names.stream().filter(name->!name.isEmpty()).collect(Collectors.toSet());
		//System.out.println(filteredSet);
		
		Map<String, String> employees = new HashMap<String, String>();
		
		employees.put("1", "Anadi");
		employees.put("2", "Kas");
		employees.put("3", "Filt");
		employees.put("4", "");

		/*Map<String,String> filteredMap = employees.entrySet().stream().filter(temp->!temp.getValue().isEmpty()).
				collect(Collectors.toMap());
		*/
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Anadi","Capgemini"));
		emps.add(new Employee("Mohapatra","TCS"));
		emps.add(new Employee("Pritesh","IGATE"));
		emps.add(new Employee("Vithal","Capgemini"));
		
		List<Employee> filterEmp = emps.stream().filter(emp->emp.getCompany().equals("Capgemini") && emp.getName().equals("Anadi")).collect(Collectors.toList());
		
		List<String> filterEmpModified = emps.stream().map(emp->emp.getName().concat("01")).collect(Collectors.toList());
		System.out.println(filterEmpModified);
		System.out.println(filterEmp);
	}

}

class Employee{
	private String name = "";
	private String company = "";
	Employee(String name, String company){
		this.company = company;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
}