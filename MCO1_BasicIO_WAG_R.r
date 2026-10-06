# ****************************************************
# Last names: Guanzon, Mejia, Quebrado
# Language: R
# Paradigm(s): Functional, Object-Oriented, Procedural
# ****************************************************

# Fore note: 
# 1.) My learning is from a video by freeCodeCamp.org, with link: https://www.youtube.com/watch?v=_V8eKsto3Ug
# 2.) Packages used as of now: Pacman (Default from the video). 
# 3.) For syntax: https://www.w3schools.com/r/r_print.asp.
# 4.) I don't know if there is a prototype function like in C. So bear with me. 

# Version 1: Used Cat().
# Version 2: Used menu().Though there is inconsistency due to formatting.
# Version 3: ADDED ACCOUNTS OUTSIDE AS VARIABLE so there could be multiple accounts.
# Current Version: Removed Accounts FOR THIS BASIC I/O ASSIGNMENT.

#Register Account Name - REQ-0004, REQ-0005, REQ-0006
register_Account <- function(){
  cat("Register Account Name")
  current_accountName <- readline("Account Name: ") #Syntax for accepting Strings.
  
  cat("\n***\n")
  cat("Account Name: ", current_accountName,"\n")
}

#Deposit Amount - REQ-0007, REQ-0008, REQ-0009, REQ-0010
deposite_Amount <- function(){
  cat("Deposit Amount\n")
  
  #Temporary Static Variables as required:
  Current_Balance <- 1000.00
  Current_Currency <- "PHP"
  
  current_accountName <- readline("Account Name: ")
  cat("Current Balance: ", sprintf("%.2f",Current_Balance),"\n")
  cat("Currency: ", Current_Currency,"\n")
  current_depositAmount <- as.numeric(readline("Deposit Amount: "))
  
  cat("\n***\n")
  cat("Account Name: ",current_accountName,"\n")
  cat("Deposit Name: ",sprintf("%.2f",current_depositAmount),"\n")
}

#Withdraw Amount - REQ-0011, REQ-0012, REQ-0013, REQ-0014
withdraw_Amount <- function(){
  cat("Withdraw Amount\n")
  
  #Temporary Static Variables as required:
  Current_Balance <- 1000.00
  Current_Currency <- "PHP"
  
  current_accountName <- readline("Account Name: ")
  cat("Current Balance: ", sprintf("%.2f",Current_Balance),"\n")
  cat("Currency: ", Current_Currency,"\n")
  current_withdrawAmount <- as.numeric(readline("Deposit Amount: "))
  
  cat("\n***\n")
  cat("Account Name: ",current_accountName,"\n")
  cat("Withdraw Amount: ",sprintf("%.2f",current_withdrawAmount),"\n")
}

#Record Exchange - REQ-0015, REQ-0016, REQ-0017
Record_Exchange_Rate <- function(){
  cat("Record Exchange Rate\n")
  
  currencies <- c(
    "Philippine Peso (PHP)",
    "United States Dollar (USD)",
    "Japanese Yen (JPY)",
    "British Pound Sterling (GBP)",
    "Euro (EUR)",
    "Chinese Yuan Renminni (CNY)"
  )
  
  cat("
      [1]", currencies[1], "\n
      [2]", currencies[2], "\n
      [3]", currencies[3], "\n
      [4]", currencies[4], "\n
      [5]", currencies[5], "\n
      [6]", currencies[6], "\n
  ")
  
  current_choice <- as.numeric(readline("Select Foreign Currency: ")
  )
  current_exchangeRate<-as.numeric(readline("Exchange Rate: ")
  )
  
  cat("\n***\n")
  cat("Select Foreign Currency = [", current_choice, "]\n", sep = "")
  cat("Exchange Rate = ", sprintf("%.2f", current_exchangeRate), "\n", sep = "")
}
  

#Currency Exchange - REQ-0018, REQ-0019, REQ-0020
currency_Exchange <- function(){
  cat("Foreign Currency Exchange\n")
  
  #Temporary Statics Variables 
  current_currency <- "Philippine Peso (PHP)" #Will create a list data structure for better syntax after this assignment.
  current_currency_Acronym <- "PHP"
  
  usd_excha_val <- 62.00
  jpy_excha_val <- 0.40
  gbp_excha_val <- 84.00
  eur_excha_val <- 72.00
  cny_excha_val <- 9.00
  
  sourceAmount <- as.numeric(readline("Source Amount (PHP):" ))
  
  cat("
  Exchange Currency\n
  [1] Philippine Peso (PHP) =", sprintf("%.2f",sourceAmount),"\n
  [2] United States Dollar (USD) = ",sprintf("%.2f",sourceAmount*usd_excha_val),"\n
  [3] Japanese Ten (JPY) = ",sprintf("%.2f",sourceAmount*jpy_excha_val),"\n
  [4] British Pound Sterling (GBY) = ",sprintf("%.2f",sourceAmount*gbp_excha_val),"\n
  [5] Eero (EUR) = ",sprintf("%.2f",sourceAmount*eur_excha_val),"\n
  [6] Chinese Yuan Renminni (CNY) = ",sprintf("%.2f",sourceAmount*cny_excha_val),"\n
  ")
  
  cat("\n***\n")
  cat("Source Currency: ",current_currency,"\n")
  cat("Source Amount(",current_currency_Acronym,"): ",sprintf("%.2f",sourceAmount),"\n")
}

#Assigning Variables for Main Menu
choices_Main_Menu <- c( #This is a Vector. Holds the same data type. 
  "Register Account Name",
  "Deposit Amount",
  "Withdraw Amount",
  "Currency Exchange",
  "Record Exchange Rates",
  "Show Interest Amount"
)

# Main Menu - REQ-0001, REQ-0002, REQ-0003 
choice<-menu(choices_Main_Menu, graphics=FALSE, title= "Welcome to the R Banking System!\nSelect Transaction:")
  
cat("\n***\n")
cat("Choice: ", choice,"\n\n")
  
switch( choice,
  register_Account(),
  deposite_Amount(),
  withdraw_Amount(),
  currency_Exchange(),
  Record_Exchange_Rate(),
  cat("This function is not part of my contract deal for now. Come back next time!\n")
)
