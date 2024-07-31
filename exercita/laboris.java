public class Pager {
    // Example method that generates HTML based on page number
    public String html(int pageNumber) {
        // Logic to generate HTML content based on page number
        return "<div>Page " + pageNumber + "</div>";
    }

    public static void main(String[] args) {
        Pager pager8 = new Pager();
        System.out.println(pager8.html(8));
    }
}
