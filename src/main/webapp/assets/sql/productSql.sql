select * from TBL_PRODUCT;

select * from TBL_PRODUCT where category = 'B1';

select * from TBL_PRODUCT where pname like '%'|| '사과' ||'%';

select * from TBL_PRODUCT where price between 10000 and 40000;

select * from TBL_PRODUCT where category = 'B1' and pname like '%'|| '사과'||'%' and(price between 10000 and 40000);

select distinct category from tbl_product order by category;

create table tbl_category(
	code char(2) primary key,
	name varchar2(20) not null
);

insert into tbl_category values('A1','국내과일');
insert into tbl_category values('A2','수입과일');
insert into tbl_category values('B1','인스턴트');
insert into tbl_category values('B2','선물세트');
insert into tbl_category values('C1','과자류');


