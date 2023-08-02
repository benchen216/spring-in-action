package win.ben2.springinactionMVC.data;

public class Spittler {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    public Spittler(long id,String username, String password,String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
    public Spittler(String username, String password,String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

}
