import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CharRaces {

    public String index;
    public String name;
    public int speed;
    public List<AbilityBonus> ability_bonuses;
    public String alignment;
    public String age;
    public String size;
    public String size_description;
    public List<StartingProficiency> starting_proficiencies;
    public StartingProficiencyOptions starting_proficiency_options;
    public List<Language> languages;
    public String language_desc;
    public Choice language_options;
    public List<Trait> traits;
    public List<Subrace> subraces;
    public String url;
    public String error;

}
