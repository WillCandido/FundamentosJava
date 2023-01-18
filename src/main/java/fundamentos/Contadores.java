package fundamentos;

public class Contadores extends Medidas implements ContadoresMedidas {

    public static void main(String[] args) {

        System.out.print("Deseja realizar a contagem regressiva? <S/N> ");
        String resposta = entrada.next();
        switch (resposta) {
            case "S":
            case "s":
                ContadoresMedidas.contagemRegressiva();
                break;
            default:
                System.out.println("Digitou outro texto diferente de \"S\"");
        }
    }

}
