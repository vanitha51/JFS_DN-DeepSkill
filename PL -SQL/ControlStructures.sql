-- Scenario 1 : Apply 1% Discount to Loan Interest rates for Customers Above 60
DECLARE
BEGIN
  FOR cust_rec IN(
    SELECT customerID
    FROM Customers
    WHERE Age>60
  )
  LOOP
    UPDATE Loans
    SET InterestRate = InterestRate -1 
    WHERE CustomerID = cust_rec.CustomerID ;
  END LOOP;
  
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Interest rates updated.');
END;
/


-- Scenario 2 : Set VIP Status for Customers with Balance Over $10,000
DECLARE
  BEGIN
    FOR cust_rec IN (
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust_rec.CustomerID;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/


-- Send Reminders for Loans Due Within Next 30 Days
DECLARE
BEGIN
    FOR loan_rec IN (
        SELECT c.Name,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
          ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || loan_rec.Name ||
            ', your Loan ID ' || loan_rec.LoanID ||
            ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/
