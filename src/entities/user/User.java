
package entities.user;

public class User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;

    public User() {
    }

    @Override
    public String toString() {
        return "User{ "+"id="+id+", name="+name+",surname="+surname+", email="+email+", login="+login+", password="+password+" }";
    }

    public User(String id, String name, String surname, String email, String login, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
