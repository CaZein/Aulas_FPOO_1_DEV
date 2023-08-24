package praticando.atividadeClasses;

public class Curso {

    private String name;
    private String description;
    private EnumCursoCategoria enumCursoCategoria;



    public Curso(String name, String description, EnumCursoCategoria enumCursoCategoria) {
        this.name = name;
        this.description = description;
        this.enumCursoCategoria = enumCursoCategoria;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnumCursoCategoria getEnumCursoCategoria() {
        return enumCursoCategoria;
    }

    public void setEnumCursoCategoria(EnumCursoCategoria enumCursoCategoria) {
        this.enumCursoCategoria = enumCursoCategoria;
    }




    @Override
    public String toString() {
        return "Curso{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", enumCursoCategoria=" + enumCursoCategoria +
                '}';
    }
}
