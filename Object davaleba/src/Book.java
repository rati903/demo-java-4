public class Book {
    private String title;
    private int pageCount;
    private String genre;
    private Author author;

    public Book(String title, int pageCount, String genre, Author author) {
        this.title = title;
        this.pageCount = pageCount;
        this.genre = genre;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return pageCount == book.pageCount && title.equals(book.title) && genre.equals(book.genre) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + pageCount + genre.hashCode() + author.hashCode();
    }

    @Override
    public String toString() {
        return "Book{\n"
                + "\ttitle= " + title + ",\n"
                + "\t pageCount= " + pageCount + ",\n"
                + "\t genre= " + genre + ",\n"
                + "\t author= " + author  + ",\n"
                +  "}";
    }
}
