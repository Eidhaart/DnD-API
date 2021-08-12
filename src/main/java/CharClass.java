import lombok.Data;

import java.util.List;

@Data
public class CharClass {
    public String index;
    public String name;
    public int hit_die;
    public List<ProficiencyChoice> proficiency_choices;
    public List<Proficiencies> proficiencies;
    public List<SavingThrow> saving_throws;
    public List<StartingEquipment> starting_equipment;
    public List<StartingEquipmentOption> starting_equipment_options;
    public String class_levels;
    public MultiClassing multi_classing;
    public List<Subclass> subclasses;
    public Spellcasting spellcasting;
    public String spells;
    public String url;
}
