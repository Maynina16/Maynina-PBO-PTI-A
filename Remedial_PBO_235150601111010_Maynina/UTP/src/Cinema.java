import java.util.ArrayList;

public class Cinema {
    private String name;
    private ArrayList<User> listUsers;
    private ArrayList<Studio> listStudios;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
        this.listUsers = new ArrayList<>();
        this.listStudios = new ArrayList<>();
        init();
    } 

    public boolean registerUser(User user) {
        return listUsers.add(user);
    }

    public User authenticateUser(String email, String password) {
        for (User user : listUsers) {
            if (user.isMatch(email, password)) {
                return user;
            }
        }
        return null;
    }

    public void displayListStudios() {
        for (int i = 0; i < listStudios.size(); i++) {
            Studio studio = listStudios.get(i);
            System.out.println((i + 1) + ". " + studio.getType() + " - " + studio.getMovie().getTitle());
        }
    }
    
    public void displayStudioDetail(int studioNumber) {
        if (studioNumber > 0 && studioNumber <= listStudios.size()) {
            Studio studio = listStudios.get(studioNumber - 1);
            System.out.println(studio.getStudioInfo());
        } else {
            System.out.println("Studio not found.");
        }
    }

    public boolean addStudioWithMovie(String type, String title, double rating, String[] genres) {
        if (listStudios.size() < studioCapacity) {
            Movie movie = new Movie(title, rating, genres);
            Studio studio = new Studio(type, movie);
            listStudios.add(studio);
            return true;
        }
        return false;
    }

    public boolean bookTicket(User user, int studioNumber, int row, int col) {
        if (studioNumber > 0 && studioNumber <= listStudios.size()) {
            Studio studio = listStudios.get(studioNumber - 1);
            if (studio.reserve(row, col)) {
                Ticket ticket = new Ticket(studio.getMovie(), studioNumber, studio.getTicketPrice());
                return user.addTicket(ticket);
            }
        }
        return false;
    }

    private void init() {
        addStudioWithMovie("Imax", "Inception", 9.5, new String[]{"Action", "Thriller", "Science Fiction"});
        // Add more studios as needed
    }
}


