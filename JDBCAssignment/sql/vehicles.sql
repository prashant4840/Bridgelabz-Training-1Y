CREATE TABLE vehicles(regNo VARCHAR(20), owner VARCHAR(50), status VARCHAR(20));
INSERT INTO vehicles VALUES ('UP01','Amit','Pending');
SELECT * FROM vehicles WHERE status='Pending';
UPDATE vehicles SET status='Completed' WHERE regNo='UP01';
DELETE FROM vehicles WHERE regNo='UP01';
