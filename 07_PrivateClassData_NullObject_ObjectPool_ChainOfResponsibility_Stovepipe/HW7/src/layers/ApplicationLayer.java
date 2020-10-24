package layers;

public class ApplicationLayer extends AbstractLayer {

    @Override
    public String packMessage(String message) {
        return bottomNeighbor.packMessage(message);
    }

    @Override
    public String unpackMessage(String message) {
        return message;
    }
    
}
