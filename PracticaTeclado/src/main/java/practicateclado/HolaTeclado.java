package practicateclado;

public class HolaTeclado {
    public static void main(String[] args){
        String nombre;
        int edad;
        
        System.out.print("Dime tu nombre: ");
        nombre = Teclado.LeeCadena();
        
        System.out.print("Dime tu edad: ");
        edad = Teclado.LeeEntero();
        
        System.out.println("Hola "+nombre+", tienes "+edad+" años ");
    }
}
