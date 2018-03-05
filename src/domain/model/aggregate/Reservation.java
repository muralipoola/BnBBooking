package domain.model.aggregate;

import domain.model.common.Entity;
import domain.model.common.ReservationId;

import java.util.List;

public class Reservation extends Entity<ReservationId>{

    List<Room> loggingSpaces;
    public Reservation(ReservationId id) {
        super(id);
    }

}
