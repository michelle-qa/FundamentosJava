package fundamentos;

import static fundamentos.Medidas.entrada;

public interface contadoresMedidas {
    static void contagemRegressiva() {
    System.out.println("Começar a contar a partir de qual numero? ");
            int numero = entrada.nextInt();

            for (int i = numero; i >= 1; i --) {
                System.out.println(i);
            }
        System.out.println("Digitou outro texto diferente de \"s\"");
    }
}
