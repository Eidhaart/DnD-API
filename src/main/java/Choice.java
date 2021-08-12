import lombok.Data;

import java.util.List;

@Data
public class Choice {
    private int choose;
    private String type;
    private List<ApiReference> from;
}
