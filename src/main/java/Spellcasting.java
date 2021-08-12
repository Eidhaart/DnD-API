import lombok.Data;

import java.util.List;

@Data
public class Spellcasting {
    public int level;
    public SpellcastingAbility spellcasting_ability;
    public List<Info> info;
}
