public class Book
{
    private String title;
    private String author;
    private int numPages;
    
    public Book(String theTitle, String theAuthor, int numberOfPages)
    {
        title = theTitle;
        author = theAuthor;
        numPages = numberOfPages;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public int getNumPages()
    {
        return numPages;
    }
    
    public String toString()
    {
        return title + " by " + author;
    }
    
    public boolean equals(Book other)
    {
        return title.equals(other.title) && author.equals(other.author);
    }
}