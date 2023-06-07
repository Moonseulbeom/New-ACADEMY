-- 회원관리 (탈퇴한 아이디 재가입 못하게 남겨둠)
create table zmember(
 mem_num number,
 id varchar2(12) unique not null,
 auth number(1) default 2 not null, --회원등급 0탈퇴회원, 1정지회원, 2일반회원,9관리자
 constraint zmember_pk primary key (mem_num)
);
-- 개인정보라 탈퇴시 다 삭제
create table zmember_detail(
 mem_num number,
 name varchar2(30) not null,
 passwd varchar2(12) not null,
 phone varchar2(15) not null,
 email varchar2(50) not null,
 zipcode varchar2(5) not null,
 address1 varchar2(90) not null,
 address2 varchar2(90) not null,
 photo varchar2(150),
 reg_date date default sysdate not null,
 modify_date date,
 constraint zmember_detail_pk 
 					primary key (mem_num),
 constraint zmember_detail_fk 
					 foreign key (mem_num) 
					 references zmember (mem_num)
);

create sequence zmember_seq;

--게시판
create table zboard(
 board_num number,
 title varchar2(150) not null,
 content clob not null,
 hit number(9) default 0 not null,
 reg_date date default sysdate not null,
 modify_date date,
 filename varchar2(150),
 ip varchar2(40) not null,
 mem_num number not null,
 constraint zboard_pk primary key (board_num),
 constraint zboard_fk foreign key (mem_num)
 					references zmember (mem_num)
);
create sequence zboard_seq;

--좋아요
create table zboard_fav(
 fav_num number,
 board_num number not null,
 mem_num number not null,
 constraint zboard_fav_pk primary key (fav_num),
 constraint zboard_fav_fk1 foreign key (board_num) references zboard (board_num),
 constraint zboard_fav_fk2 foreign key (mem_num) references zmember (mem_num)
);

create sequence zboardfav_seq;

--댓글
create table zboard_reply(
 re_num number,
 re_content varchar2(900) not null,
 re_date date default sysdate not null,
 re_modifydate date,
 re_ip varchar2(40) not null,
 board_num number not null, -- 부모글번호
 mem_num number not null,
 constraint zreply_pk primary key (re_num),
 constraint zreply_fk foreign key (board_num) references zboard (board_num),
 constraint zreply_fk2 foreign key (mem_num) references zmember (mem_num)
);

create sequence zreply_seq;









