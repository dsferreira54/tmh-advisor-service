package fun.toomanyhats.model;

public class Hat {
    private Long id;
    private String name;
    private String color;
    private Artisan artisan;

    public Hat() {}

    public Hat(Long id, String name, String color, Artisan artisan) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.artisan = artisan;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Artisan getArtisan() {
        return artisan;
    }

    public void setArtisan(Artisan artisan) {
        this.artisan = artisan;
    }
}
