package modelforopsprac.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import modelforopsprac.domain.*;
import modelforopsprac.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;

    public StockDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
