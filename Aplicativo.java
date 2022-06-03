
package br.edu.ifs.academico;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Menu menu = new Menu();
        System.out.println(menu.getMenu());

        int opcao = leitura.nextInt();

        while (opcao != 0) {

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Aluno");
                    break;
                case 2:
                    System.out.println("Cadastrar Professor");
                    break;
                case 3:
                    System.out.println("Cadastrar Psicologo");
                    break;
                case 4:
                    System.out.println("Cadastrar Tecnico");
                    break;
                case 11:
                    System.out.println("Listar Alunos");
                    break;
                case 12:
                    System.out.println("Listar Professores");
                    break;
                case 13:
                    System.out.println("Listar Psicologos");
                    break;
                case 14:
                    System.out.println("Listar Tecnicos");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
            }
            
            System.out.println(menu.getMenu());
            opcao = leitura.nextInt(); 
        }
        System.out.println("Programa encerrado");
    }
}
