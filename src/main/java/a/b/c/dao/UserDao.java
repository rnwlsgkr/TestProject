package a.b.c.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

@Repository
public class UserDao {
	
	@Resource(name="oracleSql")
	private SqlSessionTemplate sqlSessionTemplate;
	
	private String nameSpace ="user.";

	@Transactional
	public void save(HashMap<String, Object> map)  {
		 sqlSessionTemplate.insert(nameSpace + "save", map);
	}
	
	/*
	 * @Transactional public void update(HashMap<String, Object> map) { int n =
	 * sqlSessionTemplate.update(nameSpace + "update", map); }
	 */
	
	@Transactional
	public void delete(int testNum)  {
		sqlSessionTemplate.delete(nameSpace + "delete", testNum);
	}
	
	@Transactional
	public HashMap<String, Object> getOne(int testNum)  {
		return sqlSessionTemplate.selectOne(nameSpace + "getOne", testNum);
	}
	
	@Transactional
	public List<HashMap<String, Object>> getAll()  {
		return sqlSessionTemplate.selectList(nameSpace + "getAll");
	}
}
