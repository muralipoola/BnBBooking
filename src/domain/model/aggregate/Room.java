package domain.model.aggregate;

import domain.model.common.Entity;
import domain.model.common.RoomId;

public class Room extends Entity<RoomId> {
    public Room(RoomId id) {
        super(id);
    }
}
