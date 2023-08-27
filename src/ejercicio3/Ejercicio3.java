package ejercicio3;
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
      int litros,pagofijo=10;
      float precio;
      Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese litros totales: ");
      litros=entrada.nextInt();
      if (litros<=50){
      precio=pagofijo;}
      else if(litros>=51 && litros<=200){
            precio=pagofijo+0.5f*(litros-50);  }
      
        else{
          precio=pagofijo+1.5f*(litros-50);}
        System.out.println("el precio es: $"+precio);    
    }
}
