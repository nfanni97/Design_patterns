package layers;

public class EncryptionLayer extends AbstractLayer {
    private String encryptionKey;

    public EncryptionLayer(String k) {
        encryptionKey = k;
    }

    private String doEncryption(String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append((char) (message.charAt(i) ^ encryptionKey.charAt(i % encryptionKey.length())));
        }
        String packedMessage = sb.toString();
        return packedMessage;
    }

    @Override
    public String packMessage(String message) {
        return bottomNeighbor.packMessage(doEncryption(message));
    }

    @Override
    public String unpackMessage(String message) {
        return topNeighbor.unpackMessage(doEncryption(message));
    }

}
