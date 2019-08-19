/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe04;

/**
 *
 * @author aluno
 */
public class Exe04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*
        if(condicao booleana)
        {
            //codigo
        }
        else
        }
            //codigo
        }
        */
        
        int idade = 30;
        if (idade < 18) {
                System.out.println("Menor Idade!");
        }
        else
        {
                System.out.println("Maior Idade!");
        }
        
        //operadores logicos
        // E && (conjuncao)
        // OU || (disjuncao)
        boolean amigoDoDono = true;
                if (idade < 18 && amigoDoDono == false){
                    System.out.println("Menor Idade. Entrada Proibida.");
                }
                else{
                    System.out.println("Maior Idade. Pode Entrar.");
                }
                
                
        //operador de NEGACAO
                if (idade < 18 && !amigoDoDono){
                    System.out.println("Menor Idade. Entrada Proibida.");
                }
                else{
                    System.out.println("Maior Idade. Pode Entrar.");
                }
                
        //operador de igualdade (==)
                int mes = 1;
                if (mes == 1){
                    System.out.println("Janeiro");
                }
                else{
                    System.out.println("Tempo de Trabalhar");
                }
    }
    
}
