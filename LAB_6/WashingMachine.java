// LAB_6 Q3 - switchOn, acceptClothes, acceptDetergent, switchOff
public class WashingMachine {
    boolean on = false;
    int noOfClothes = 0;
    boolean detergentAdded = false;

    void switchOn() { on = true; System.out.println("Switched ON."); }
    void switchOff() { on = false; System.out.println("Switched OFF."); }
    int acceptClothes(int noOfClothes) {
        this.noOfClothes = noOfClothes;
        System.out.println("Accepted " + noOfClothes + " clothes.");
        return this.noOfClothes;
    }
    void acceptDetergent() { detergentAdded = true; System.out.println("Detergent added."); }

    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        w.switchOn();
        w.acceptClothes(8);
        w.acceptDetergent();
        w.switchOff();
    }
}
