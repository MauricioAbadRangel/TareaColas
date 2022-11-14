public class Cola_ADT<T> {
    LSL_ADT cola;
    
    public Cola_ADT(){
        this.cola = new LSL_ADT();
    }
    
    public boolean estaVacia(){
        return this.cola.estaVacia();
    }
    
    public int getTamaño(){
        return this.cola.getTamaño();
    }
    
    public void enqueue(T valor){
        this.cola.agregarAlFinal(valor);
    }
    
    public T dequeue(){
        Object Ayuda = this.cola.regresarInicio();
        cola.eliminarElPrimero();
        return (T)Ayuda;
    }
    
    public void transversal(){
        this.cola.transversal();
    }