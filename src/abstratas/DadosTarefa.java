
package abstratas;
import java.util.LinkedList;
import classes.Tarefa;

abstract public class DadosTarefa {
    protected static LinkedList<Tarefa> data;
    
    protected DadosTarefa(){}
  
    public static int getLastId() {
        if(DadosTarefa.data.isEmpty())
            return 1;
        else
            return DadosTarefa.data.size() + 1;
    }
    
    public static void startData(){
        DadosTarefa.data = new LinkedList<Tarefa>();
    }
    
    protected void addData(Tarefa object){
        DadosTarefa.data.add(object);
    }
    
    public static LinkedList<Tarefa> getAllData(){
        return DadosTarefa.data;
    }
}
