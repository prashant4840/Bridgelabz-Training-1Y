CREATE TABLE patients(id INT, name VARCHAR(50), disease VARCHAR(50));
INSERT INTO patients VALUES (1,'Ravi','Flu');
SELECT * FROM patients WHERE disease='Flu';
UPDATE patients SET disease='Cold' WHERE id=1;
DELETE FROM patients WHERE id=1;
