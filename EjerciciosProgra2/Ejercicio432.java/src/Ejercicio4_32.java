public class Ejercicio4_32

{ 
    private String cadena;
    private int numero; 

    public Ejercicio4_32 ( int x)
        { 
            numero = x;
        } 
    public void Imprime()
        { 
            System.out.println("\nSe imprime a continuacion un tablero de damas: ");

            int contadorHorizontal = 1;
            int contadorVertical = 1;
            int TAMANO = 8;

    while ( contadorVertical <= TAMANO )
        { 
            contadorHorizontal = 1;
            while (contadorHorizontal <= TAMANO)
{ 
    if( 0 == contadorVertical % 2 )
        System.out.print("* ");
    else
        System.out.print(" *");

    contadorHorizontal++;
} 
    System.out.print("\n");
    contadorVertical++;
        } 
    } 

} 