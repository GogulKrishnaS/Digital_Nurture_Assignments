SET SERVEROUTPUT ON;

DECLARE
    v_num NUMBER := 15;
    v_grade CHAR(1);
    v_counter NUMBER := 1;
BEGIN
    IF v_num < 10 THEN
        DBMS_OUTPUT.PUT_LINE('Number is less than 10.');
    ELSIF v_num BETWEEN 10 AND 20 THEN
        DBMS_OUTPUT.PUT_LINE('Number is between 10 and 20.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Number is greater than 20.');
    END IF;

    v_grade := 'B';
    CASE v_grade
        WHEN 'A' THEN
            DBMS_OUTPUT.PUT_LINE('Excellent!');
        WHEN 'B' THEN
            DBMS_OUTPUT.PUT_LINE('Good job!');
        WHEN 'C' THEN
            DBMS_OUTPUT.PUT_LINE('Well done!');
        ELSE
            DBMS_OUTPUT.PUT_LINE('Invalid grade.');
    END CASE;

    LOOP
        DBMS_OUTPUT.PUT_LINE('LOOP Counter = ' || v_counter);
        v_counter := v_counter + 1;
        EXIT WHEN v_counter > 3;
    END LOOP;

    v_counter := 1;
    WHILE v_counter <= 3 LOOP
        DBMS_OUTPUT.PUT_LINE('WHILE Counter = ' || v_counter);
        v_counter := v_counter + 1;
    END LOOP;

    FOR i IN 1..3 LOOP
        DBMS_OUTPUT.PUT_LINE('FOR Loop iteration: ' || i);
    END LOOP;
END;
/
