package domain.model.common;

public class ReservationId  extends AbstractIdentity<String> {
    protected ReservationId(String id) {
        super(id);
    }

    protected ReservationId(AbstractIdentity<String> id) {
        super(id);
    }
}
