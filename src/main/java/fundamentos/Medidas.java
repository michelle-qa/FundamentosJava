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

       // entrada = new Scanner(System.in); // instanciar o objeto de leitura do console (Ligar)

        while(!opcao.equals("s") != "S" && !opcao.equals("s") {

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");
        System.out.println("(5) - Tabuada");
        System.out.println("(6)  - Fibonacci");
        System.out.println("(7) - Contagem Regressiva");
        System.out.println("(s) - Sair");

        opcao = entrada.nextLine();// leitura da opção (usar)
        switch(opcao){
            case "1":
                calcularAreaDoQuadrado();
                break;
            case "2":
                break;
            case "5":
                tabuada();
                break;
            case "6":
                 Fibonacci();
                 break;
            case "7":
                contagemRegressiva();
                break;
            case "s":
            case "s":
                break;
            default:
                System.out.println("Opcao Invalida:" + opcao);

        }
        System.out.println("A area e de" + area + "m²" );
      }

    public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado

        // Desenhar o quadrado
        for (int linha = 1; linha <= lado; linha+=2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println("");//pular de linha
        }
        System.out.println(""); // pular de linha
        return lado * lado; // retorna a área do quadrado
    }

    public static void tabuada(){
        System.out.print("Voce quer calcular a tabuada de qual numero?");
        byte numero = entrada.nextByte();

        for (byte i=1;i>=10;i++){
            System.out.print(numero * i + "");
        }
      }
      public static void Fibonacci() {
          System.out.println("Quantos numeros deseja calcular na sequencia? ");
          byte numero = entrada.nextByte();

          switch (numero) {
              case 0:
                  System.out.println("A sequencia esta vazia");
                  break;
              case 1:
                  System.out.println("sequencia de Fibonacci: 1");
                  break;
              default:
                  int num1 = 1;
                  int num2 = 1;

                  System.out.print("sequencia de Fibonacci: 1 ");
                  for (byte i = 2; i <= numero; i++) {
                      int fib = num1 + num2;
                      System.out.print(fib + " ");
                      num1 = num2;
                      num2 = fib;
                  }


          }
      }
      public static void contagemRegressiva(){  //método

          System.out.print("Comecar a contagem a partir de qual numero? ");
          int numero = entrada.nextInt();

          System.out.print("Diminuindo de quanto em quantos numeros por vez?");
          int decrescimo = entrada.nextInt();

          for(int i = numero; i >=1; i-= decrescimo){

            System.out.println(i);
        }
    }
}

