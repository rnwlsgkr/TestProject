package a.b.c.controller;

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
	
	@GetMapping("/test")
	public void test() {
		List<Map<String, Object>> testData = userService.test();
		for(int i = 0; i<testData.size(); i++) {
			Map<String, Object> map = testData.get(i);
			System.out.println(map);
		}
	}

}
