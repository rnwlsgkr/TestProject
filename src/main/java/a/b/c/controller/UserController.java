package a.b.c.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import a.b.c.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// http://localhost:8080/save?testNum=2&testVarchar=hello
	@GetMapping("/save")
	public void save(int testNum, String testVarchar) {
		HashMap<String, Object> testData = new HashMap();
		testData.put("testNum", testNum);
		testData.put("testDate", new Date());
		testData.put("testVarchar", testVarchar);
		userService.save(testData);
	}

	/*
	 * @GetMapping("/update") public void update(int testNum, String testVarchar) {
	 * try { HashMap<String, Object> testData = new HashMap();
	 * testData.put("testNum", testNum); testData.put("testVarchar", testVarchar);
	 * userService.update(testData); } catch (Exception e) {
	 * System.out.println(e.getMessage()); } }
	 */

	@GetMapping("/delete")
	public void delete(int testNum) {
		userService.delete(testNum);
	}
	
	@GetMapping("/getOne")
	public void getOne(int testNum) {
		HashMap<String, Object> map = userService.getOne(testNum);
		System.out.println(map);
		System.out.println(map.get("TESTDATE"));
		System.out.println(map.get("TESTVARCHAR"));
		System.out.println(map.get("TESTNUM"));
	}
	
	@GetMapping("/getAll")
	public void getAll() {
		List<HashMap<String, Object>> list = userService.getAll();
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
	
}
