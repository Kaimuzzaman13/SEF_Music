import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class updateArtist {

    private Artist artist;

    @BeforeEach
    public void setup() {
        ArrayList<String> occupation = new ArrayList<>(Arrays.asList("Singer"));
        ArrayList<String> genres = new ArrayList<>(Arrays.asList("jazz", "blues"));
        ArrayList<String> awards = new ArrayList<>(Arrays.asList("2022, Best New Artist"));

        artist = new Artist("569MMMRR_%", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", 
                            "This is a sample bio WHICH is good for everyone", occupation, genres, awards);
    }

    @Test
    public void testUpdateArtistID() {
        artist.setID("777ZZZ^^");
        assertFalse(artist.updateArtist(artist));

        artist.setID("888YYY&&&");
        assertFalse(artist.updateArtist(artist));
    }

    @Test
    public void testUpdateBirthdate() {
        artist.setBirthdate("32-13-2001");
        assertFalse(artist.updateArtist(artist));

        artist.setBirthdate("10-05-ABCD");
        assertFalse(artist.updateArtist(artist));
    }

    @Test
    public void testUpdatePre2000Artist() {
        artist.setBirthdate("05-11-1999");
        artist.setOccupation(new ArrayList<>(Arrays.asList("Composer")));
        assertFalse(artist.updateArtist(artist));
    }

    @Test
    public void testUpdatePre2000Awards() {
        artist.setAwards(new ArrayList<>(Arrays.asList("1999, Best Album", "2022, Best New Artist")));
        artist.updateArtist(artist);  // Assumes the initial update is correct to set the state.

        artist.setAwards(new ArrayList<>(Arrays.asList("1999, Best Album Ever", "2022, Best New Artist")));
        assertFalse(artist.updateArtist(artist));
    }

    @Test
    public void testUpdateBioLength() {
        artist.setID("Hello");
        assertFalse(artist.updateArtist(artist));

        artist.setID("This is a very very very very very very long bio for an artist which should not be accepted.");
        assertFalse(artist.updateArtist(artist));
    }

    @Test
    public void testUpdateGenreCombinations() {
        artist.setGenres(new ArrayList<>(Arrays.asList("pop", "rock")));
        assertFalse(artist.updateArtist(artist));

        artist.setGenres(new ArrayList<>(Arrays.asList("jazz", "blues", "soul", "R&B", "funk", "gospel")));
        assertFalse(artist.updateArtist(artist));
    }
}
