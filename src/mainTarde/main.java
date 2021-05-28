package mainTarde;

import mainTarde.figuraGeometrica.*;
import mainTarde.password.Password;
import mainTarde.password.PasswordFuerte;
import mainTarde.password.PasswordIntermedia;
import mainTarde.password.PasswordSimple;

public class main {
    public static void main(String[] args) {
        try{
            Password pass = new Password("[0-9]+");
            pass.setValue("123456");
            System.out.println("Pass seteada correctamente");

            PasswordSimple passSimple = new PasswordSimple();
            passSimple.setValue("1234");
            System.out.println("Pass simple seteada correctamente");

            PasswordIntermedia passIntermedia = new PasswordIntermedia();
            passIntermedia.setValue("f46612ds");
            System.out.println("Pass intermedia seteada correctamente");

            PasswordFuerte passFuerte = new PasswordFuerte();
            passFuerte.setValue("f4661f46612ds2ds");
            System.out.println("Pass fuerte seteada correctamente");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Termine las passwords\n");


        Circulo c = new Circulo(5/Math.sqrt(Math.PI));
        Rectangulo r = new Rectangulo(10,2);
        Triangulo t = new Triangulo(6,10);
        FiguraGeometrica[] figuras = new FiguraGeometrica[]{c,r,t};

        System.out.println(Util.areaPromedio(figuras));


    }
}
