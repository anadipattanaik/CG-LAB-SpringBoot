package com.anadi.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private  Employee e1;
	@Autowired
	private  Department d;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/findEmp/{id}")
	public List<Employee> getEmployeeList(@PathVariable String id) {
		List<Employee> listEmp = new ArrayList<Employee>();
		for(int i=Integer.parseInt(id) ;i<5;i++){
			e1.setAge(i+20);
			e1.setName("Name"+i);
			d.setName("Chubb"+i);
			e1.setDept(d);
			listEmp.add(e1);
			
		}
		return listEmp;
		
	}
}
