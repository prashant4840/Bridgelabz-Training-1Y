CREATE TABLE members(id INT, name VARCHAR(50), type VARCHAR(20), months INT);
INSERT INTO members VALUES (1,'Karan','Premium',6);
SELECT * FROM members WHERE type='Premium';
UPDATE members SET months=months+3 WHERE id=1;
DELETE FROM members WHERE id=1;
