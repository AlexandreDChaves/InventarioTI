package InventarioTI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        Equipamento equipamento = null;

        do{
            System.out.println("\n=== SISTEMA DE INVENTÁRIO DE TI ===");
            System.out.println("1 - Cadastrar equipamento");
            System.out.println("2 - Listar equipamentos");
            System.out.println("3 - Buscar equipamento");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    System.out.println(">> Cadastrando equipamento...");
                    break;
                case 2:
                    System.out.println(">> Listando equipamentos...");
                    break;
                case 3:
                    System.out.println(">> Buscando equipamento...");
                    break;
                case 0:
                    System.out.println(">> Saindo do sistema. Ate logo!");
                    break;
                default:
                    System.out.println(">> Opcao invalida! Tente novamente.");
            }
        } while (opcao != 0);

        input.close();
    }

}
