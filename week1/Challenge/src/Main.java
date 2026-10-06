void main() {
    String user = "admin";
    String password = "1234";
    String inputUser = IO.readln("Username: ");
    String inputPassword = IO.readln("Password: ");
    double balance = 0;
    int op = 0;
    if (inputUser.equals(user) && inputPassword.equals(password)) {
        IO.println("Welcome ");
        while (op != 4) {
            IO.println("Select an option: ");
            IO.println("1. Check balance ");
            IO.println("2. Deposit ");
            IO.println("3. Withdraw ");
            IO.println("4. Exit ");

            op = Integer.parseInt(IO.readln(" "));
            switch (op) {
                case 1:
                    IO.println("Balance: $" + balance);
                    break;
                case 2:
                    double deposit = Double.parseDouble(IO.readln("Amount to deposit: "));
                    balance = balance + deposit;
                    IO.println("New balance: $" + balance);
                    break;
                case 3:
                    double draw = Double.parseDouble(IO.readln("Amount to withdraw: "));
                    if (draw <= balance) {
                        balance = balance - draw;
                        IO.println("New balance: $" + balance);
                    } else {
                        IO.println("Insufficient funds");
                    }
                    break;
                case 4:
                    IO.println("Bye..");
                    break;
            }
        }
    }else{
        IO.println("Incorrect username or password");
    }
}