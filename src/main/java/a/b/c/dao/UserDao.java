package a.b.c.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

@Repository
public class UserDao {
	
	@Resource(name="oracleSql")
	private SqlSessionTemplate sqlSessionTemplate;

	@Transactional
	public List<Map<String, Object>> test()  {
		return sqlSessionTemplate.selectList("user.getData", null);
	}
}
