package modelforopsprac.domain;

import java.util.*;
import lombok.*;
import modelforopsprac.domain.*;
import modelforopsprac.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}
