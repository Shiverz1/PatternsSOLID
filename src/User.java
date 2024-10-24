import javax.management.relation.Role;

//Принцип SRP
public class User {
    private String id;
    private String name;
    private String email;
    private int number;
    private Role role;

    public User(String id, String name, String email, int number, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.number = number;
        this.role = role;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public enum Role {
        ADMIN, CUSTOMER
    }
}
