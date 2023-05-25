public class Model extends MobilePhone {
    private String phoneModel;

    public Model(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public void makeCall(String phoneNumber) {
        if (isOn()) {
            System.out.println("Making a call " + phoneNumber + " using " + phoneModel);
        } else {
            System.out.println("Mobile phone is turned off. Cannot make a call to " + phoneNumber);
        }
    }
}
