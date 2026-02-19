 /**
 * Abstract base class for all library items.
 */
abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (encapsulated)
    private String borrowerName;
    private boolean available = true;

    public LibraryItem(int itemId, String title, String author) {
        setItemId(itemId);
        setTitle(title);
        setAuthor(author);
    }

    // -------- Encapsulation with validation --------

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        if (itemId <= 0)
            throw new IllegalArgumentException("Invalid item ID");
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty())
            throw new IllegalArgumentException("Invalid title");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty())
            throw new IllegalArgumentException("Invalid author");
        this.author = author;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    protected void setAvailable(boolean available) {
        this.available = available;
    }

    protected boolean isAvailable() {
        return available;
    }

    // -------- Abstract behaviour --------
    public abstract int getLoanDuration();

    // -------- Concrete behaviour --------
    public void getItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Status  : " + (available ? "Available" : "Reserved"));
    }
}