
package abstratas;
import java.util.LinkedList;
import java.lang.reflect.Method;

abstract public class Dados {
    private static LinkedList<DadosRepository> data;
    
    protected void addData(DadosRepository object){
        Dados.data.add(object);
    }
    protected LinkedList getAllData(){
        return Dados.data;
    }
    protected LinkedList getByField(String metodo,String value) {
        for (DadosRepository dados : this.getAllData()){
            
            Class<?> clazz = dados.getObject().getClass();
                    
            Method method = clazz.getMethod(metodo, String.class);
            
            if(method.invoke(method).equals(value)){
                return method.invoke(method);
            }
        }
    } 
}
