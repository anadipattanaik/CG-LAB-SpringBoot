package com.anadi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee)ac.getBean("employee",Employee.class);
		emp.setName("Anadi B Pattanaik");
		emp.setEmployeeNumber(82900);
		Address add = new Address();
		add.setHouseNo("KhesePark");
		add.setPin(411032);
		emp.setAddress(add);
		System.out.println(emp.getEmployeeNumber());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getHouseNo());
		System.out.println(emp.getAddress().getPin());
		
	}

}
