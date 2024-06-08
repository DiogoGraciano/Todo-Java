
package abstratas;

abstract public class DadosRepository extends Dados{
    
    private Object[] data;
    
    public DadosRepository(){
        this.data[0] = null;
    }
    protected void addObject(Object object){
        this.data[0] = object;
    }
    protected Object getObject(){
        return this.data[0];
    }
    protected void addToDados(){
        this.addData(this);
    }
}
