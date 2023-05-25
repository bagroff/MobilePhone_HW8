public abstract class MobilePhone implements Mobile {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Mobile phone is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Mobile phone is turned off.");
    }

    public boolean isOn() {
        return isOn;
    }
}
