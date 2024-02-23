package day4.mybatis.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//웹에서는 vo 단어 대신에 dto 많이 씁니다. 
//data transter object. db, 서블릿(컨트롤러), jsp(뷰) 사이에서 데이터를 전달해주는 역할.
//마이바티스에서 매핑하ㄹ때 객체는 기본 생성자가 있으면 기본생성자로 없으면 커스텀 생성자로 객체 생성.
@Getter
@ToString
@AllArgsConstructor			//커스텀 생성자 : 컬럼명과 변수명 일치 안해도 된다.
@NoArgsConstructor			//기본 생성자 : 객체 생성 후 setter 로 동작하므로 컬럼명과 변수명 일치 해야함.
@EqualsAndHashCode
public class BuyDto {
	private int buy_idx;
    private String CUSTOMID;
    private String PCODE;
    private int QUANTITY;
    private Date buy_date;
}
