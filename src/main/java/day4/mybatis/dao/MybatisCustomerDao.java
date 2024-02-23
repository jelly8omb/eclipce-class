package day4.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.CustomerDto;
import mybatis.SqlSessionBean;

public class MybatisCustomerDao {

	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public MybatisCustomerDao() {
		
	}
	
	public List<CustomerDto> selectAll(){
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list = sqlSession.selectList("tblcustom.selectAll");
		return list;
	}
	
	public int insert(CustomerDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblcustom.insert",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int update(Map<String, Integer> map) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.update("tblcustom.update", map);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int delete(int age) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.delete("tblcustom.delete",age);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
}
