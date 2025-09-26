import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    public void removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()) {
            myBuddies.remove(index);
        }

    }
    public ArrayList<BuddyInfo> getBuddies(){
        return myBuddies;
    }


    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        ArrayList<BuddyInfo> buddiesList = addressBook.getBuddies();

        System.out.println(addressBook.myBuddies);
        System.out.println("AddressBook");
        System.out.println(buddiesList);
        //a change
        //another change, made in GitHub website
        //a change made in the new branch

    }
}

