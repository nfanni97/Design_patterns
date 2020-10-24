package layers;

public class EncryptionLayer extends AbstractLayer {

    private String doEncryption(String message, String encryptionKey) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append((char) (message.charAt(i) ^ encryptionKey.charAt(i % encryptionKey.length())));
        }
        String packedMessage = sb.toString();
        return packedMessage;
    }

    @Override
    public String packMessage(String message, String encryptionKey) {
        return bottomNeighbor.packMessage(doEncryption(message, encryptionKey), encryptionKey);
    }

    @Override
    public String unpackMessage(String message, String encryptionKey) {
        return topNeighbor.unpackMessage(doEncryption(message, encryptionKey), encryptionKey);
    }

}
