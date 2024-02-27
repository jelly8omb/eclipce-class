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
	
	public List<CustomerDto> customAll(){
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list = sqlSession.selectList("tblcustom.customAll");
		return list;
	}
	
	public int insertCus(CustomerDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblcustom.insertCus",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int updateCus(Map<String, Integer> map) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.update("tblcustom.updateCus", map);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int deleteCus(int age) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.delete("tblcustom.deleteCus",age);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
}
