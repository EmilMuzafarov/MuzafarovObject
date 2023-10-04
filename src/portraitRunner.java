public class portraitRunner {
    public static void main(String[] args) {
        /*Initial portrait*/
        portrait port1 = new portrait();
        System.out.println(port1.getPrice());
        System.out.println(port1.getYear());
        System.out.println(port1.getArtist());
        /*New portrait*/
        portrait port = new portrait(157006000.80, 1895, "Frederick Leighton");
        /*Calling getter methods*/
        System.out.println(port.getPrice());
        System.out.println(port.getYear());
        System.out.println(port.getArtist());
        /*Calling setter methods*/
        port.setPrice(597453247.998);
        port.setYear(2046);
        port.setArtist("Emil Muzafarov");
        /*Calling additional methods*/
        System.out.println(port.calculate_area(65, 40));
        System.out.println(port.calculate_volume(65, 40, 20));
        System.out.println(port.description());

    }
}
