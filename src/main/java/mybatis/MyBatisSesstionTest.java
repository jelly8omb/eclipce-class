package mybatis;


import day4.mybatis.dao.MybatisBuyDao;
import day4.mybatis.dao.MybatisCustomerDao;
import day4.mybatis.dao.MybatisProductDao;

public class MyBatisSesstionTest {

	public static void main(String[] args) {

		testProduct();
		testCustom();
		testBuy();
		
		
		
	}
	
	public static void testProduct() {
		MybatisProductDao prodao = new MybatisProductDao();
		System.out.println("dao 객체 : "+ prodao);
	}
	
	public static void testCustom() {
		MybatisCustomerDao cusdao = new MybatisCustomerDao();
		System.out.println("dao 객체 : "+ cusdao);
	}
	
	public static void testBuy() {
		MybatisBuyDao buydao = new MybatisBuyDao();
		System.out.println("dao 객체 : "+ buydao);
	}

}
