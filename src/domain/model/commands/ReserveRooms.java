package domain.model.commands;

import domain.model.aggregate.Room;
import domain.model.common.IDomainCommand;

import java.util.List;

public class ReserveRooms implements IDomainCommand {
    List<Room> rooms;

    public ReserveRooms(List<Room> roomList) {
        this.rooms = roomList;
    }
}
