CREATE TABLE books(id INT, title VARCHAR(100), author VARCHAR(50), status VARCHAR(10));
INSERT INTO books VALUES (1,'Java','James','Available');
SELECT * FROM books WHERE status='Available';
UPDATE books SET status='Issued' WHERE id=1;
DELETE FROM books WHERE id=1;
