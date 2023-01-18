package fundamentos;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {

    public static void main(String[] args) throws IOException {
        String[] cabecalho = {"nome","idade","telefone"};

        List<String[]> linhas = new ArrayList<>(); // cria a tabela vazia
        linhas.add(new String[]{"Beatriz","29","11 999999999"});
        linhas.add(new String[]{"Gilmo","25","31 888888888"});
        linhas.add(new String[]{"Silas","21","11 777777777"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clientes.csv")); // caminho para aonde quer que grava as informações
        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(cabecalho); // preparar cabeçalho
        escritorCSV.writeAll(linhas); // preparar linhas

        escritorCSV.flush(); // gerar arquivo
        escritorCSV.close(); // fechar arquivo para não conrroper
    }
}
