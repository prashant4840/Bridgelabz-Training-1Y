CREATE TABLE tasks(id INT, title VARCHAR(100), status VARCHAR(20));
INSERT INTO tasks VALUES (1,'Study JDBC','Pending');
SELECT * FROM tasks WHERE status='Pending';
UPDATE tasks SET status='Completed' WHERE id=1;
DELETE FROM tasks WHERE status='Completed';
