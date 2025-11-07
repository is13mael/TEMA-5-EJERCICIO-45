public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Por favor, introduzca un número entero: ");
        long numeroInt = Long.parseLong(System.console().readLine());

        System.out.print("Introduzca la posición dentro del número: ");
        long posicion = Long.parseLong(System.console().readLine());

        System.out.print("Introduzca el nuevo dígito: ");
        long digito = Long.parseLong(System.console().readLine());
        
        long numeroOriginal = numeroInt;

        int longitud = 0;

        do { 
            numeroOriginal /=10;
            longitud++;
        } while (numeroOriginal > 0);

        long Izquierda = numeroInt / (long)(Math.pow(10, longitud - posicion + 1));
        Izquierda = Izquierda * 10 + digito;

        long Derecha = numeroInt % (long)(Math.pow(10, longitud - posicion));

        numeroOriginal = Izquierda * (long)(Math.pow(10, longitud - posicion)) + Derecha;

        System.out.print("El número resultante es " + numeroOriginal);
    }
    }

