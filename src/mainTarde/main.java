package mainTarde;

import mainTarde.password.Password;

public class main {
    public static void main(String[] args) {
        try{
            Password pass = new Password("[0-9]+");
            pass.setValue("123456");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Termine");

    }
}
