set sqlblanklines on;

DROP SEQUENCE cal_id_seq;
CREATE  SEQUENCE cal_id_seq
      INCREMENT BY 1
      START WITH 92
      MAXVALUE 9999;


DROP SEQUENCE cuml_id_seq;
CREATE  SEQUENCE cuml_id_seq
      INCREMENT BY 1
      START WITH 1
      MAXVALUE 9999;


drop table VIP cascade constraints;

create table VIP
(vip_id varchar2(10) not null,
member_pw varchar2(10) not null,
name varchar2(7) not null,
age number(3) not null,
cellphone number(12),
constraint test_VIP_pk primary key(vip_id)
);



drop table PRDCT_RGSTR cascade constraints;

create table PRDCT_RGSTR
(model_id varchar(30) not null,
category varchar2(10) not null,
vip_id varchar2(20) not null,

constraint test_model_id_pk primary key(model_id)
);

drop table STPRD_PRGRM cascade constraints;

create table STPRD_PRGRM
(model_id varchar2(30) not null,
category varchar2(15) not null,
hour_sp number(5),
on_mode number(5,2),
off_mode number(5,2),
company varchar2(15),
constraints model_id_category_pk primary key(model_id, category)
);

insert into STPRD_PRGRM(model_id, category, hour_sp, on_mode, off_mode, company)
values ('CRONUS 279Q1 FAST165' , 'computer' ,10, 27.4 , 0.33 , 'crossoverzone');

insert into STPRD_PRGRM(model_id, category,hour_sp, on_mode,off_mode,company)
values ('2885U IPS UHD HDR flat' , 'computer' ,10, 28.1 , 0.15 , 'crossoverzone');

insert into STPRD_PRGRM(model_id,category,hour_sp, on_mode,off_mode,company)
values ('F32' , 'computer' ,9, 33.5 , 0.22 , 'emtech');


insert into STPRD_PRGRM(model_id,category,hour_sp, on_mode,off_mode,company)
values ('DocuPrint C3555 d' , 'printer' ,7, 0 , 0.15 , 'fuji');

insert into STPRD_PRGRM(model_id,category,hour_sp, on_mode,off_mode,company)
values ('PRO-300' , 'printer' ,6, 14 , 0.2 , 'canonkorea');

insert into STPRD_PRGRM(model_id,category,hour_sp, on_mode,off_mode,company)
values ('DocuPrint P475 AP' , 'printer' ,5, 0 , 0.15 , 'fuji');





drop table CNSMP_EFRTN cascade constraints;

create table cnsmp_efrtn
(model_id varchar2(20) not null,
category varchar2(15),
wh number(5) not null,
company varchar2(20),
constraints model_category_pk primary key(model_id, category)
);

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('WD503AF' , 'water_purifier' , 10 , 'LGelectronic'); 


insert into cnsmp_efrtn(model_id,category,wh,company)
values ('BF-ESCW03-CW' , 'water_purifier' , 12 , 'Paseco');


insert into cnsmp_efrtn(model_id ,category,wh,company)
values ('WPU-A1100C' , 'water_purifier' , 13 , 'SKmagic');


insert into cnsmp_efrtn(model_id ,category,wh,company)
values ('LC-CHP-101-BK' , 'water_purifier' , 11 , 'Livingcare');


insert into cnsmp_efrtn(model_id ,category,wh,company)
values ('LC-CHP-101-MS' , 'water_purifier' , 11 , 'Livingcare');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('DDT33ERGNS' , 'kimchi_refrig' , 14 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('HDT33ERMBD' , 'kimchi_refrig' , 14 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('TDT33ERMBD' , 'kimchi_refrig' , 14 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('EDT33EFRTWT' , 'kimchi_refrig' , 17 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('TDS10EPACR' , 'kimchi_refrig' , 11 , 'dae-yu');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('WKR83DSSPWI' , 'aircon' , 32 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('WKR83DSJPWI' , 'aircon' , 32 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('WKR83DSSBBI' , 'aircon' , 32 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('S833SN75' , 'aircon' , 38 , 'LG');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('HRFSN566HMFR' , 'aircon' , 43 , 'carrier');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('DWP-Y450' , 'aircon' , 39 , 'youngwon');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('GP-80R' , 'instn-purifier' , 71 , 'aqua');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('GP-80B' , 'instn_purifier' , 71 , 'aqua');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('UBUS-P202HRO(W)' , ' instn_purifier' , 35 , 'ovio');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('WM071RWA' , 'instn_purifier' , 35 , 'jintec');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('WKR83DSSPWI' , 'refrig' , 32 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('WKR83DSJPWI' , 'refrig' , 32 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('WKR83DSSBBI' , 'refrig' , 32 , 'Winia');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('S833SN75' , 'refrig' , 38 , 'LG');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('HRFSN566HMFR' , 'refrig' , 41 , 'carrier');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('LW-TS16X1F' , 'washing_mac' , 66 , 'carrier');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('W130X01-SC' , 'washing_mac' , 66 , 'carrier');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('W160X01-SB' , 'washing_mac' , 66 , 'carrier');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('LW-TS10W1F' , 'washing_mac' , 53 , 'carrier');

insert into cnsmp_efrtn(model_id,category,wh,company)
values ('W160X01-SA' , 'washing_mac' ,  66 , 'carrier');




drop table CUMULATIVE_USE cascade constraints;

create table CUMULATIVE_USE
(no number(3) not null,
model_id varchar2(20) not null,
fare number(10) not null,
cmlt_time number(5),
priod date,
constraint cumulative_id_pk primary key(no)
);


drop table calculator cascade constraints;

create table calculator
(no number(5) not null,
user_input number(3) not null,
constraint test_no_pk primary key(no)
);

drop table PRDCT_RGSTR cascade constraints;

create table PRDCT_RGSTR
(model_id varchar(20) not null,
category varchar2(10) not null,
vip_id varchar2(20) not null, 
constraint test_model_id_pk primary key(vip_id));

ALTER table PRDCT_RGSTR
ADD constraint model_id_fk1 foreign key (model_id, category)
REFERENCES STPRD_PRGRM(model_id, category);

ALTER table PRDCT_RGSTR
ADD constraint model_id_fk2 foreign key (model_id, category)
REFERENCES CNSMP_EFRTN(model_id, category
);

ALTER table PRDCT_RGSTR
ADD constraint vip_id_fk3 foreign key (vip_id)
REFERENCES VIP(vip_id);
