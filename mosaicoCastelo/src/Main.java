//Cabeçalho: A primeira linha da saída deve conter exatamente o texto
//--- DIMENSAO N x N --- (substituindo N pelo número informado na entrada).
//
//Cantos: Os 4 cantos da estrutura devem ser representados pelo caractere +.
//
//Bordas: As bordas superiores, inferiores e laterais (com exceção dos cantos) devem ser
//representadas pelo caractere #.
//
//Interior: O centro da estrutura deve ser totalmente preenchido pelo caractere ..


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int coluna = 1;
        int linha = 1;
        int tamanho = 1;

        do {
            System.out.println("escolha um número inteiro maior que 2 e menor que 21");
            tamanho = leia.nextInt();
        } while (tamanho < 3 || tamanho > 20);


        linha = tamanho;
        coluna = linha;

        System.out.println("\n"+"---DIMENSAO "+tamanho+" X "+tamanho+"---");

        do {
            System.out.println("");

            do {

                if (coluna == tamanho && linha == tamanho) {
                    System.out.print("+");
                } else if (linha == 1 && coluna == tamanho) {
                    System.out.print("+");
                }else if (linha == tamanho && coluna == 1) {
                    System.out.print("+");
                }else if (linha == 1 && coluna == 1) {
                    System.out.print("+");
                }else if (linha == tamanho && (coluna < tamanho && coluna > 1)) {
                    System.out.print("#");
                }else if (linha == 1 && (coluna < tamanho && coluna > 1)) {
                    System.out.print("#");
                }else if ((linha < tamanho && linha > 1) && coluna == tamanho) {
                    System.out.print("#");
                }else if ((linha < tamanho && linha > 1) && coluna == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }

                coluna--;

            } while (linha * coluna >= 1);

            coluna = tamanho;
            linha--;

        } while (linha >= 1);


    }
}
