CREATE TABLE accounts(accNo INT, name VARCHAR(50), balance DOUBLE);
INSERT INTO accounts VALUES (1,'Raj',15000);
SELECT * FROM accounts WHERE balance > 10000;
UPDATE accounts SET balance = balance + 5000 WHERE accNo=1;
DELETE FROM accounts WHERE accNo=1;
