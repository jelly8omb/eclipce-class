package day4.mybatis.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor			
@NoArgsConstructor			
@EqualsAndHashCode
public class ProductDto {
	private String pcode;
    private String category;
    private String pname;
    private int price;
    
    @Override
    public String toString() {
        return String.format("%6s %15s %40s\t %,8d \n", 
                            category,pcode,pname,price);
    }
}
