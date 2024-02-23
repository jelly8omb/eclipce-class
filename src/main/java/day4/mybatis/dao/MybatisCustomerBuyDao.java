package day4.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.BuyDto;
import mybatis.SqlSessionBean;
import project.vo.CustomerBuyVo;

public class MybatisCustomerBuyDao {

	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public MybatisCustomerBuyDao() {
		
	}
	
	public List<CustomerBuyVo> customBuyAll(){
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerBuyVo> list = sqlSession.selectList("tblcustom.customBuyAll");
		return list;
	}
	
	public int customBuyInsert(CustomerBuyVo dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblcustom.customBuyInsert",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int customBuyUpdate(Map<String, Integer> map) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.update("tblcustom.customBuyUpdate", map);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int customBuyDelete(int buy_idx) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.delete("tblcustom.customBuyDelete",buy_idx);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
}
