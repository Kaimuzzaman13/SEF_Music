import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
class ArtistTest {

    @Test
    public void testAddArtist1() {
        // Test Data 1
    	ArrayList<String> occupation1 = new ArrayList<>(Arrays.asList("Singer", "Songwriter"));
        ArrayList<String> awards1 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres1 = new ArrayList<>(Arrays.asList("pop", "classical", "jazz"));
        Artist artist1 = new Artist("569MMMRR_%", "Test Artist1", "Melbourne|Victoria|Australia", "05-11-1980", "Music enthusiast with great hits is very good person real.", occupation1, genres1, awards1);
        assertTrue(artist1.addArtist());
     // Test Data 2
        ArrayList<String> occupation2 = new ArrayList<>(Arrays.asList("Musician", "Songwriter"));
        ArrayList<String> awards2 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres2 = new ArrayList<>(Arrays.asList( "jazz","pop", "classical"));
        Artist artist2 = new Artist("959AMMRR_$", "Test Artist2","Melbourne|Victoria|Australia", "05-11-1989", "Music enthusiast with great hits is very good person real.", occupation2, genres2, awards2);
        assertTrue(artist2.addArtist());
    }
    @Test
    public void testAddArtist2() {
        // Test Data 1
    	ArrayList<String> occupation3 = new ArrayList<>(Arrays.asList("Singer", "Songwriter"));
        ArrayList<String> awards3 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres3 = new ArrayList<>(Arrays.asList("pop", "classical", "jazz"));
        Artist artist3 = new Artist("123MMMRR_%", "Test Artist3", "Melbourne|Victoria|Australia", "05-11-1980", "Music enthusiast with great hits is very good person real.", occupation3, genres3, awards3);
        assertFalse(artist3.addArtist());
     // Test Data 2
        ArrayList<String> occupation4 = new ArrayList<>(Arrays.asList("Singer", "Songwriter"));
        ArrayList<String> awards4 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres4 = new ArrayList<>(Arrays.asList( "jazz","pop", "classical"));
        Artist artist4 = new Artist("322AMMRR_$", "Test Artist4", "Melbourne|Victoria|Australia", "05/11/1980", "Music enthusiast with great hits is very good person real.", occupation4, genres4, awards4);
        assertFalse(artist4.addArtist());
}
    @Test
    public void testAddArtist3() {
        // Test Data 1
    	ArrayList<String> occupation5 = new ArrayList<>(Arrays.asList("Singer", "Songwriter"));
        ArrayList<String> awards5 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres5 = new ArrayList<>(Arrays.asList("pop", "classical", "jazz"));
        Artist artist5 = new Artist("569MMMRR_%", "Test Artist1", "Melbourne|Victoria|Australia", "05.11.1980", "Music enthusiast with great hits is very good person real.", occupation5, genres5, awards5);
        assertFalse(artist5.addArtist());
     // Test Data 2
        ArrayList<String> occupation6 = new ArrayList<>(Arrays.asList("Musician", "Songwriter"));
        ArrayList<String> awards6 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres6 = new ArrayList<>(Arrays.asList( "jazz","pop", "classical"));
        Artist artist6 = new Artist("959AMMRR_$", "Test Artist2","Melbourne|Victoria|Australia", "05/11/1989", "Music enthusiast with great hits is very good person real.", occupation6, genres6, awards6);
        assertFalse(artist6.addArtist());
    }
    @Test
    public void testAddArtist4() {
        // Test Data 1
    	ArrayList<String> occupation5 = new ArrayList<>(Arrays.asList("Singer", "Songwriter"));
        ArrayList<String> awards5 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres5 = new ArrayList<>(Arrays.asList("pop", "classical", "jazz"));
        Artist artist5 = new Artist("979ASZRR_$","Test Artist1", "Melbourne|Victoria|Australia", "05-11-1980", "Music enthusiast with great hits is very good person real.", occupation5, genres5, awards5);
        assertTrue(artist5.addArtist());
     // Test Data 2
        ArrayList<String> occupation6 = new ArrayList<>(Arrays.asList("Musician", "Songwriter"));
        ArrayList<String> awards6 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres6 = new ArrayList<>(Arrays.asList( "jazz","pop", "classical"));
        Artist artist6 = new Artist("999ZMMRR_$", "Test Artist2", "Sydney|New South Wales|Australia", "05-11-1989", "Music enthusiast with great hits is very good person real.", occupation6, genres6, awards6);
        assertTrue(artist6.addArtist());
    }
    @Test
    public void testAddArtist5() {
        // Test Data 1
    	ArrayList<String> occupation5 = new ArrayList<>(Arrays.asList("Singer", "Songwriter"));
        ArrayList<String> awards5 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres5 = new ArrayList<>(Arrays.asList("pop", "classical", "jazz"));
        Artist artist5 = new Artist("979ASZRR_$","Test Artist1", "ictoria|Melbourne|VAustralia", "05-11-1980", "Music enthusiast with great hits is very good person real.", occupation5, genres5, awards5);
        assertTrue(artist5.addArtist());
     // Test Data 2
        ArrayList<String> occupation6 = new ArrayList<>(Arrays.asList("Musician", "Songwriter"));
        ArrayList<String> awards6 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres6 = new ArrayList<>(Arrays.asList( "jazz","pop", "classical"));
        Artist artist6 = new Artist("999ZMMRR_$", "Test Artist2", "Australia|New South Wales|Sydney", "05-11-1989", "Music enthusiast with great hits is very good person real.", occupation6, genres6, awards6);
        assertTrue(artist6.addArtist());
    }
	@Test
    public void testAddArtist6() {
        // Test Data 1
    	ArrayList<String> occupation5 = new ArrayList<>(Arrays.asList("Singer", "Songwriter"));
        ArrayList<String> awards5 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres5 = new ArrayList<>(Arrays.asList("pop", "classical", "jazz"));
        Artist artist5 = new Artist("569MMMRR_%", "Test Artist1", "Melbourne|Victoria|Australia", "05-11-1980", "Music enthusiast with great hits is very good person real.", occupation5, genres5, awards5);
        assertTrue(artist5.addArtist());
     // Test Data 2
        ArrayList<String> occupation6 = new ArrayList<>(Arrays.asList("Musician", "Songwriter"));
        ArrayList<String> awards6 = new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media"));
        ArrayList<String> genres6 = new ArrayList<>(Arrays.asList( "jazz","pop", "classical"));
        Artist artist6 = new Artist("959AMMRR_$", "Test Artist2","Melbourne|Victoria|Australia", "05-11-1989", "Music enthusiast with great hits is very good person real.", occupation6, genres6, awards6);
        assertTrue(artist6.addArtist());
    }
}