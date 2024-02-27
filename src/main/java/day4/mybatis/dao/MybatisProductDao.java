package day4.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.CateDto;
import day4.mybatis.dto.ProductDto;
import mybatis.SqlSessionBean;

public class MybatisProductDao {

	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public MybatisProductDao() {
	}
	
	public List<ProductDto> productAll(){
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproduct.productAll");
		return list;
	}
	
	public int insertpro(ProductDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblproduct.insertpro",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	public List<CateDto> getCategory() {
		SqlSession sqlSession = sessionFactory.openSession();
		List<CateDto> list = sqlSession.selectList("tblproduct.getCategory");
		sqlSession.close();
		return list;
	}
	
	
	
	public int updatepro(Map<String, Integer> map) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.update("tblproduct.updatepro", map);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public int deletepro(int PRICE) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.delete("tblproduct.deletepro",PRICE);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public List<ProductDto> search(Map<String, Object> map){
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproduct.search",map);
		sqlSession.close();
		return list;
	}
}
