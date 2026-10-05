//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int num = Integer.parseInt(IO.readln("Dame un numero "));
    if (num == 0) {
        IO.println("Even");
        IO.println("Zero");
        IO.println("Not prime");

    } else {
        if (num % 2 == 0) {
            IO.println("Even");
        } else {
            IO.println("Odd");
        }
        if (num > 0) {
            IO.println("Positive");
        } else {
            IO.println("Negative");
        }

        boolean prim=true;
        if (num<0){
            prim=false;
        }else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    prim=false;
                    break;
                }
            }
        }
        if(prim){
            IO.println("Prime");
        }else{
            IO.println("Not prime");
        }
    }
}
