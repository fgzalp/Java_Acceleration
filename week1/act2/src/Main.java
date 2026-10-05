
void main() {
    IO.println("Calculadora: ");
    double x = Double.parseDouble(IO.readln("Dame el primer numero "));
    String op = IO.readln(" Dame una operacion (*, /, +, -)");
    double y = Double.parseDouble(IO.readln("Dame el segundo numero "));


    switch (op) {
        case "+":
            IO.println("Resultado: " + (x + y));
            break;
        case "-":
            IO.println("Resultado: " + (x - y));
            break;
        case "*":
            IO.println("Resultado: " + (x * y));
            break;
        case "/":
            IO.println("Resultado: " + (x / y));
            break;
    }
}