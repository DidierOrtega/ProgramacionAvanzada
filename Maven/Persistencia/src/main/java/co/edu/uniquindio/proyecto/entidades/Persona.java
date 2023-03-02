package co.edu.uniquindio.proyecto.entidades;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity

public class Persona implements Serializable {
    @Id
    private String cedula;
    private String nombre;
    private String email;
    private String telefono;
    public Persona(){
        super();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (!Objects.equals(cedula, persona.cedula)) return false;
        if (!Objects.equals(nombre, persona.nombre)) return false;
        if (!Objects.equals(email, persona.email)) return false;
        return Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {
        int result = cedula != null ? cedula.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        return result;
    }
}
