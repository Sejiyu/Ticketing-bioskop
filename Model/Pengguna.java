package Model;

public abstract class Pengguna {
    protected String id;
    protected String nama;
    protected String email;
    protected String password;
    protected String role;

    public Pengguna(String id, String nama, String email, String password, String role) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getRole() {
        return role;
    }

    public String getNama() {
        return nama;
    }
    
    public String getEmail() {
        return email;
    }
}
