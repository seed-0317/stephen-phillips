### 2.1 SELECT
* Task – Select all records from the Employee table.
SELECT * FROM employees;

* Task – Select all records from the Employee table where last name is King.
SELECT * FROM employees WHERE last_name = 'King';

* Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT * FROM employees WHERE first_name = 'Andrew' AND reports_to IS NULL;

### 2.2 ORDER BY
* Task – Select all albums in Album table and sort result set in descending order by title.
SELECT * FROM albums ORDER BY title DESC

* Task – Select first name from Customer and sort result set in ascending order by city
SELECT first_name FROM customers ORDER BY city ASC


### 2.3 INSERT INTO
* Task – Insert two new records into Genre table
INSERT INTO genres (id, name) VALUES (26,'edm');
INSERT INTO genres (id, name) VALUES (27, 'dubstep');

* Task – Insert two new records into Employee table
INSERT INTO employees (id, last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email) VALUES (9, 'yihaw', 'cowboy', 'boss', 6, NULL, NULL, NULL, NULL, NULL, NULL, NULL,NULL, NULL, NULL )
INSERT INTO employees (id, last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email) VALUES (10, 'ohyea', 'odell', 'bossmaster', 6, NULL, NULL, NULL, NULL, NULL, NULL, NULL,NULL, NULL, NULL )


* Task – Insert two new records into Customer table
 INSERT INTO customers(id, first_name, last_name, company, address, city, state, country, postal_code, phone, fax, email, support_rep_id)  values(60, 'sup', 'brp', null, null, null, null, null, null, null, null, 'iamawesome@gmail.com', NULL )
 INSERT NSERT INTO customers(id, first_name, last_name, company, address, city, state, country, postal_code, phone, fax, email, support_rep_id)  values(61, 'i', 'last', null, null, null, null, null, null, null, null, 'iamawesome2@gmail.com', NULL )

### 2.4 UPDATE
* Task – Update Aaron Mitchell in Customer table to Robert Walter
UPDATE customers
SET first_name = 'Robert', last_name = 'Walter'
WHERE id = 32

* Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
UPDATE artists
SET name = 'CCR'
WHERE name = 'Creedence Clearwater Revival'

### 2.5 LIKE
* Task – Select all invoices with a billing address like “T%”
SELECT * FROM invoices WHERE billing_address LIKE 'T%'

### 2.6 BETWEEN
* Task – Select all invoices that have a total between 15 and 50
SELECT * FROM invoices WHERE total >= 15 AND total <= 50

* Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
SELECT * FROM employees WHERE hire_date > '2002-06-01' AND hire_date < '2004-03-01'

### 2.7 DELETE
* Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).

DELETE FROM invoices WHERE customer_id = 32;
DELETE FROM invoice_lines WHERE invoice_id = 50;
DELETE FROM invoice_lines WHERE invoice_id = 61;
DELETE FROM invoice_lines WHERE invoice_id = 116;
DELETE FROM invoice_lines WHERE invoice_id = 245;
DELETE FROM invoice_lines WHERE invoice_id = 268;
DELETE FROM invoice_lines WHERE invoice_id = 290;
DELETE FROM invoice_lines WHERE invoice_id = 342;
DELETE FROM customers WHERE first_name='Robert' AND last_name = 'Walter';




# 3 SQL Functions

### 3.1 System Defined Functions
* Task – Create a function that returns the current time.
SELECT NOW() AS currentdatetime

* Task – create a function that returns the length of a mediatype from the mediatype table
SELECT LENGTH(name) FROM media_types

### 3.2 System Defined Aggregate Functions
* Task – Create a function that returns the average total of all invoices
SELECT AVG(total) FROM invoices

* Task – Create a function that returns the most expensive track
SELECT * FROM tracks where unit_price = (SELECT MAX(unit_price) FROM tracks)

### 3.3 User Defined Scalar Functions
* Task – Create a function that returns the average price of invoiceline items in the invoiceline table

### 3.4 User Defined Table Valued Functions
* Task – Create a function that returns all employees who are born after 1968.

# 4 Stored Procedures
 In this section you will be creating and executing stored procedures. You will be creating various types of stored procedures that take input and output parameters.

### 4.1 Basic Stored Procedure
* Task – Create a stored procedure that selects the first and last names of all the employees.

### 4.2 Stored Procedure Input Parameters
* Task – Create a stored procedure that updates the personal information of an employee.
* Task – Create a stored procedure that returns the managers of an employee.

### 4.3 Stored Procedure Output Parameters
* Task – Create a stored procedure that returns the name and company of a customer.

# 5 Transactions
In this section you will be working with transactions. Transactions are usually nested within a stored procedure.

* Task – Create a transaction that given a invoiceId will delete that invoice (There may be constraints that rely on this, find out how to resolve them).
* Task – Create a transaction nested within a stored procedure that inserts a new record in the Customer table

# 6 Triggers
In this section you will create various kinds of triggers that work when certain DML statements are executed on a table.

### 6.1 AFTER/FOR
* Task - Create an after insert trigger on the employee table fired after a new record is inserted into the table.
* Task – Create an after update trigger on the album table that fires after a row is inserted in the table
* Task – Create an after delete trigger on the customer table that fires after a row is deleted from the table.

# 7 Joins
In this section you will be working with combing various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.

### 7.1 INNER
* Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.

### 7.2 OUTER
* Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.

### 7.3 RIGHT
* Task – Create a right join that joins album and artist specifying artist name and title.

### 7.4 CROSS
* Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.

### 7.5 SELF
* Task – Perform a self-join on the employee table, joining on the reportsto column.
