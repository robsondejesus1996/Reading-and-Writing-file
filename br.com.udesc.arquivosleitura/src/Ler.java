/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robson de Jesus
 */
public class Ler {
    
    public static void main(String[] args) {
        
        String arq = "arquivo.txt";
        
        String texto = Manipulacao.Read(arq);
        if(texto.isEmpty()){//se o texto estiver vazio
            System.out.println("Erro ao ler do arquivo");
        }else{
            System.out.println(texto);
        }
    }
    
}
