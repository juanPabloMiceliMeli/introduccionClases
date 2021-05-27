package main;

public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion(int numerador) {
        setNumerador(numerador);
        setDenominador(1);
    }

    public Fraccion(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador == 0){
            throw new RuntimeException("El denominador tiene que ser distinto de 0");
        }
        this.denominador = denominador;
    }

    public void reducir(){
        int i = 2;

        while(i <= Math.min(this.numerador, this.denominador)){
            if(this.numerador%i == 0 && this.denominador%i == 0){
                setNumerador(numerador/i);
                setDenominador(denominador/i);
            }else{
                i++;
            }
        }
    }

    public void sumar(Fraccion f){
        setNumerador(this.numerador*f.denominador + f.numerador*this.denominador);
        setDenominador(f.denominador*this.denominador);
        this.reducir();
    }

    public void sumar(int n){
        this.sumar(new Fraccion(n));
    }

    public void multiplicar(Fraccion f){
        setNumerador(this.numerador*f.numerador);
        setDenominador(this.denominador*f.denominador);
        this.reducir();
    }

    public void multiplicar(int n){
        this.multiplicar(new Fraccion(n));
    }

    public void restar(Fraccion f){
        f.multiplicar(-1);
        this.sumar(f);
    }

    public void restar(int n){
        this.restar(new Fraccion(n));
    }

    public void invertir(){
        int aux = denominador;
        setDenominador(numerador);
        setNumerador(aux);
    }

    public void dividir(Fraccion f){
        this.invertir();
        this.multiplicar(f);
        this.invertir();
    }

    public void dividir(int n){
        this.dividir(new Fraccion(n));
    }




    @Override
    public String toString() {
        return "Fraccion{" + numerador + "/" + denominador +'}';
    }

    @Override
    public boolean equals(Object f){
        if(!(f instanceof Fraccion)){
            return false;
        }
        Fraccion x = (Fraccion)f;
        return x.numerador == this.numerador && x.denominador == this.denominador;
    }

}
