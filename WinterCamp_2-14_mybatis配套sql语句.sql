CREATE TABLE student(
	id INT(20) NOT NULL PRIMARY KEY,
	sname VARCHAR(30) DEFAULT NULL ,
	sex ENUM('男','女') 
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO student(id,sname,sex) VALUES
(1,'李白','男'),
(2,'杜甫','男'),
(3,'李四','女');

SELECT * FROM student;

CREATE TABLE teacher(
	id INT(20) NOT NULL PRIMARY KEY,
	tname VARCHAR(30) DEFAULT NULL ,
	class INT(20) 
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO teacher(id,tname,class) VALUES
(1,'张三',10),
(2,'李四',20),
(3,'王五',30);

SELECT * FROM teacher;