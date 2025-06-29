CREATE TABLE employees_demo (
    emp_id     NUMBER PRIMARY KEY,
    emp_name   VARCHAR2(100),
    emp_salary NUMBER
);

BEGIN
    INSERT INTO employees_demo VALUES (101, 'Alice', 50000);
    INSERT INTO employees_demo VALUES (102, 'Bob', 60000);
    INSERT INTO employees_demo VALUES (103, 'Charlie', 55000);
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE give_bonus (
    p_emp_id   IN  employees_demo.emp_id%TYPE,
    p_bonus    IN  NUMBER
) AS
BEGIN
    UPDATE employees_demo
    SET emp_salary = emp_salary + p_bonus
    WHERE emp_id = p_emp_id;

    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Employee ID not found.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus || ' added to employee ID ' || p_emp_id);
    END IF;
END;
/

BEGIN
    give_bonus(102, 5000); 
END;
/

SELECT * FROM employees_demo;
