package day5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.ProductDto;

public class DynamicSqlTest {

	public static void main(String[] args) {
//		testNoFilter();
//		testCateFilter();
//		testAllFilter();
		testOrderByFilter();
	}

	public static void testNoFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		List<ProductDto> list = dao.search(null);
		System.out.println("검색 필터 없음 : "+ list);
	}
	public static void testOrderByFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("column", "PRICE");
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 없음 : "+ list);
	}
	public static void testCateFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("keyword", "사과");
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 -카테고리 : "+ list);
	}
	public static void testAllFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("keyword", "망고");
		map.put("category", "A2");
		//문제 : 가격 필터도 적용되도록 매퍼 xml 의 동적쿼리를 수정
		map.put("from", 10000); 
		map.put("to", 40000);
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 -카테고리 and 가격 : "+ list);
	}
	public static void testPnameCateFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("keyword", "사과");
		map.put("category", "A1");
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 -key, cate : "+ list);
	}
}
