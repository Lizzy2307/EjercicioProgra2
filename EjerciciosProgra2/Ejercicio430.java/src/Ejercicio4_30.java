import java.util.Scanner;             
              
              
public class Ejercicio4_30            
              
{           
              
Scanner entrada = new Scanner(System.in);          
              
public Ejercicio4_30( String cadena)           
{            
}                        
public void Recibe()            
{          
int c;             
int num1 = 0;           
int num2 = 0;           
int num3 = 0;           
int num4 = 0;           
int num5 = 0;           
              
System.out.println("\nIntroduzca un numero de cinco cifras para saber si es un palindromo: ");
c = entrada.nextInt();
while ( 9 < c/10000)          
{           
System.out.println("\nEl numero tiene que ser de cinco cifras, por favor introduzcalo nuevamente: ");  
c = entrada.nextInt();            
}            
              
num1 = c / 10000;          
num2 = (c % 10000)/1000;          
num3 = ((c % 10000) % 1000) / 100;      
num4 = (((c % 10000) % 1000) % 100) / 10;    
num5 = (((c % 10000) % 1000) % 100) % 10;    
              
if ( num1 == num5)          
{           
if ( num2 == num4)          
Palindromo( c);             
else              
System.out.printf("\nEl numero %d no es palindromo. \n", c);       
              
}            
              
else              
System.out.printf("\nEl numero %d no es palindromo. \n", c);       
} 
public void Palindromo( int x )         
{           
System.out.printf("\nEl numero %d es un palindromo.\n", x);        
}           
} 