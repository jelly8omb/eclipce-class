package day4.mybatis.dto;

import java.sql.Date;

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
public class CustomerDto {
	private String customId;
    private String name;
    private String email;
    private int age;
    private Date reg_date;
}
