package food.delivery.domain;

import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Delivered extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String address;
}
