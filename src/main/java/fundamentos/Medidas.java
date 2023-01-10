// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {

    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Metodos e Funcoes
    public static void main(String[] args) {

        String opcao;
        double area = 0; // receber o resultado dos calculos de areas

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); // leitura da opção
        switch (opcao) {
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaDoCirculo();
                break;
            default:
                System.out.println("Opcao Invalida: " + opcao);
        }

        if (area > 0) {
            System.out.println("A area e de " + area + "m²");
        }

    }

    public static double calcularAreaDoQuadrado() { // não ter o "void" quer dizer que não queremos um retorno

        // Padrao para os códigos, declarar as variáveis no início do código
        double lado; // tamanho do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextDouble(); // leitura do tamanho do lado
        return lado * lado; // lado² - retorna a área do quadrado

    }

    public static double calcularAreaDoRetangulo() { // não ter o "void" quer dizer que não queremos um retorno

        // Padrao para os códigos, declarar as variáveis no início do código
        double base; // medida da base do retangulo
        double altura; // medida da altura do retangulo

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextDouble(); // leitura do tamanho da base
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextDouble(); // leitura do tamanho da altura
        return base * altura; // retorna a área do retangulo

    }

    public static double calcularAreaDoTriangulo() { // não ter o "void" quer dizer que não queremos um retorno

        // Padrao para os códigos, declarar as variáveis no início do código
        double base; // medida da base do retangulo
        double altura; // medida da altura do retangulo

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextDouble(); // leitura do tamanho da base
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextDouble(); // leitura do tamanho da altura
        return (base * altura) / 2; // retorna a área do triangulo

    }

    public static double calcularAreaDoCirculo() { // não ter o "void" quer dizer que não queremos um retorno

        // Padrao para os códigos, declarar as variáveis no início do código
        double raio; // medida da raio do circulo

        System.out.println("Digite o tamanho da area: ");
        raio = entrada.nextDouble(); // leitura do raio do circulo
        return (3.1416 * raio * raio); // retorna a área do circulo

    }

}
