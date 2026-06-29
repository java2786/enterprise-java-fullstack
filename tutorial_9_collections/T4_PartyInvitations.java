
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Guest{
    String name;
}

class Invitation{
    private List<Guest> guests = new ArrayList<>();
    private List<String> guestList = new ArrayList<>();

    // add new guest
    public void addGuest(String guest){
        if(guest.trim().length()>0){
            guestList.add(guest.trim().toLowerCase());
        }
    }
    // search guest
    public boolean searchByName(String name){
        // for(String guest: guestList){
        //     if(guest.equals(name)){
        //         return name;
        //     }     
        // }
        // return null;
        int index = guestList.indexOf(name.toLowerCase());
        return index<0?false:true;
    }
    // sort guest list
    public void sortGuestList(){
        Collections.sort(guestList);
    }
    // delete by name
    public void deleteByName(String name){ // Ramesh
        if(name.trim().length()>0){
            guestList.remove(name.trim().toLowerCase());
        }
    }

    public String showGuests(){
        StringBuilder sb = new StringBuilder("");
        for(String guest: guestList){
            sb.append(guest);
            sb.append(",");            
        }
        return "["+sb.toString()+"]";
    }
}

public class T4_PartyInvitations {
    public static void main(String[] args) {
        Invitation invitation = new Invitation();

        invitation.addGuest("Ramesh");
        invitation.addGuest("Suresh");
        invitation.addGuest("Dinesh");
        invitation.addGuest("");
        invitation.addGuest("     ");
        invitation.addGuest("Mahesh");

        System.out.println(invitation.showGuests());
        System.out.println(invitation.searchByName("ramesh"));
        invitation.sortGuestList();
        invitation.deleteByName(" dinesh  ");
        System.out.println(invitation.showGuests());
    }
}
