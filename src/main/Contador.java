package main;

public class Contador {

    int actual;

    public Contador(){
        setActual(0);
    }

    public Contador(int actual){
        setActual(actual);
    }

    public Contador(Contador c){
        setActual(c.actual);
    }

    public void incrementar(){
        this.actual++;
    }

    public void decrementar(){
        this.actual--;
    }

    public int getActual() {
        return actual;
    }

    private void setActual(int actual) {
        this.actual = actual;
    }
}
