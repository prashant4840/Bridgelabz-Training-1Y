CREATE TABLE employee(id INT, name VARCHAR(50), salary DOUBLE);
INSERT INTO employee VALUES (1,'Ram',40000);
SELECT * FROM employee WHERE salary > 30000;
UPDATE employee SET salary = salary * 1.10 WHERE id = 1;
DELETE FROM employee WHERE salary < 15000;
