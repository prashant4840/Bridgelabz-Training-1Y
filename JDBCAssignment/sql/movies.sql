CREATE TABLE movies(id INT, name VARCHAR(50), seats INT);
INSERT INTO movies VALUES (1,'Avengers',50);
SELECT * FROM movies WHERE seats > 0;
UPDATE movies SET seats = seats - 1 WHERE id=1;
DELETE FROM movies WHERE id=1;
