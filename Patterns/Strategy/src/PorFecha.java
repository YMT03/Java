import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PorFecha implements Recomendacion{
    @Override
    public void recomendacion(List<Pelicula> peliculas) {
        System.out.println("Te recomiendo verlas en este orden:");
        Collections.sort(peliculas, Comparator.comparing(s -> s.getFecha()));
        int i = 1;
        for(Pelicula pelicula : peliculas){
            System.out.println(i + ") " + pelicula.getNombre());
            i++;
        }
    }
}
