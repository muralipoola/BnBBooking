package domain.model.aggregate;

import domain.model.commands.ReserveRooms;
import domain.model.common.Entity;
import domain.model.common.GuestId;

import java.util.List;

public class Guest extends Entity<GuestId> {

    String name;

    public Guest(GuestId id) {
        super(id);
    }

    public void reserveRooms(List<Room> roomList){
        new ReserveRooms(roomList);
    }
}
