package fun.toomanyhats.model;

public class Artisan {
    private Long id;
    private String name;
    private String specialty;

    public Artisan() {}

    public Artisan(Long id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.specialty = speciality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
