import java.util.Scanner;

    public class Deitel_5_25
        {       
            private int Tamano = 9;

        public void Imprime()
   {     
   
        Scanner entrada = new Scanner(System.in);
        int x = 4;  
               
        System.out.print("\nEste programa despliega un rombo en la pantalla.");

        while ( x % 2 == 0 )
            {   

        System.out.println("\nPor favor introduzca un entero impar que definira su dimension: ");
        x = entrada.nextInt();

            }     
        Tamano = x;

        System.out.println("\nAqui esta el rombo: \n\n");

        for ( int i = 1; i <= ((Tamano/2) + 1); i ++ )
            {   
          
        for ( int  k = 1; k <= Tamano / 2 - i + 1; k++ )
        System.out.printf(" ");
                               
        for ( int j = (Tamano / 2) - i + 2; j <= (Tamano / 2) + i; j++ )  
        System.out.printf("*");


        System.out.printf("\n"); 
    
            }   

        for ( int l = 1; l <= Tamano / 2; l++ )
            {    
        for( int m = 1; m <= l; m++ )
            {    
   
                System.out.printf(" "); 
   
            }     
        for (int n = l + 1; n <= Tamano - l  ; n++)
        System.out.printf("*");

        System.out.println();

            }    

        }     
   }         
