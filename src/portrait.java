public class portrait {
    private double price;
    private int year;
    private String artist;

    public portrait(double price, int year, String artist) {
        this.price = price;
        this.year = year;
        this.artist = artist;
    }

    public portrait() {
        price=860000000.00;
        year=1503;
        artist="Leonardo da Vinci";
    }

    public String getPrice() {
        return "The price is $" + price;
    }

    public String getYear() {
        return "The year the portrait was created was " + year;
    }

    public String getArtist() {
        return "The artist is " + artist;
    }

    public void setPrice(double new_price) {
        price = new_price;
    }

    public void setYear(int new_year) {
        year = new_year;
    }

    public void setArtist(String new_artist) {
        artist = new_artist;
    }

    public int calculate_area(int length, int width) {
        return length * width;
    }

    public int calculate_volume(int length, int width, int height) {
        return length * width * height;
    }

    public String description() {
        return("The portrait is a fine peace of work created by " + artist + " in the year " + year + ". It is an extremely valuable piece, costing precisely $" + price + ".");
    }
}
