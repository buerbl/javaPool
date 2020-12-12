package pdf;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private String pass;
    private Clothes clothes;
}
