package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import project.vo.ProductVo;

public class TblProductDao {
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String URL ="jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";

    
    
    private Connection getConnection() throws SQLException {
    	Connection conn = null;
    	try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        return conn;
    }

    public List<ProductVo> getProductVo(String category){
        List<ProductVo> list = new ArrayList<>();
        
        String sql = "SELECT * FROM TBL_PRODUCT WHERE CATEGORY = ?";
        try (Connection connection = getConnection();
        		PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, category);
            ResultSet rc = pstmt.executeQuery();
            if (rc.next()) {
                ProductVo pv = new ProductVo(rc.getString(1), 
                                    rc.getString(2), 
                                    rc.getString(3), 
                                    rc.getInt(4));
            list.add(pv);
            }
        } catch (SQLException e) {
            System.out.println("ERROR : " + e.getMessage());
        }

        return list;
    }

    public List<ProductVo> selectByPname(String pname){
        List<ProductVo> list = new ArrayList<>();
        
        String sql = "SELECT * FROM TBL_PRODUCT WHERE PNAME LIKE '%'|| ? ||'%' ORDER BY CATEGORY";
        try (Connection connection = getConnection();
        		PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, pname);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ProductVo pv = new ProductVo(rs.getString(1), 
                                            rs.getString(2), 
                                            rs.getString(3), 
                                            rs.getInt(4));
                list.add(pv);
            }
        } catch (SQLException e) {
            System.out.println("ERROR : " + e.getMessage());
        }
        return list;
    }

    public Map<String, Integer> getPriceTable(){
        Map<String, Integer> map = new HashMap<>();
        String sql = "select pcode, price from tbl_product";
        try (Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    map.put(rs.getString(1), rs.getInt(2));
                }
        } catch (SQLException e) {
            System.out.println("getPriceTable 예외 발생 : " + e.getMessage());
        }
        return map;
        
    }
    
    public List<ProductVo> allProduct(){
    	List<ProductVo> list = new ArrayList<>();
    	String sql = "SELECT * FROM TBL_PRODUCT";
    	try(Connection connection = getConnection();
    			PreparedStatement ps = connection.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				list.add(new ProductVo(rs.getString(1),
										rs.getString(2),
										rs.getString(3),
										rs.getInt(4)));
				
			}
		} catch (SQLException e) {
			System.out.println("ERROR : " + e.getMessage());
		}
    	return list;
    }
    
    //리턴 타입 int : 정상 insert 완료 1 리턴, 그렇지 않으면 0
    public int insertPro(ProductVo vo) {
    	
    	String sql = "INSERT INTO TBL_PRODUCT VALUES(?,?,?,?)";
    	int result = 0;
    	try (Connection connection = getConnection();
    			PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setString(1, vo.getPcode());
			ps.setString(2, vo.getCategory());
			ps.setString(3, vo.getPname());
			ps.setInt(4, vo.getPrice());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insertPro 실행 예외 발생 : " + e.getMessage());
		}
    	return result;
    }
}
