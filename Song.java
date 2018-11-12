

/**
 * Write a description of class Song here.
 *
 * @author (Josh West)
 * @version (9/18/18)
 */
public class Song
{
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    public Song()
    {
       title = "";
       rating = 0;
       price = 0.0;
       favorite = false;
    }
    public String getTitle() {
        return title;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setPrice(double p) {
        price = p;
    }
    public double getPrice() {
        return price;
    }
    public Song(String title, int rating, double price){
        this.title = title;
        this.rating = rating;
        this.price = price;
    }
    public void addToFavorites() {
        favorite = true;
    }
}    
