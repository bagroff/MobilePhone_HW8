public class Main {
    public static void main(String[] args) {
        Model model = new Model("Nokia 3310");

        model.turnOn();
        model.makeCall("16507810428");
        System.out.println();
        model.turnOff();
        model.makeCall("16507810428");
    }
}