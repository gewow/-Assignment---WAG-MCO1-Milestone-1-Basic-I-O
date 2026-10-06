# ****************************************************
# Last names: Guanzon, Mejia, Quebrado
# Language: R
# Paradigm(s): Procedural (Though Object-Oriented will be used later on.)
# ****************************************************

# Fore note: 
# 1.) My learning is from a video by freeCodeCamp.org, with link: https://www.youtube.com/watch?v=_V8eKsto3Ug
# 2.) Packages used as of now: Pacman (Default from the video). 
# 3.) For syntax: https://www.w3schools.com/r/r_print.asp.
# 4.) I don't know if there is a prototype function like in C. So bear with me. 

# Version 1: Used Cat().
# Version 2: Used menu().Though there is inconsistency due to formatting.
# Version 3: ADDED ACCOUNTS OUTSIDE AS VARIABLE so there could be multiple accounts.
# Current Version: Removed Accounts and switches FOR THIS BASIC I/O ASSIGNMENT.

# Main Menu - REQ-0001, REQ-0002, REQ-0003 
main_Menu <- function() {
  cat("Welcome to the R Banking System!\n")
  cat("Select Transaction:\n")
  
  choices_Main_Menu <- c( #This is a Vector. Holds the same data type. 
    "Register Account Name",
    "Deposit Amount",
    "Withdraw Amount",
    "Currency Exchange",
    "Record Exchange Rates",
    "Show Interest Amount"
  )
  
  cat("[1]", choices_Main_Menu[1], "\n")
  cat("[2]", choices_Main_Menu[2], "\n")
  cat("[3]", choices_Main_Menu[3], "\n")
  cat("[4]", choices_Main_Menu[4], "\n")
  cat("[5]", choices_Main_Menu[5], "\n")
  cat("[6]", choices_Main_Menu[6], "\n")
  
  repeat{
    choice <- as.numeric(readline("Select Transaction: "))
    
    if(!is.na(choice) && choice >= 1 && choice <= 6 && choice %% 1 == 0) {
      break
    }
    
    cat("Invalid choice. Enter only 1 to 6")
  }
  
  cat("\n***\n")
  cat("Choice: ", choice,"\n\n")
}

#Register Account Name - REQ-0004, REQ-0005, REQ-0006
register_Account <- function(){
  cat("\nRegister Account Name")
  
  repeat{
    current_accountName <- readline("Account Name: ") #Syntax for accepting Strings.
    if(trimws(current_accountName) != "" && grepl(",", current_accountName)){
      break
    }
    cat("\nERROR: Please choose a valid input.\n")
  }
  
  cat("\n***\n")
  cat("Account Name: ", current_accountName,"\n")
}

#Deposit Amount - REQ-0007, REQ-0008, REQ-0009, REQ-0010
deposite_Amount <- function(){
  cat("\nDeposit Amount\n")
  
  #Temporary Static Variables as required:
  Current_Balance <- 1000.00
  Current_Currency <- "PHP"
  
  repeat{
    current_accountName <- readline("Account Name: ")
    if(trimws(current_accountName) != "" && grepl(",", current_accountName)){
      break
    }
    
    cat("\nERROR: Please choose a valid input.\n")
  }
  
  cat("Current Balance: ", sprintf("%.2f",Current_Balance),"\n")
  cat("Currency: ", Current_Currency,"\n")
  
  repeat {
    current_depositAmount <- as.numeric(readline("\nDeposit Amount: "))
    if(!is.na(current_depositAmount) && current_depositAmount > 0) {
      break
    }
    
    cat("ERROR: Please choose a valid input.\n")
  }
  
  cat("\n***\n")
  cat("Account Name: ",current_accountName,"\n")
  cat("Deposit Name: ",sprintf("%.2f",current_depositAmount),"\n")
}

#Withdraw Amount - REQ-0011, REQ-0012, REQ-0013, REQ-0014
withdraw_Amount <- function(){
  cat("\nWithdraw Amount\n")
  
  #Temporary Static Variables as required:
  Current_Balance <- 1000.00
  Current_Currency <- "PHP"
  
  repeat {
    current_accountName <- readline("Account Name: ")
    if(trimws(current_accountName) != "" && grepl(",", current_accountName)){
      break
    }
    cat("\nERROR: Please choose a valid input.\n")
  }
  
  cat("Current Balance: ", sprintf("%.2f",Current_Balance),"\n")
  cat("Currency: ", Current_Currency,"\n")
  
  repeat {
    current_withdrawAmount <- as.numeric(readline("\nWithdraw Amount: "))
    
    if(!is.na(current_withdrawAmount)&&current_withdrawAmount > 0){
      break
    }
    cat("ERROR: Please choose a valid input.\n")
  }
  
  cat("\n***\n")
  cat("Account Name: ",current_accountName,"\n")
  cat("Withdraw Amount: ",sprintf("%.2f",current_withdrawAmount),"\n")
}

#Record Exchange - REQ-0015, REQ-0016, REQ-0017
Record_Exchange_Rate <- function(){
  cat("\nRecord Exchange Rate\n")
  
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
  
  repeat {
    current_choice <- as.numeric(readline("\nChoice: "))
    
    if(!is.na(current_choice)&&current_choice >= 1&&current_choice <= 6&&current_choice %% 1 == 0){
      break
    }
    cat("ERROR: Please choose a valid input.\n")
  }
  
  current_exchangeRate<-as.numeric(readline("Exchange Rate: ")
  )
  
  repeat {
    current_exchangeRate <- as.numeric(readline("Exchange Rate: "))
    
    if(!is.na(current_exchangeRate)&&current_exchangeRate > 0){
      break
    }
    
    cat("ERROR: Please choose a valid input.\n")
  }
  
  cat("\n***\n")
  cat("Select Foreign Currency = [", current_choice, "]\n", sep = "")
  cat("Exchange Rate = ", sprintf("%.2f", current_exchangeRate), "\n", sep = "")
}

#Currency Exchange - REQ-0018, REQ-0019, REQ-0020
currency_Exchange <- function(){
  cat("\nForeign Currency Exchange\n")
  
  #Temporary Statics Variables 
  current_currency <- "Philippine Peso (PHP)" #Will create a list data structure for better syntax after this assignment.
  current_currency_Acronym <- "PHP"
  
  usd_excha_val <- 62.00
  jpy_excha_val <- 0.40
  gbp_excha_val <- 84.00
  eur_excha_val <- 72.00
  cny_excha_val <- 9.00
  
  repeat {
    sourceAmount <- as.numeric(readline("Source Amount (PHP): "))
    
    if(!is.na(sourceAmount) && sourceAmount>0){
      break
    }
    cat("ERROR: Please enter a valid amount.\n")
  }
  
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

main_Menu()
register_Account()
deposite_Amount()
withdraw_Amount()
Record_Exchange_Rate()
currency_Exchange()
