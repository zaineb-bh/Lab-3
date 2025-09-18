import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public static void main(String[] args){
        AddressBook book = new AddressBook();

        BuddyInfo buddy1 = new BuddyInfo("buddy1");
        BuddyInfo buddy2 = new BuddyInfo("buddy2");

        book.addBuddy(buddy1);
        book.addBuddy(buddy2);
        book.removeBuddy(buddy2);

        System.out.println(book.buddies);
        System.out.println("AddressBook");
    }
}

