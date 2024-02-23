package day4.mybatis.dto;

import java.sql.Date;
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
public class CustomerBuyDto {
	private int buy_idx;
    private String pcode;
    private String pname;
    private int price;
    private int QUANTITY;
    private Timestamp buy_date;
}
