import java.util.Scanner;

public class TipoCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();

        Scanner menu = new Scanner (System.in);

        System.out.print("##---- Menu de Análise ---- ##\n\n");
        System.out.print("|----------------------------------|\n");
        System.out.print("| Opção 1 - Honda Civic Sport 2.0  |\n");
        System.out.print("| Opção 2 - Chevrolet Onix (1.0)   |\n");
        System.out.print("| Opção 3 - Renault Captur         |\n");
        System.out.print("|----------------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("\nHonda Civic Sport 2.0 Selecionado\n");

                carro.setCambio(new Automatico());
                carro.utilizarCambio();

                carro.setCombustivel(new Flex());
                carro.injetarCombustivel();
                break;

            case 2:
                System.out.print("\nChevrolet Onix (1.0) Selecionado\n");

                carro.setCambio(new Manual());
                carro.utilizarCambio();

                carro.setCombustivel(new Gasolina());
                carro.injetarCombustivel();
                break;

            case 3:
                System.out.print("\nRenault Captur Selecionado\n");

                carro.setCambio(new Automatico());
                carro.utilizarCambio();

                carro.setCombustivel(new Flex());
                carro.injetarCombustivel();
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;

        }
    }
}