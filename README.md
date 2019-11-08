# STUDENT INFO
Matric: 271613  
Name: Kek Kai Ting  
# INTRODUCTION
Based on the assignment given, I have to create a car loan calculator by using Java code to calculate the monthly repayment, principal,interest and balance. Before starting to write Java code, I do the pseudocode and flow chart first to easier my work. I have learnt to use some application such as while loop in coding and programming. By using while loop, I can limit the input from the user by keeping looping until the proper amount entered by the user to calculate the monthly repayment. The user just need to key in the car price(RM), down payment(RM), loan period(year) and interest rate(%), then they can know their monthly repayment and also the repayment table.  
# PSEUDO-CODE  
START  
   Output "Enter car price(RM)"  
	 Input car price  
	 Loop the input car price if the user enter car price less than RM 30000  
	 Output "Enter down payment(RM)"  
	 Input down payment  
	 Loop the input down payment if the user enter the down payment less than RM 0  
	 Output "Enter loan period(year)"  
	 Input loan period  
	 Loop the input loan period if the user enter the loan period less than 5 years or more than 9 years  
	 Output "Enter interest rate(%)"  
	 Input interest rate  
	 Loop the input interest rate if the user enter the interest rate less than 3 or more than 7  
	 Calculate monthly repayment(RM)=((carprice-downpayment)* interestrate/100/12)+(carprice-downpayment)/(loanperiod* 12)  
	 Output monthly repayment  
	 Calculate Years= n th year  
   Calculate Principal= monthly repayment* 12* n th year  
   Calculate Interest= (car price-down payment)* interest rate/100* n th year  
   Calculate Balance= (monthly repayment* 12)* (loanperiod-n th year)  
	 Output years,principal,interest,balance  
   Loop years,principal,interest,balance depend on the loan period entered by the user  
END  
# Flow Chart
 ![image](https://github.com/kaiting0415/271613-STIA1113-A191-A1A2/blob/master/flow%20chart.PNG)  
# Screenshot of the output  
![image](https://github.com/kaiting0415/271613-STIA1113-A191-A1A2/blob/master/Output.PNG)
