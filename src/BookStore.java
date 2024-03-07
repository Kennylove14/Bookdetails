import java.time.LocalDate;

enum BookDetails {
    BOOK1("1", "Book 1", "Author 1", 200, "Genre 1", 4.5, 2020, "Publisher 1", 20.0),
    BOOK2("2", "Book 2", "Author 2", 300, "Genre 2", 4.2, 2018, "Publisher 2", 25.0),
    BOOK3("3", "Book 3", "Author 3", 250, "Genre 3", 4.0, 2015, "Publisher 3", 18.0),
    BOOK4("4", "Book 4", "Author 4", 180, "Genre 4", 4.8, 2021, "Publisher 4", 22.0),
    BOOK5("5", "Book 5", "Author 5", 400, "Genre 5", 4.1, 2019, "Publisher 5", 30.0);

    private final String bookID;
    private final String bookName;
    private final String bookAuthor;
    private final int bookPages;
    private final String bookGenre;
    private final double bookRating;
    private final int bookPublishedYear;
    private final String bookPublisher;
    private final double bookPrice;
    private final double bookRent = 5.0; 

    BookDetails(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre,
                double bookRating, int bookPublishedYear, String bookPublisher, double bookPrice) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookGenre = bookGenre;
        this.bookRating = bookRating;
        this.bookPublishedYear = bookPublishedYear;
        this.bookPublisher = bookPublisher;
        this.bookPrice = bookPrice;
    }

    public String getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPages() {
        return bookPages;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public double getBookRating() {
        return bookRating;
    }

    public int getBookPublishedYear() {
        return bookPublishedYear;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public double getBookRent() {
        return bookRent;
    }
}

public class BookStore {

    private String orderedBook;
    private LocalDate orderDate;
    private String orderID;
    private double transactionAmount;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String userID;
    private String orderType;

    public BookStore(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.userID = generateUserID(firstName, lastName);
    }

    private String generateUserID(String firstName, String lastName) {
        String combinedName = (firstName + lastName).toUpperCase();
        return "TANLUS" + combinedName.substring(0, Math.min(combinedName.length(), 5));
    }

    public BookDetails searchBook(String bookID) {
        for (BookDetails book : BookDetails.values()) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null;
    }

    public void orderBook(int choice) {}
    public void orderConfirmation() {
        System.out.println("Dear, " + firstName + " " + lastName + ",");
        System.out.println("Thank you for ordering " + orderedBook + " from Turn-A-New-Leaf. Following are your order details:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("User ID: " + userID);
        System.out.println("User contact: " + emailAddress);
        System.out.println("Transaction type: " + orderType);
        System.out.println("Transaction amount: " + transactionAmount);
    }

    public String getOrderedBook() {
        return orderedBook;
    }

    public void setOrderedBook(String orderedBook) {
        this.orderedBook = orderedBook;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}



