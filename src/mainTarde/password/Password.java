package mainTarde.password;

public class Password {
    private String regex;
    private String value;

    public Password(String regex) {
        setRegex(regex);
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public void setValue(String value) throws Exception{
        this.value = value;
        if(!value.matches(this.regex)){
            throw new Exception("Password invalida, trata de que matchee con: \""+this.regex+"\"");
        }
    }
}
