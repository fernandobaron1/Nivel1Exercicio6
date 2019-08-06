
package nivel1exercicio6;

import java.util.Scanner;


public class Nivel1Exercicio6 {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println ("Informe o Ano Atual");
        int anoAtual = leia.nextInt();
        
        System.out.println ("Informe o Ano de Nascimento");
        int anoNascimento = leia.nextInt();
        
        int resultado = (anoAtual - anoNascimento);
        System.out.println ("Esta pessoa possui: "+resultado+"anos");
        
        if (resultado < 16) {
    System.out.println ("Não pode Votar."); 
    } else if ((resultado >=16) & (resultado <18))  {
            System.out.println ("Pode escolher se vai votar ou não.");                
    } else if (resultado >= 18) {
            System.out.println ("Voto Obrigatório.");
 }

    }
    
}
