package mainTarde.password;

//Debe tener un minimo de 8 caracteres
public class PasswordIntermedia extends Password{

    private static final String regex = "^[a-zA-Z0-9].{7,}$";

    public PasswordIntermedia() {
        super(regex);
    }
}
