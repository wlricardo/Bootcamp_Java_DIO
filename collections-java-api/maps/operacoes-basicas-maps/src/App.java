import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();
        dicionario.adicionarPalavra("Manga", "Fruta");
        dicionario.adicionarPalavra("Laranja", "Cor");
        dicionario.adicionarPalavra("Tênis", "Esporte");

        dicionario.exibirPalavras();
        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("Siginificado de " + palavra + ": " + dicionario.pesquisarPorPalavra(palavra));
    }
}
