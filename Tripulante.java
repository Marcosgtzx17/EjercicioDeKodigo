public class Tripulante {
    private String rol;

    public Tripulante(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return rol;
    }
}
