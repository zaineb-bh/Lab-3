public class BuddyInfo {
    private final String name;
    private final String address;
    private final String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // comment: public BuddyInfo(){

      //  this("unknown","unknown","unknown");
    //}

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static void main(String[] args) {
        BuddyInfo newBuddy =  new BuddyInfo("Homer", "Carleton", "613");
        System.out.println("Hello "+ newBuddy.getName());
        System.out.println("Address: "+ newBuddy.getAddress());
        System.out.println("Phone Number: "+ newBuddy.getPhoneNumber());
    }
}

