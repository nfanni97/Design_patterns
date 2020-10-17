package proxytest;

import javafx.scene.image.Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyImage {
    File fname;
    Image img = null;
    MyImage(File fname2) {
        fname = fname2;
    }
    public Image get() {
        if (img == null) {
            try {
                img=new Image(new FileInputStream(fname));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return img;
    }
}
