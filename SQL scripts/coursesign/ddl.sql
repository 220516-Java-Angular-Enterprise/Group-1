--ddl

drop table if exists studentcourse;
drop table if exists students;
drop table if exists courses;



create table students(
	id varchar not null,
	username varchar not null,
	password varchar not null,
	name varchar not null,
	
	constraint PK_Student_ID
		primary key (id)
);

create table courses(
	id varchar not null,
	name varchar not null,
	description varchar not null,
	studentamount int not null,
	
	constraint PK_Course_ID
		primary key (id)
);

create table studentcourse(
	studentID varchar not null,
	courseID varchar not null,
	
	constraint PK_Studentcourse_ID
		primary key (studentID, courseID),
	constraint FK_Pen_ID
		foreign key (studentID) references students (id),
	constraint FK_Store_ID
		foreign key (courseID) references courses (id)
);
