package dk.kea.musicdata.repository;

import dk.kea.musicdata.model.NewMusic;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NewMusicRepository {
    public List<NewMusic> getAll() {
        List<NewMusic> albums = new ArrayList<>();

        albums.add(new NewMusic("Metallica", "Master of Puppets", 1986, "Elektra"));
        albums.add(new NewMusic("Black Sabbath", "Paranoid", 1970, "Vertigo"));
        albums.add(new NewMusic("Iron Maiden", "The Number of the Beast", 1982, "EMI"));
        albums.add(new NewMusic("Slayer", "Reign in Blood", 1986, "Def Jam"));
        albums.add(new NewMusic("Megadeth", "Rust in Peace", 1990, "Capitol"));
        albums.add(new NewMusic("Pantera", "Vulgar Display of Power", 1992, "Atco"));
        albums.add(new NewMusic("Opeth", "Blackwater Park", 2001, "Music for Nations"));
        albums.add(new NewMusic("Tool", "Lateralus", 2001, "Volcano"));
        albums.add(new NewMusic("Mastodon", "Crack the Skye", 2009, "Reprise"));
        albums.add(new NewMusic("Gojira", "From Mars to Sirius", 2005, "Listenable"));

        return albums;
    }
}
