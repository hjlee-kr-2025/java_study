use reportdb;

-- 샘플데이터
insert into student (studentName, department) values ('홍길동', '국어국문학과');
insert into student (studentName, department) values ('이순신', '체육학과');
insert into student (studentName, department) values ('김유신', '광고학과');
insert into student (studentName, department) values ('신사임당', '컴퓨터공학과');
insert into student (studentName, department) values ('홍길동', '물리학과');
insert into student (studentName, department) values ('세종', '체육학과');

insert into subject (subjectName) values ('수학');
insert into subject (subjectName) values ('국어');
insert into subject (subjectName) values ('영어');
insert into subject (subjectName) values ('역사');
insert into subject (subjectName) values ('물리');
insert into subject (subjectName) values ('지리');
insert into subject (subjectName) values ('생물');
insert into subject (subjectName) values ('화학');
insert into subject (subjectName) values ('JAVA');
insert into subject (subjectName) values ('HTML');

insert into subjectScore (score, studentId, subjectId) values (90,	1,	1);
insert into subjectScore (score, studentId, subjectId) values (70,	1,	3);
insert into subjectScore (score, studentId, subjectId) values (100,	2,	7);
insert into subjectScore (score, studentId, subjectId) values (70,	2,	8);
insert into subjectScore (score, studentId, subjectId) values (95,	2,	9);
insert into subjectScore (score, studentId, subjectId) values (70,	4,	1);
insert into subjectScore (score, studentId, subjectId) values (75,	4,	3);
insert into subjectScore (score, studentId, subjectId) values (95,	4,	5);
insert into subjectScore (score, studentId, subjectId) values (100,	5,	10);
insert into subjectScore (score, studentId, subjectId) values (100,	5,	4);
insert into subjectScore (score, studentId, subjectId) values (100,	5,	7);
insert into subjectScore (score, studentId, subjectId) values (85,	5,	8);
insert into subjectScore (score, studentId, subjectId) values (85,	3,	10);
insert into subjectScore (score, studentId, subjectId) values (90,	3,	9);
insert into subjectScore (score, studentId, subjectId) values (50,	3,	8);
insert into subjectScore (score, studentId, subjectId) values (95,	6,	1);
insert into subjectScore (score, studentId, subjectId) values (70,	6,	2);
insert into subjectScore (score, studentId, subjectId) values (90,	6,	3);
insert into subjectScore (score, studentId, subjectId) values (80,	6,	4);



