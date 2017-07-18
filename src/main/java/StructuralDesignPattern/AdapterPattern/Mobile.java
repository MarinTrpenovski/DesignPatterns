package main.java.StructuralDesignPattern.AdapterPattern;

/**
 * Created by marin.trpenovski on 7/18/2017.
 */
public class Mobile implements CardReader{

    CardReader cardReader;

    @Override
    public void readCard(String device, String type) {

        if(device.equalsIgnoreCase("mobile")){
            System.out.println("This is mobile card reader ");
        } else if (device.equalsIgnoreCase("laptop") || device.equalsIgnoreCase("pc")) {
            cardReader = new CardReaderAdapter(device);
            cardReader.readCard(device, type);
        } else {
            System.out.println("Invalid device ");
        }
    }
}
