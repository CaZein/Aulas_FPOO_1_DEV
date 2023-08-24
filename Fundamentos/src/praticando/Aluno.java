package praticando;

public class Aluno {

    private String name;
    private int age;
    private String ra;
    private String email;
    private String situation;



    public void estudar(){
        this.situation = "Estudando";
    }

    public void escrevendo(){
        this.situation = "Escrevendo";
    }

    public Aluno(String name, int age, String ra, String email, String situation) {
        this.name = name;
        this.age = age;
        this.ra = ra;
        this.email = email;
        this.situation = "Nasceu";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return age;
    }

    public void setIdade(int idade) {
        this.age = idade;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", idade=" + age +
                ", ra='" + ra + '\'' +
                ", email='" + email + '\'' +
                ", situation='" + situation + '\'' +
                '}';
    }
}
