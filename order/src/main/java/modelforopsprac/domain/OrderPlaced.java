package modelforopsprac.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import modelforopsprac.domain.*;
import modelforopsprac.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
