public abstract class Skill {
    // VARIABLES
    String name;
    String type;
    int skillLevel;

    // ABSTRACT METHODS
    public abstract void identifySkill();

    // CONSTRUCTOR
    public Skill(String name, String type, int skillLevel) {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }
    // GETTER METHODS
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getSkillLevel() {
        return skillLevel;
    }
}
