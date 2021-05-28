package mainTarde.password;

//Acepta lo que quieras salvo por espacios
public class PasswordSimple extends Password {

    private static final String regex = "[^ ]+";

    public PasswordSimple() {
        super(regex);
    }

}
