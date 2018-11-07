import java.util.ArrayList;
import java.util.List;

public class start {
    public static void main(String[]args){
        Pelicula StarWars1 = new Pelicula();
        StarWars1.setFecha(1977);
        StarWars1.setNombre("A New Hope EP4");
        StarWars1.setNumeroEpisodio(4);

        Pelicula StarWars2 = new Pelicula();
        StarWars2.setFecha(1980);
        StarWars2.setNombre("The Empires Strikes Back EP5");
        StarWars2.setNumeroEpisodio(5);

        Pelicula StarWars3 = new Pelicula();
        StarWars3.setFecha(1983);
        StarWars3.setNombre("Return of the jedi EP6");
        StarWars3.setNumeroEpisodio(6);

        Pelicula StarWars4 = new Pelicula();
        StarWars4.setFecha(1999);
        StarWars4.setNombre("The Phantom Menace EP1");
        StarWars4.setNumeroEpisodio(1);

        Pelicula StarWars5 = new Pelicula();
        StarWars5.setFecha(2002);
        StarWars5.setNombre("Attack of the Clones EP2");
        StarWars5.setNumeroEpisodio(2);

        Pelicula StarWars6 = new Pelicula();
        StarWars6.setFecha(2005);
        StarWars6.setNombre("Revenge of the Sith EP3");
        StarWars6.setNumeroEpisodio(3);


        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(StarWars6);
        peliculas.add(StarWars1);
        peliculas.add(StarWars4);
        peliculas.add(StarWars2);
        peliculas.add(StarWars3);
        peliculas.add(StarWars5);

        Persona mauri = new Persona("Mauri");
        mauri.setRecomendacion(new PorEpisodio());
        mauri.recomendar(peliculas);
        System.out.println("AH NO PARA PARA, AHORA CAPAZ QUE PIENSO Y PODRIA SER ASI");
        mauri.setRecomendacion(new PorFecha());
        mauri.recomendar(peliculas);
    }
}
