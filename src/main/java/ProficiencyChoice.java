import lombok.Data;

import java.util.List;

@Data
public class ProficiencyChoice {
    public int choose;
    public String type;
    public List<From> from;
}
