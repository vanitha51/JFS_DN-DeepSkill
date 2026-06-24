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
