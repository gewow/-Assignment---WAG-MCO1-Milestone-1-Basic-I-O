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



