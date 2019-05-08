# 19415日常产出




###sql语句练习1

```sql
DROP TABLE
IF EXISTS customers;

CREATE TABLE customers (
	id INT NOT NULL auto_increment,
	NAME CHAR (50) NOT NULL,
	PASSWORD CHAR (50) NULL,
	sex CHAR (50) NULL,
	PRIMARY KEY (id)
) ENGINE = INNODB;

INSERT INTO customers (NAME, PASSWORD, sex)
VALUES
	('chen', '11', '男');

INSERT INTO customers (NAME)
VALUES
	('wen');

DELETE
FROM
	customers
WHERE
```