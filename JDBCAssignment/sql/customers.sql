CREATE TABLE customers(id INT, name VARCHAR(50), phone VARCHAR(15));
INSERT INTO customers VALUES (1,'Aman','99999');
SELECT * FROM customers WHERE name LIKE '%Am%';
UPDATE customers SET phone='88888' WHERE id=1;
DELETE FROM customers WHERE id=1;
