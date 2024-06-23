public class Ticket {
    private Movie movie;
    private int studioNumber;
    private double price;

    public Ticket(Movie movie, int studioNumber, double price) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public double getPrice() {
        return price;
    }
}
