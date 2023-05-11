import java.util.Scanner;

public class CasiCero {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        float num;

        System.out.println("Ingrese un numero");
        num = tec.nextFloat();

        if(num < 1 && num > -1) {
            if (num == 0) {
                System.out.println("El nummero ingresado es cero");
            }
            else {
                System.out.println("El numero ingresado es casi cero");
            }
        }
        else{
            System.out.println("El numero ingresado no es casi cero");
        }
    }

}