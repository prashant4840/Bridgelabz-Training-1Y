CREATE TABLE enrollments(id INT, student VARCHAR(50), course VARCHAR(50));
INSERT INTO enrollments VALUES (1,'Neha','Java');
SELECT * FROM enrollments WHERE course='Java';
UPDATE enrollments SET course='Python' WHERE id=1;
DELETE FROM enrollments WHERE id=1;

