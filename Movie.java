
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    private int rating;
    private String title;
    private double price;
    public Movie()
    {
        title = "";
        rating = 0;
        price = 0.0;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int r){
        rating = r;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p) {
        price = p;
    }
    public Movie(String title, int rating, double price){
        this.title = title;
        this.rating = rating;
        this.price = price;
    }
}