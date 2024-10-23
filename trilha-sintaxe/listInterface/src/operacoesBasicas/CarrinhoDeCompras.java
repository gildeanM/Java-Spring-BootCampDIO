package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemLista;

    public CarrinhoDeCompras() {
        this.itemLista = new ArrayList<>();
    }

    public void adicionarItem( String nome, Double preco, int quantidade ){

        itemLista.add(new Item( nome, preco, quantidade ));

    }

    public void removerItem(String nome){

        List<Item> itensParaRemover = new ArrayList<>();


        if(!itemLista.isEmpty()){

            for(Item i : itemLista){

                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }

            }
            itemLista.removeAll(itensParaRemover);

        }else {

            System.out.println("A lista está vazia");

        }
    }


    public Double calcularValorTotal(){

        Double valorTotal = 0.0;

        if(!itemLista.isEmpty()){

            for(Item i : itemLista){

                valorTotal += i.getQuantidade() * i.getPreco();

            }

            return valorTotal;

        }else {

            return 0.0;

        }


    }


    public void exibirItens(){

        if(!itemLista.isEmpty()){

            System.out.println(this.itemLista);

        } else {

            System.out.println("A lista está vazia!");

        }
    }


}
