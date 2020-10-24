package layers;

public class TCPLayer extends AbstractLayer {

    @Override
    public String packMessage(String message) {
        return bottomNeighbor.packMessage("TCP prefix|"+message);
    }

    @Override
    public String unpackMessage(String message) {
        String withoutPrefix = message.substring(11);
        return topNeighbor.unpackMessage(withoutPrefix);
    }
    
}
