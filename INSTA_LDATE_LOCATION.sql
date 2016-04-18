--------------------------------------------------------
--  파일이 생성됨 - 월요일-4월-18-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table INSTA_LDATE_LOCATION
--------------------------------------------------------

  CREATE TABLE "BIT"."INSTA_LDATE_LOCATION" 
   (	"NAME" VARCHAR2(200 BYTE), 
	"COUNT" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into BIT.INSTA_LDATE_LOCATION
SET DEFINE OFF;
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('잠실',368);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('해운대',241);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('대학로',172);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('올림픽공원',152);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('서울대공원',144);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('신촌',125);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('남포동',123);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('경리단길',105);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('홍대',682);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('여의도',473);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('가로수길',263);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('제주도',209);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('일산',171);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('강남',149);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('어린이대공원',140);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('춘천',125);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('명동',119);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('인사동',98);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('한강',628);
Insert into BIT.INSTA_LDATE_LOCATION (NAME,COUNT) values ('이태원',384);
--------------------------------------------------------
--  Constraints for Table INSTA_LDATE_LOCATION
--------------------------------------------------------

  ALTER TABLE "BIT"."INSTA_LDATE_LOCATION" MODIFY ("NAME" NOT NULL ENABLE);
 
  ALTER TABLE "BIT"."INSTA_LDATE_LOCATION" MODIFY ("COUNT" NOT NULL ENABLE);
