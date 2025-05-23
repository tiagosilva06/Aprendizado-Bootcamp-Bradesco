package map.DesafioDicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra (String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio");
        }

        if(dicionarioMap == null){
            System.out.println("Palavra não encontrada.");
        }
    }

    public void exibirPalavras (){
        if (!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public String pesquisaPorPalavra(String palavra){
        String definicao = dicionarioMap.get(palavra);
        if(definicao != null){
            return definicao;
        }
        return "Palavra não encontrada no dicionario";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisaPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisaPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
