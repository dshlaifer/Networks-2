/**
 * This class stores information about an event post in a social network.
 * An event post has a title, date, and location.
 */
public class EventPost extends Post
{
    private String title;
    private String date;
    private String location;

    /**
     * Constructor for objects of class EventPost.
     */
    public EventPost(String author, String title, String date, String location)
    {
        super(author);
        this.title = title;
        this.date = date;
        this.location = location;
    }

    /**
     * Display the details of this event post.
     */
    @Override
    public void display()
    {
        // display common post information
        super.display();

        // display event-specific information
        System.out.println("   Event: " + title);
        System.out.println("   Date: " + date);
        System.out.println("   Location: " + location);
    }

    /**
     * Print a short summary of this post.
     */
    public void printShortSummary()
    {
        System.out.println("Event post from " + getUserName());
    }
}
