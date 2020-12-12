package 容器;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String type;

    private String msg;
}
