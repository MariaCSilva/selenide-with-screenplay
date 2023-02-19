package selenide_screenplay.actor;

public class Ator<T> {
    private T t;

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }
    
}
