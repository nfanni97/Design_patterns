package library;

public class Demo {
    public static void main(String[] args) {
        BookDatabase[] databases = { new NewDB("newbookdata.csv"), new OldDBAdapter(new OldDB("oldbookdata.csv")) };
        String author = "Meg Cabot";
        String title = "Cursed";
        for(BookDatabase bdb: databases) {
            System.out.println("Search by author: "+bdb.searchByAuthor(author));
            System.out.println("Search by title: "+bdb.searchByTitle(title));
            System.out.println("----------------------");
        }

    }
}
