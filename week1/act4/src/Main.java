//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int n=(int)(Math.random()*100)+1;
    int intento=0;
    while(intento!=n){
        intento=Integer.parseInt(IO.readln("Adivina el numero del 1 al 100 "));
        if(intento<n){
            IO.println("Mas ");
        }else if(intento<n){
            IO.println("Menos ");
        }else{
            IO.println("Correcto ");
            break;
        }
    }
}
