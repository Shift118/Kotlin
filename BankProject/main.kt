package BankProject

fun main() {
    println("Welcome to the Bank :)")
    println("What type of Account do you want to create?")
    println("1. Debit Account")
    println("2. Credit Account")

    var accountType = ""
    while (accountType == ""){
        print("\nChoose an option (1,2): ")
        val userChoice = readln().toInt()
        when (userChoice){
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            else -> continue
        }
    }
    println("You successfully made a $accountType account!")
    //////////Part2/////////
    var balance = (100..10000).random()
    println("Your Balance is $balance$")

    ///Withdraw Functions
    fun withdraw (amount: Int): Int{
        balance -= amount
        println("You Successfully withdrawn $amount$.")
        return amount
    }
    fun debitWithdraw(amount: Int): Int{
        if (balance == 0){
            println("Balance = $balance , There is no Money to withdraw!")
            return 0
        }else if (amount > balance){
            println("Balance = $balance , There is not enough Money to withdraw!")
            return 0
        }else{
            return withdraw(amount)
        }
    }
    //Deposit
    fun deposit(amount: Int): Int{
        balance += amount
        println("You Successfully deposited $amount$.")
        return amount
    }
    fun creditDeposit(amount: Int): Int{
        if (balance == 0){
            println("This account is completely paid off! Do not deposit money!")
            return 0
        }else if (amount + balance > 0){
            println("Deposit failed, you tried to pay off an amount greater than the credit balance.")
            return 0
        }else if (amount == -balance){
            balance = 0
            println("You have paid off this account!")
            return amount
        }else{
            return deposit(amount)
        }
    }

    //Transfer after creating account
    fun transfer(mode: String){
        print("\nEnter Money Amount: ")
        var money = readln().toInt()
            when (mode){
            "withdraw" -> if (accountType == "debit") debitWithdraw(money) else withdraw(money)
            "deposit" -> if (accountType == "credit") creditDeposit(money) else deposit(money)
        }
        println("Your Balance is $balance$")
    }
    var available = true

    while (available) {
        println("What Operation Do You Want To Do?")
        println("1. Withdraw Money")
        println("2. Deposit Money")
        println("3. Stop & Exit")
        print("\nChoose an option (1,2,3): ")
        val userChoice = readln().toInt()
        when (userChoice){
                1 -> transfer("withdraw")
                2 -> transfer("deposit")
                3 -> available = false
                else -> continue
            }
    }

}