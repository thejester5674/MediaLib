
/**
 * Write a description of class MediaLib here.
 *
 * @author (Josh West)
 * @version (9/17/18)
 */
public class MediaLib
{
    {
    String t = song2.getTitle();
    MediaFile.writeString(song2.getTitle());
}
    public static void main ()
    {
        System.out.println("Welcome to your Media Library");
        System.out.println("");
        
        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");
        System.out.println("Song 1");
        System.out.print("Title: ");
        System.out.println(song1.getTitle());
        System.out.print("Rating: ");
        song1.setRating(8);
        System.out.println(song1.getRating());
        System.out.print("Price: $");
        song1.setPrice(2.50);
        System.out.println(song1.getPrice());
        System.out.println("");
        
        Song song2 = new Song("Johnny B. Badd", 10, 2.82);
        System.out.println("Song 2");
        System.out.print("Title: ");
        System.out.println(song2.getTitle());
        System.out.print("Rating: ");
        System.out.println(song2.getRating());
        System.out.print("Price: $");
        System.out.println(song2.getPrice());
        System.out.println("");
        
        Movie movie1 = new Movie();
        System.out.println("Movie 1");
        System.out.print("Title: ");
        movie1.setTitle("Shreknado");
        System.out.println(movie1.getTitle());
        System.out.print("Rating: ");
        movie1.setRating(10);
        System.out.println(movie1.getRating());
        System.out.print("Price: $");
        System.out.println(movie1.getPrice());
        System.out.println("");
        
        Movie movie2 = new Movie("The Lego Movie the Movie", 5, 100.23);
        System.out.println("Movie 2");
        System.out.print("Title: ");
        System.out.println(movie2.getTitle());
        System.out.print("Rating: ");
        System.out.println(movie2.getRating());
        System.out.print("Price: $");
        System.out.println(movie2.getPrice());
        System.out.println("");
        
        Movie movie3 = new Movie("Mortal Kombat: The Movie: The Videogame: The Movie", 20, 1000000.01);
        System.out.println("Movie 3");
        System.out.print("Title: ");
        System.out.println(movie3.getTitle());
        System.out.print("Rating: ");
        System.out.println(movie3.getRating());
        System.out.print("Price: $");
        System.out.println(movie3.getPrice());
        System.out.println("");
        
        Book book1 = new Book();
        System.out.println("Book 1");
        book1.setTitle("The Lord of the Rings ");
        System.out.println(book1.getTitle());
        System.out.print("Rating: ");
        book1.setRating(10);
        System.out.println(book1.getRating());
        book1.setPrice(12.40);
        System.out.print("Price: $");
        System.out.println(book1.getPrice());
        System.out.println("");
        
        Book book2 = new Book("To Kill a Mockingjay: The Epic Crossover of two Critically Acclaimed New York Times Bestsellers The Hunger Games and To Kill a Mockingbird", 8, 10.35);
        System.out.println("Book 2");
        System.out.print("Title: ");
        System.out.println(book2.getTitle());
        System.out.print("Rating: ");
        System.out.println(book2.getRating());
        System.out.print("Price: $");
        System.out.println(book2.getPrice());
        
    }
}