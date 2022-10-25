package a.b.c.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void save(HashMap<String, Object> map)  {
		userDao.save(map);
	}
	
	/*
	 * public void update(HashMap<String, Object> map) { userDao.update(map); }
	 */
	
	public void delete(int testNum)  {
		userDao.delete(testNum);
	}
	
	public HashMap<String, Object> getOne(int testNum)  {
		return userDao.getOne(testNum);
	}
	
	public List<HashMap<String, Object>> getAll()  {
		return userDao.getAll();
	}

}
