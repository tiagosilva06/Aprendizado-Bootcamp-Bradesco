package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        if(!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("A lista de contatos está vazia");
        }
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();
    //no Map se os Nomes forem repetidos ele irá atualizar o numero para o ultimo inserido
        //Reparar no contato "Gustavo Almeida"
        contatos.adicionarContato("Kauan Henrique", 1140028922);
        contatos.adicionarContato("Lucas Araujo", 1149894545);
        contatos.adicionarContato("Gustavo Almeida", 1111111111);
        contatos.adicionarContato("Gustavo Almeida", 222222222);
        contatos.adicionarContato("Lucas Silva", 1122222222);
        contatos.adicionarContato("Giovanni Cunha", 1133333333);
        contatos.adicionarContato("Giovanni Escola", 1133333333);
        contatos.adicionarContato("Carlos Henrique", 1133333533);


        contatos.exibirContatos();
        contatos.removerContato("Carlos Henrique");

        contatos.exibirContatos();
        System.out.println(contatos.pesquisaPorNome("Lucas Silva"));


    }


}
