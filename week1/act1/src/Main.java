void main(){

    IO.println("1. Convertir Celsius a Farenheit ");
    IO.println("2. Convertir Farenheit a Celsius ");
    String op= IO.readln("Selecciona una opcion: ");


    switch (op){
        case "1":
            IO.println("Celsius a Farenheit ");
            double cel= Double.parseDouble(IO.readln("Dame los grados en celsius "));
            double far= (cel*1.8)+32;
            IO.println(cel + " convertido a Farenheit es: " + far);
            break;
        case "2":
            IO.println("Farenheit a Celsius ");
            double fars= Double.parseDouble(IO.readln("Dame los grados en Farenheit "));
            double cels= (fars-32)/1.8;
            IO.println(fars + " convertido a Farenheit es: " + cels);
            break;
    }


}
