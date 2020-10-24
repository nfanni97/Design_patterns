package layers;

public class EthernetLayer extends AbstractLayer {

    @Override
    public String packMessage(String message) {
        return "Ethernet prefix|"+message;
    }

    @Override
    public String unpackMessage(String message) {
        String withoutPrefix = message.substring(16);
        return topNeighbor.unpackMessage(withoutPrefix);
    }
    
}
