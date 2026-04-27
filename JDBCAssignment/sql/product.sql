CREATE TABLE product(pid INT, pname VARCHAR(50), qty INT);
INSERT INTO product VALUES (1,'Pen',5),(2,'Book',20),(3,'Bag',8);
SELECT * FROM product WHERE qty < 10;
UPDATE product SET qty = qty + 10 WHERE pid = 1;
DELETE FROM product WHERE pid = 3;
