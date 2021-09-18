package Sophia_e_Victor_Atv_3p;
/**
 * Fazer uma biblioteca que utilize:
 * Requisitos mínimos:
 * a) Ter no mínimo 2 classes além da Main;
 * b) Elaborar um Diagrama de Classe usando UML;
 * c) Usar a Classe Scanner;
 * d) Estruturas condicionais;
 * e) Estruturas de repetição - livre;
 * f) Operadores aritméticos;
 */

import java.util.Scanner;

public class MainBiblioteca{
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        Usuario u = new Usuario();
        Biblioteca b = new Biblioteca();

        do{
            System.out.println("------------------------------------"+ "\n" + 
                            "Bem vindo a Biblioteca " + "\n" +
                            "  Reino de Assis" + "\n");

            System.out.println("Informe seu usuário: ");
            u.setUser(read.nextLine());

            System.out.println("*********************");
        
            System.out.println("Informe sua senha: ");
            u.setSenha(read.nextLine());
            System.out.println(u.loginUsuario());

            if(u.getConfirmacao().equals("OK")){
                System.out.println("\n" + "----------------------------------------------------------------"+ "\n" 
                                    + "Para retirar um livro e saber o restante no estoque" + "\n" +
                                    "Digite 1 para Pequeno principe: "+ "\n" +
                                    "Digite 2 para Harry Potter e a Ordem da Fenix: "+ "\n" +
                                    "Digite 3 para Star Wars Fallen Jedi: ");
                b.setQuantidade(read.nextInt());
                System.out.println("\n" + "A quantidade restante deste livro é de " + b.estoque() + "\n" + "\n" + "\n");

            }else{
                System.out.println("Tente colocar a senha novamente");
            }
        }while(b.estoque()!=0);
    }
}
