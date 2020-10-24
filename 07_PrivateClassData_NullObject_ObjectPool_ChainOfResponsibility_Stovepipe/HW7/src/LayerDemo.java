import layers.ApplicationLayer;
import layers.EncryptionLayer;
import layers.EthernetLayer;
import layers.TCPLayer;

public class LayerDemo {
    public static void main(String[] args) {
        // create layers
        ApplicationLayer app = new ApplicationLayer();
        EncryptionLayer encrypt = new EncryptionLayer();
        TCPLayer tcp = new TCPLayer();
        EthernetLayer ethernet = new EthernetLayer();

        // create links to form chains
        app.setBottom(encrypt);
        encrypt.setBottom(tcp);
        encrypt.setTop(app);
        tcp.setBottom(ethernet);
        tcp.setTop(encrypt);
        ethernet.setTop(tcp);

        // send message in application layer
        String message = "Hi there!";
        String key = "superKey";
        String packedMessage = app.packMessage(message, key);
        System.out.println("original message: " + message);
        System.out.println("packed message: " + packedMessage);

        // receive message in ethernet layer
        String unpackedMessage = ethernet.unpackMessage(packedMessage, key);
        System.out.println("unpacked message: " + unpackedMessage);
    }
}
