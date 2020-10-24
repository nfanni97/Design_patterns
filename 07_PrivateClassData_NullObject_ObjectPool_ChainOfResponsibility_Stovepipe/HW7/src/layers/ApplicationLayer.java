package layers;

public class ApplicationLayer extends AbstractLayer {

    @Override
    public String packMessage(String message, String encryptionKey) {
        return bottomNeighbor.packMessage(message, encryptionKey);
    }

    @Override
    public String unpackMessage(String message, String encryptionKey) {
        return message;
    }
    
}
