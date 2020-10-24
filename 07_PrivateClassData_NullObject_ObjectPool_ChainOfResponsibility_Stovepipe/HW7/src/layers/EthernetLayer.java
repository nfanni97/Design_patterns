package layers;

public class EthernetLayer extends AbstractLayer {

    @Override
    public String packMessage(String message, String encryptionKey) {
        return "Ethernet prefix|"+message;
    }

    @Override
    public String unpackMessage(String message, String encryptionKey) {
        String withoutPrefix = message.substring(16);
        return topNeighbor.unpackMessage(withoutPrefix, encryptionKey);
    }
    
}
