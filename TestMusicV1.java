/**
 * Purpose: The purpose of this program is to search for various elements in the Music Array (of 10 music
 * objects). We use various methods to find values for the title, year, and artist.
 *
 * @author Trisha Ganesh
 * @version 6/27/2021
 *
 */

public class TestMusicV1 {

    public static void main(String[] args) {

        //music array
        Music[] music = new Music[10];

        music[0] = new Music("Butter", 2021, "BTS");
        music[1] = new Music("Good 4 U", 2021, "Olivia Rodrigo");
        music[2] = new Music("Save Your Tears", 2021, "The Weekend & Ariana Grande");
        music[3] = new Music("Astronaut In The Ocean ", 2019, "Masked Wolf");
        music[4] = new Music("Counting Stars", 2013, "One Republic");
        music[5] = new Music("Happier", 2018, "Marshmello & Bastille");
        music[6] = new Music("Believer", 2017, "Imagine Dragons");
        music[7] = new Music("I Wanna Hold Your Hand", 1964, "The Beatles");
        music[8] = new Music("Moonlight Sonata", 1801, "Beethoven");
        music[9] = new Music("Für Elise", 1867, "Beethoven");

        printMusic(music);

        System.out.println("\n\nSearching for Happier: ");
        System.out.println("---------------------------");
        searchForTitle(music, "Happier");

        System.out.println("\n\nSearching for Come As You Are: ");
        System.out.println("-----------------------------------");
        searchForTitle(music, "Come As You Are");

        System.out.println("\n\nSearching for songs in 2021: ");
        System.out.println("-----------------------------------");
        searchForYear(music, 2021);

        System.out.println("\n\nSearching for songs in 2000: ");
        System.out.println("-----------------------------------");
        searchForYear(music, 2000);

        System.out.println("\n\nSearching for Beethoven: ");
        System.out.println("-----------------------------");
        searchForArtist(music, "Beethoven");

        System.out.println("\n\nSearching for Beatles: ");
        System.out.println("---------------------------");
        searchForArtist(music, "The Beatles");

        System.out.println("\n\nSearching for Metallica: ");
        System.out.println("-----------------------------");
        searchForArtist(music, "Metallica");

    }

    //method for searching for song title
    public static void searchForTitle(Music[] element, String toFind)
    {
        int found = -1;

        for(int index = 0; index < element.length; index++)
        {
            if(element[index].getTitle().compareTo(toFind) == 0)
            {
                found = index;
                break;   //terminates the for loop
            }
        }

        if(found != -1)
        {  // we have found the person
            System.out.println("We found " + toFind + " in the playlist: ");
            System.out.println(element[found]);
        }
        else
            System.out.println(toFind + " is not in the playlist");
    }

    //method for searching for song year
    public static void searchForYear(Music[] element, int toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int index = 0; index < element.length; index++)
        {
            if(element[index].getYear() == toFind)
            {
                System.out.println(element[index]);
                found++;
            }

        }
        if(found == 0)
        {   // we have not found the location
            System.out.println("Songs from the year " + toFind + " were not found in the playlist");
        }
    }

    //method for searching for musical artist
    public static void searchForArtist(Music[] element, String toFind)
    {
        int found = 0;
        int posMax = 0;

        System.out.println("Find results: ");

        for(int index = 0; index < element.length; index++)
        {
            if (element[index].getArtist().compareTo(toFind) == 0)
            {
                System.out.println(element[index]);
                found++;
            }

        }
        if(found == 0)
        {   // location not found
            System.out.println(toFind + " is not in the playlist");
        }
    }

    //print results
    public static void printMusic(Music[] element)
    {
        System.out.println("                   Music PlayList                      ");
        System.out.println();
        System.out.println("Title                          Year   Artist           ");
        System.out.println("-------------------------------------------------------");
        for (Music music : element)
            System.out.printf("%-30s %4d   %-20s \n", music.getTitle(), music.getYear(), music.getArtist());
    }
}
