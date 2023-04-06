package food.delivery.domain;

import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class CookFinished extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private List<String> options;
    private String storeId;
}
