import layers.ApplicationLayer;
import layers.EncryptionLayer;
import layers.EthernetLayer;
import layers.TCPLayer;

public class LayerDemo {
    public static void main(String[] args) {
        // create layers
        ApplicationLayer app = new ApplicationLayer();
        String key = "super key";
        EncryptionLayer encrypt = new EncryptionLayer(key);
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
        String packedMessage = app.packMessage(message);
        System.out.println("original message: " + message);
        System.out.println("packed message: " + packedMessage);

        // receive message in ethernet layer
        String unpackedMessage = ethernet.unpackMessage(packedMessage);
        System.out.println("unpacked message: " + unpackedMessage);
    }
}
