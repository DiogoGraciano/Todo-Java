
package classes;

import enums.TarefaStatus;
import abstratas.DadosTarefa;

public class Tarefa extends DadosTarefa{
    //atributos
    private int id;
    private int prioridade;
    private String nome;
    private String descricao;
    private TarefaStatus status;

    //métodos
    public Tarefa() {
        this.setId(0);
        this.setPrioridade(1);
        this.setNome("");
        this.setDescricao("");
        this.setStatus(TarefaStatus.CRIADO);
    }
    //set
    public void setId(int id) {
        this.id = id < 1 ? 1 : id;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade < 1 ? 1 : prioridade;
    }
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "SEM VALOR": nome.toUpperCase();
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty() ? "SEM VALOR": descricao.toUpperCase();
    }
    public void setStatus(TarefaStatus status) {
        this.status = status;
    }
    //get
    public int getId() {
        return this.id;
    }
    public int getPrioridade() {
        return this.prioridade;
    }
    public String getNome() {
        return this.nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public TarefaStatus getStatus() {
        return this.status;
    }
    public void store(){
        this.addData(this);
    }
}
