package list.DesafioOrdenarNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public List <Integer>ordernarAscendente (){
        List<Integer> numeroAscendente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            Collections.sort(numeroAscendente);
            return numeroAscendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente (){
        List<Integer> numeroDescendente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            numeroDescendente.sort(Collections.reverseOrder());
            return numeroDescendente;
        } else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(50);
        ordenacaoNumeros.adicionarNumero(21);

        System.out.print("Numeros adicionados =");
        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordernarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }
}
