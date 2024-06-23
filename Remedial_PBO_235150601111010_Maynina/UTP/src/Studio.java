import java.util.Arrays;

public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type, Movie movie) {
        this.type = type;
        this.movie = movie;
        setSeats(type);
    }

    public String getType() {
        return type;
    }
    public Movie getMovie() {
        return movie;
    }

    public boolean reserve(int row, int col) {
        if (row < seats.length && col < seats[0].length && !seats[row][col]) {
            seats[row][col] = true;
            return true;
        }
        return false;
    }

    public int isBooked(int row, int col) {
        if (row >= seats.length || col >= seats[0].length) {
            return -1;
        }
        return seats[row][col] ? 1:0;
    }

    public String getStudioInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Movie: ").append(movie.getTitle()).append("\n");
        info.append("Type: ").append(type).append("\n");
        info.append("Rating: ").append(movie.getRating()).append("\n");
        info.append("Price: ").append(getTicketPrice()).append("\n");
        info.append("Seats: \n");
        for (boolean[] row : seats) {
            for (boolean seat : row) {
                info.append(seat ? "X " : "O ");
            }
            info.append("\n");
        }
        return info.toString();
    }

    public double getTicketPrice() {
        switch (type) {
            case "Imax":
                return 100000;
            case "Premiere":
                return 120000;
            case "Reguler":
                return 50000;
            default:
                return 0;
        }
    }

    private void setSeats(String type) {
        switch (type) {
            case "Imax":
                seats = new boolean[8][9];
                break;
            case "Premiere":
                seats = new boolean[6][4];
                break;
            case "Reguler":
                seats = new boolean[5][5];
                break;
        }
        for (boolean[] row : seats) {
            Arrays.fill(row, false);
        }
    }
}
 
