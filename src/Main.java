public class Main {
    public static void main(String[] args) {
     Movie movie =new Movie("Toy story",15.99,"Disney");
        System.out.println("movie before discount "+movie.getPrice()+" after discount "+movie.getDiscount());

     Book book=new Book("It ends with us",20.99,"Colleen Hoover");
        System.out.println("book before discount "+book.getPrice()+" after discount "+book.getDiscount());
    }
}