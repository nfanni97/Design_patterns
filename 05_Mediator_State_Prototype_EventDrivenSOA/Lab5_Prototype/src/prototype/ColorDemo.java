package prototype;

public class ColorDemo {
    public static void main(String[] args) {
        ColorPicker colorPicker = new ColorPicker();
        Color magenta = colorPicker.getNewColorTemplate("red");
        magenta.setB(255);
        colorPicker.addColor("magenta", magenta);
        colorPicker.printColors();
    }
}
