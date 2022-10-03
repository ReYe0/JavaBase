package com.study.myproject03.junit;

import com.study.myproject03.domain.Employee;
import com.study.myproject03.service.NameListService;
import com.study.myproject03.service.TeamException;
import org.testng.annotations.Test;


/**
 * 对NameListService类的测试
 * @Description 
 * @author shkstart  Email:shkstart@126.com
 * @version 
 * @date 2019年2月12日上午11:09:14
 *
 */
public class NameListServiceTest {

	@Test
	public void testGetAllEmployees(){
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for(int i = 0;i < employees.length;i++){
			System.out.println(employees[i]);
		}
	}
	
	@Test
	public void testGetEmployee(){
		NameListService service = new NameListService();
		int id = 1;
		id = 101;
		try {
			Employee employee = service.getEmployee(id);
			System.out.println(employee);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
