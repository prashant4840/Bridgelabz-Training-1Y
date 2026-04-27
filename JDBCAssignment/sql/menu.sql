CREATE TABLE menu(id INT, itemName VARCHAR(50), price DOUBLE);
INSERT INTO menu VALUES (1,'Burger',150);
SELECT * FROM menu WHERE price < 200;
UPDATE menu SET price=180 WHERE id=1;
DELETE FROM menu WHERE id=1;
