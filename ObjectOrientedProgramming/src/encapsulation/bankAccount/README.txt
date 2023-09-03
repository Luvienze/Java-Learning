This is a basic money transferring application.I'll be update in future but for now  i'll be keep it like that.

Account Class:
1) There are some private variables name, age etc. and a constructor method.
2) We can set the variables with set methods.
3) Printing the info, I added private get methods and to access them also added print methods.
->3.1) Also we can print the all info in single method.
4) There is private setBalance to setting balance.
-> 4.1) We can access it wğth setAccountBalance which returns setBalance.
5) We can print and get balance with with getBalance and balance methods.

AccountClient Class:
//We will be reaching the account's methods with client class's object.
1) There are some private variables named money, account and final typed money transfer fee.
2) We can set the client's account with wet account.
3) There are withdraw, deposit, transfer methods and they all private.
->3.1) We can use this methods with public versions of them which  they call those methods with this().
4) printMoneyTransferFee method prints the moneyTransferFee variable;

AccountTest Class
1) Main class.
2) After setting accounts and clients, rest of the calls will be doing by AccountClient' object.

//Note
I tried to use this call in transferMoney method but it didn't work and i decided to look after.
But using this() method will be more optimal for methods like this.