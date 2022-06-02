--dql
select * from students;
select * from courses;

select s."name", c."name", c.description, c.studentamount from studentcourse sc 
inner join students s on s.id = sc.studentid 
inner join courses c on c.id = sc.courseid