package project.hashtree;

public class BookDetails {
    String bookName;
    String authorName;
    int sno;

    BookDetails(String bookName, String authorName, int sno) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.sno = sno;
    }

    @Override
    public int hashCode() {
        return sno;
    }
}
