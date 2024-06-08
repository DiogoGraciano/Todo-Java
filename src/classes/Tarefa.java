
package classes;

import enums.TarefaStatus;
import abstratas.Dados;

public class Tarefa extends Dados{
    //atributos
    private int id;
    private int prioridade;
    private String nome;
    private String descricao;
    private String status;
    private String dataIni;
    private String dataFim;

    //métodos
    public Tarefa() {
        this.setId(0);
        this.setNome("");
        this.setStatus(TarefaStatus.CRIADO);
        this.setDataIni("");
        this.setDataFim("");
    }

    public Tarefa(int id, String nome, TarefaStatus status, String dataIni,String dataFim) {
        this.setId(id);
        this.setNome(nome);
        this.setStatus(status);
        this.setDataIni(dataIni);
        this.setDataFim(dataFim);
    }
    //set
    public void setId(int id) {
        this.id = id < 1 ? 1 : id;
    }
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "SEM VALOR": nome.toUpperCase();
    }
    public void setStatus(TarefaStatus status) {
        this.status = status;
    }
    public void setDataIni(String data) {
        this.dataIni = data;
    }
    public void setDataFim(String data) {
        this.dataFim = data;
    }
    //get
    public int getId(int id) {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public TarefaStatus getStatus() {
        return this.status;
    }
    public String getDataIni() {
        return this.dataIni;
    }
    public String getDataFim() {
        return this.dataFim;
    }
    
}
