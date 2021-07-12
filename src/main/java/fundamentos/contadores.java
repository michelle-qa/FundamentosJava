package fundamentos;

public class contadores extends Medidas implements contadoresMedidas {
    public static  void main(String[] args){
        System.out.println("Deseja realizar a contagem regressiva? <S/N>");
        String resposta = entrada.nextLine();
        switch (resposta){
            case "S":
            case "s":
                contagemRegressiva();
                break;
            default:
                System.out.println("Digitou outro texto diferente de \"s\"");
        }
    }
    @Override
    public static void contagemRegressiva(){

    }
}
