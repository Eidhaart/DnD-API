import lombok.Data;

import java.util.List;

@Data
public class StartingProficiencyOptions {
    public int choose;
    public String type;
    public List<From> from;
}
