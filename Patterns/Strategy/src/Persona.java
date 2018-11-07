import java.util.List;

public class Persona {

    private String nombre;
    private Recomendacion recomendacion;

    public Persona(String _nombre){
        nombre = _nombre;
    }

    public void setRecomendacion(Recomendacion recomendacion) {
        this.recomendacion = recomendacion;
    }

    public void recomendar(List<Pelicula> peliculas){
        recomendacion.recomendacion(peliculas);
    }
}
