select * from vip;
select * from PRODUCTS;
desc myproducts;
select * from MYPRODUCTS;
select * from CUML_USE;
alter table cuml_use 
modify priod date default sysdate;
ALTER TABLE myproducts DROP PRIMARY KEY;

alter table cuml_use 
add vip_id varchar2(30);

alter table cuml_use
add constraint c_id_fk foreign key(vip_id) references vip(vip_id);