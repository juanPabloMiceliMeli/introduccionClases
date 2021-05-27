package main;

public class CuentaCorriente {




    String fullName;
    double saldo;

    public CuentaCorriente(){
        setFullName("N/N");
        setSaldo(0);
    }

    public CuentaCorriente(String fullName){
        setFullName(fullName);
        setSaldo(0);
    }
    public CuentaCorriente(CuentaCorriente c){
        setFullName(c.fullName);
        setSaldo(c.saldo);
    }

    public static boolean montoValido(double monto){
        return monto >= 0;
    }

    public void ingreso(double monto){
        if(montoValido(monto)){
            throw new RuntimeException("El monto debe ser positivo");
        }
        this.saldo += monto;
    }

    public void egreso(double monto){
        if(montoValido(monto)){
            throw new RuntimeException("El monto debe ser positivo");
        }
        if(monto > this.saldo){
            throw new RuntimeException("Queres sacar mas plata de la que tenes");
        }
        this.saldo -= monto;
    }

    public void reintegro(double monto){
        if(montoValido(monto)){
            throw new RuntimeException("El monto debe ser positivo");
        }
        this.ingreso(monto);
    }

    public static void transferencia(CuentaCorriente src, CuentaCorriente dst, double monto){
        if(montoValido(monto)){
            throw new RuntimeException("El monto debe ser positivo");
        }
        src.egreso(monto);
        dst.ingreso(monto);
    }

    public double getSaldo() {
        return saldo;
    }

    //Necesito que sea privada para que no se carguen plata infinita
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



}
