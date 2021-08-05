public class Author implements Comparable<Author> {

    private String name;
    private String email;
    private String gender;

    public Author() {
    }

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Author o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name ;
    }
}
