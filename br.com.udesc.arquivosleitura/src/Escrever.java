
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Robson de Jesus
 */
public class Escrever {

    public static void main(String[] args) throws Exception {

        
        //Gravação no arquivo 
        String arq = "arquivo.txt";

        String texto = "texto de exemplo texto de exempl texto de exempl texto de exempl";

        if (Manipulacao.Write(arq, texto)) {
            System.out.println("Arquivo salvo com sucesso!");
        } else {
            System.out.println("Erro ao salvar arquivo!");
        }
        
        

    }

}
