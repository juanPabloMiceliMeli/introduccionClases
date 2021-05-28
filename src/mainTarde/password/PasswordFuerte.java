package mainTarde.password;

public class PasswordFuerte extends Password{

    private static final String regex = "^[a-zA-Z0-9].{15,}$";

    public PasswordFuerte() {
        super(regex);
    }
}
