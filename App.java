public class App {
    // The main file to be run
    public static void main(String[] args) throws Exception {
        // Creates each of the four skill types and passes in their properties
        HardSkill skill1 = new HardSkill("Programming", 8);
        SoftSkill skill2 = new SoftSkill("Communication", 9);
        GiftSkill skill3 = new GiftSkill("Mercy", 7);
        TalentSkill skill4 = new TalentSkill("Organization", 10);

        // Prints the info for each skill object
        skill1.identifySkill();
        skill2.identifySkill();
        skill3.identifySkill();
        skill4.identifySkill();
    }
}
