package mybatis;


import java.util.List;

import day4.mybatis.dao.MybatisBuyDao;
import day4.mybatis.dao.MybatisCustomerDao;
import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.BuyDto;
import day4.mybatis.dto.CustomerDto;
import day4.mybatis.dto.ProductDto;

public class MyBatisSesstionTest {

	public static void main(String[] args) {

		testProduct();
		testCustom();
		testBuy();
		
		
		
	}
	
	public static void testProduct() {
		MybatisProductDao prodao = new MybatisProductDao();
		System.out.println("dao 객체 : "+ prodao);
		List<ProductDto> list = prodao.productAll();
		System.out.println(list);
		
	}
	
	public static void testCustom() {
		MybatisCustomerDao cusdao = new MybatisCustomerDao();
		System.out.println("dao 객체 : "+ cusdao);
		List<CustomerDto> list = cusdao.customAll();
		System.out.println(list);
		int result = cusdao.insertCus(new CustomerDto("app1e","김사과","app1e@naver.com",21,null));
		System.out.println(result);
		
	}
	
	public static void testBuy() {
		MybatisBuyDao buydao = new MybatisBuyDao();
		System.out.println("dao 객체 : "+ buydao);
		List<BuyDto> list = buydao.selectAll();
		System.out.println(list);
	}

}
