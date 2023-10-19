import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
public class Artist {
	private String ID;
	private String Name;
	private String Address;
	private String Birthdate;
	private String Bio;
	private ArrayList <String> Occupation;
	private ArrayList <String> Genres;
	private ArrayList <String> Awards;
	
	public Artist(String id, String name, String address, String birthdate, String bio,
			ArrayList<String> occupation, ArrayList<String>genres, ArrayList<String>awards)
	{
		ID =id;
		Name = name;
		Address = address;
		Birthdate = birthdate;
		Bio = bio;
		Occupation = occupation;
		Genres = genres;
		Awards = awards;
	}
	public boolean addArtist() {
        try {
            if (validateArtist()) {
                // Assuming the TXT file is in the proper format and accessible
                FileWriter fw = new FileWriter("artists.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw);

                // Compose the artist's data line
                String artistInfo = String.join(",",
                    Arrays.asList(ID, Name, Address, Birthdate, Bio,
                                  String.join(";", Occupation),
                                  String.join(";", Genres),
                                  String.join(";", Awards)));
                
                out.println(artistInfo);
                out.close();
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            // Exception handling can be more specific based on the nature of the error
            return false;
        }
    }

    private boolean validateArtist() {
        // Implementing all the conditions here
        // This is a simplified version, some conditions may need more robust handling

        try {
            // Condition 1: Validate ID
            String idPattern = "^[5-9]{3}[A-Z]{5}..$"; // Simplified regex, you might want to specify the special characters
            if (!Pattern.matches(idPattern, this.ID)) {
                return false;
            }

            // Condition 2: Validate Birthdate format
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false);
            Date birthDate = sdf.parse(this.Birthdate); // if not valid, it will throw ParseException

            // Condition 3: Validate Address
            String[] addressParts = this.Address.split("\\|");
            if (addressParts.length != 3) {
                return false;
            }

            // Condition 4: Validate Bio
            int wordCount = this.Bio.split("\\s+").length;
            if (wordCount < 10 || wordCount > 30) {
                return false;
            }

            // Condition 5: Validate Occupation
            if (this.Occupation.size() < 1 || this.Occupation.size() > 5) {
                return false;
            }

            // Condition 6: Validate Awards
            if (this.Awards.size() > 3) {
                return false;
            }
            for (String award : this.Awards) {
                String[] awardParts = award.split(", ");
                if (awardParts.length != 2) {
                    return false;
                }
                int titleWordCount = awardParts[1].split("\\s+").length;
                if (titleWordCount < 4 || titleWordCount > 10) {
                    return false;
                }
            }

            // Condition 7: Validate Genres
            if (this.Genres.size() < 2 || this.Genres.size() > 5 || 
                (this.Genres.contains("pop") && this.Genres.contains("rock"))) {
                return false;
            }
        } catch (ParseException ex) {
            return false; // birthdate didn't match the valid format
        }

        return true;
    }
    public boolean updateArtist(Artist newArtistData) {
        if (!validateArtistUpdate(newArtistData)) {
            return false;
        }

        // Here, you should implement the logic to update the artist's information in your storage system.
        // This could mean searching for the artist's current data in the file, replacing it with newArtistData's information,
        // and saving the file again.

        // Since this process involves file handling and data manipulation,
        // there could be several checks and balances to ensure data integrity.

        return true;
    }

    private boolean validateArtistUpdate(Artist newArtistData) {
        // This method will check all the conditions of the addArtist method and additionally,
        // it will also verify the update-specific conditions.
        // For example, if the artist was born before 2000, their occupation can't be changed.

        // Firstly, check all conditions from validateArtist method
        if (!newArtistData.validateArtist()) {
            return false;
        }

        // Additional checks for updateArtist
        // Condition 2: Occupation cannot be changed if born before 2000
        try {
            Date birthDate = new SimpleDateFormat("dd-MM-yyyy").parse(this.Birthdate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthDate);

            if (calendar.get(Calendar.YEAR) < 2000) {
                if (!this.Occupation.equals(newArtistData.Occupation)) {
                    return false;
                }
            }
        } catch (ParseException e) {
            return false;
        }

        // Condition 3: Old awards cannot be changed
        // Assuming awards are sorted in chronological order
        for (int i = 0; i < this.Awards.size(); i++) {
            String[] partsOld = this.Awards.get(i).split(", ");
            String[] partsNew = newArtistData.Awards.get(i).split(", ");

            int yearOld = Integer.parseInt(partsOld[0]);
            int yearNew = Integer.parseInt(partsNew[0]);

            if (yearOld < 2000) {
                // if the award is before 2000, it should remain unchanged
                if (yearOld != yearNew || !partsOld[1].equals(partsNew[1])) {
                    return false;
                }
            }
        }

        return true;
    }
	public void setID(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setBirthdate(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setOccupation(ArrayList arrayList) {
		// TODO Auto-generated method stub
		
	}
	public void setAwards(ArrayList arrayList) {
		// TODO Auto-generated method stub
		
	}
	public void setGenres(ArrayList arrayList) {
		// TODO Auto-generated method stub
		
	}


}
