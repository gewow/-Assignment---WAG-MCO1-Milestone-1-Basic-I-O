//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
********************
Last names: Guanzon, Meija, Quebrado
Language: Kotlin
Paradigm(s): Procedural
********************
*/
fun main() {
    mainMenu()
    registerAccountName()
    depositAmount()
    withdrawAmount()
    currencyExchange()
    recordExchangeRate()
}

fun mainMenu() {
    var valid = false
    println("Select Transaction:")
    println("[1] Register Account Name")
    println("[2] Deposit Amount")
    println("[3] Withdraw Amount")
    println("[4] Currency Exchange")
    println("[5] Record Currency Exchange")
    println("[6] Show Interest Amount")
    while (!valid){
        print("\nChoice: ")
        val choice = readln().toIntOrNull()
        if (choice == null || choice <= 0 || choice > 6) {
            println("ERROR: Please choose a valid input.")
        }
        else {
            println("\n***")
            println("Choice = $choice")
            valid = true
        }
    }
}

fun registerAccountName(){
    println("\nRegister Account Name")
    var valid = false
    while (!valid){
        print("Account Name:")
        val userName = readln()
        if (userName.contains(",") && userName.isNotBlank()){
            println("\n***")
            println("Account Name = $userName")
            valid = true
        }
        else{
            println("\nERROR: Please choose a valid input.\n")
        }
    }
}

fun depositAmount(){
    var validName = false
    var validAmount = false
    var accountName = ""
    var depositedAmount = 0.00
    println("\nDeposit Amount")

    //validate account name
    while (!validName){
        print("Account Name:")
        val userName = readln()
        if (userName.contains(",") && userName.isNotBlank()){
            accountName = userName
            validName = true
        }
        else{
            println("\nERROR: Please choose a valid input.\n")
        }
    }

    println("Current Balance: 1000.00")
    println("Currency: PHP")

    while (!validAmount){
        print("\nDeposit Amount:")
        val amount = readln().toDoubleOrNull()
        if (amount == null || amount < 0.00){
            println("\nERROR: Please choose a valid input.")
        }
        else {
            depositedAmount = amount
            validAmount = true
        }
    }

    println("\n***")
    println("Account Name = $accountName")
    println("Deposit Amount = ${"%.2f".format(depositedAmount)}")
}

fun withdrawAmount(){
    var validName = false
    var validAmount = false
    var accountName = ""
    var withdrawedAmount = 0.00

    println("\nWithdraw Amount")
    while (!validName){
        print("Account Name:")
        val userName = readln()
        if (userName.contains(",") && userName.isNotBlank()){
            accountName = userName
            validName = true
        }
        else{
            println("\nERROR: Please choose a valid input.\n")
        }
    }

    println("Current Balance: 1000.00")
    println("Currency: PHP")

    while (!validAmount){
        print("\nWithdraw Amount:")
        val amount = readln().toDoubleOrNull()
        if (amount == null || amount < 0.00){
            println("\nERROR: Please choose a valid input.")
        }
        else {
            withdrawedAmount = amount
            validAmount = true
        }
    }

    println("\n***")
    println("Account Name = $accountName")
    println("Withdraw Amount = ${"%.2f".format(withdrawedAmount)}")
}

fun recordExchangeRate(){
    var validChoice = false
    var validAmount = false
    var exchangeRate = 0.00
    var selectedCurrency = 0

    println("\nRecord Exchange Rate")
    println("\n")
    println("[1] Philippine Peso (PHP)")
    println("[2] United States Dollar (USD)")
    println("[3] Japanese Yen (JPY)")
    println("[4] British Pound Sterling (GBP)")
    println("[5] Euro (EUR)")
    println("[6] Chinese Yuan Renminni (CNY)")

    while (!validChoice){
        print("\nChoice: ")
        val choice = readln().toIntOrNull()
        if (choice == null || choice <= 0 || choice > 6) {
            println("ERROR: Please choose a valid input.")
        }
        else {
            selectedCurrency=choice
            validChoice=true
        }
    }

    while (!validAmount) {
        print("\nExchange Rate: ")
        val amount = readln().toDoubleOrNull()

        if (amount == null || amount < 0) {
            println("ERROR: Please enter a valid amount.")
        } else {
            exchangeRate = amount
            validAmount = true
        }
    }

    println("\n***")
    println("Select Foreign Currency = [$selectedCurrency]")
    println("Exchange Rate = [%.2f]".format(exchangeRate))
}

fun currencyExchange(){
    var validAmount=false
    var sourceAmount=0.00
    var defaultSourceCurrency = "Philippine Peso (PHP)"

    print("\nForeign Currency Exchange")

    while(!validAmount){
        println("Source Amount(PHP): ")
        val input=readln().toDoubleOrNull()

        if(input==null||input<0){
            println("ERROR: Please enter a valid amount")
        }else{
            sourceAmount = input
            validAmount = true
        }
    }

    println("\nExchanged Currency")
    println("[1] Philippine Peso (PHP) = [%.2f]".format(sourceAmount))
    println("[2] United States Dollar (USD) = [%.2f]".format(sourceAmount * 62.00))
    println("[3] Japanese Yen (JPY) = [%.2f]".format(sourceAmount * 0.40))
    println("[4] British Pound Sterling (GBP) = [%.2f]".format(sourceAmount * 84.00))
    println("[5] Euro (EUR) = [%.2f]".format(sourceAmount * 72.00))
    println("[6] Chinese Yuan Renminni (CNY) = [%.2f]".format(sourceAmount * 9.00))

    println("***")
    println("Source Currency = $defaultSourceCurrency")
    println("Source Amount = [%.2f]".format(sourceAmount))
}
