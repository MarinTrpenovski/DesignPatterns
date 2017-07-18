package main.java.StructuralDesignPattern.AdapterPattern;

/**
 * Created by marin.trpenovski on 7/18/2017.
 */
public class CardReaderAdapter implements CardReader{

    ComputerReader laptopReader;

    public CardReaderAdapter (String deviceType) {

        if(deviceType.equals("pc")){
            laptopReader = new PcComputer();
        } else if (deviceType.equals("laptop")){
            laptopReader =  new LaptopComputer();
        }
    }

    @Override
    public void readCard(String device, String type) {

        if(device.equalsIgnoreCase("pc")){
            laptopReader.readPcCard(type);
        } else if(device.equalsIgnoreCase("laptop")){
            laptopReader.readLaptopCard(type);
        }
    }
}
