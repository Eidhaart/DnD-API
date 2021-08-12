import lombok.Data;

import java.util.List;

@Data
public class MultiClassing {
    public List<Prerequisite> prerequisites;
    public List<Proficiencies> proficiencies;
}
