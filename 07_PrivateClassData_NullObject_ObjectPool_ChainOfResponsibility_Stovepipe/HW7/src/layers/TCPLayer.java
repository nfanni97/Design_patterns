package layers;

public class TCPLayer extends AbstractLayer {

    @Override
    public String packMessage(String message, String encryptionKey) {
        return bottomNeighbor.packMessage("TCP prefix|"+message, encryptionKey);
    }

    @Override
    public String unpackMessage(String message, String encryptionKey) {
        String withoutPrefix = message.substring(11);
        return topNeighbor.unpackMessage(withoutPrefix, encryptionKey);
    }
    
}
