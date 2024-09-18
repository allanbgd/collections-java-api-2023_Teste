package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    //não precisa receber
    public ListaTarefa() {
        //herança do arraylist
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        //como tarefa list tem a variavel tarefa, chama a variavel aqui
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        //criou uma lista vazia, vai adcionar as descrições com base na que foi passada

      List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //enquanto as tarefas da tarefaList
      for(Tarefa t : tarefaList){
          if (t.getDescricao().equalsIgnoreCase(descricao)){


            tarefasParaRemover.add(t);

          }
      }
      //para remover todas as tarefas que estiverem repetidas
      tarefaList.removeAll(tarefasParaRemover);


    }

    public int obterNumeroTotalTarefas(){
        //quantidade de elementos em tarefa list
        return tarefaList.size();
    }
    public  void obterDescricoesTarefas(){
        //mostra oq tem dentro da tarefa list
        System.out.println(tarefaList);

    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na  lista é " + listaTarefa.obterNumeroTotalTarefas());
    
        listaTarefa.removeTarefa("Tarefa 1");
        System.out.println("O número total de elementos na  lista é " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.obterDescricoesTarefas();
    }
}
