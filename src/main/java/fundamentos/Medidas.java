// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classes
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada; // declarar

    // 3.2 - Metodos e funçao
    public static void main(String[] args) throws IllegalStateException {
        String opcao;
        int area = 0; // receber o resultado dos calculos de areas

        entrada = new Scanner(System.in); // instanciar o objeto de leitura do console (Ligar)

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine();// leitura da opção (usar)
        switch(opcao){
            case "1":
                calcularAreaDoQuadrado();
                break;
            case "2":
                break;
            default:
                throw new IllegalStateException("Opcao Invalida:" + opcao);

        }
        System.out.println("A area e de" + area + "m²" );
      }

      public static int calcularAreaDoQuadrado(){

        int lado;// tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado;// retona a área do quadrado




      }
}
