package modelforopsprac.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import modelforopsprac.domain.*;
import modelforopsprac.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
