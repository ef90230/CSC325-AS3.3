public class GiftSkill extends Skill {
    public GiftSkill(String name, int skillLevel) {
        // Calls superclass constructor and automatically passes in the correct skill type without specification in main
        super(name, "Gift", skillLevel);
    }
    public void identifySkill() {
        // Calls each of the parent class's getter methods and prints the object's name, type, and level
        System.out.println(super.getType() + " Skill of " + super.getName() + " has a level of " + super.getSkillLevel());

    }
}
