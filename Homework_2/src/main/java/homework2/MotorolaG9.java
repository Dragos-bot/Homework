package homework2;

public class MotorolaG9 extends Motorola{

    private static final int noOfSpeakers = 2;

    public MotorolaG9(String name, String color) {
        super(name, color);
    }

    public static int getNoOfCameras() {
        return noOfSpeakers;
    }


}
