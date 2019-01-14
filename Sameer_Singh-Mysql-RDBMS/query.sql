 select * From Cab where cab_no=69;
 
delimiter //
Create procedure
customer_bill(
IN cust_id int , 
OUT total double(10,2)
)
Begin
select sum(amount) into total from customer, Bill  
where customer.cust_id=Bill.bill_id AND Bill.amout>10;
 END //
 
 call customer_bill(2, @balance);
select @balance
