package layers;

public abstract class AbstractLayer {
    protected AbstractLayer topNeighbor;
    protected AbstractLayer bottomNeighbor;

    public void setTop(AbstractLayer layer) {
        topNeighbor = layer;
    }

    public void setBottom(AbstractLayer layer) {
        bottomNeighbor = layer;
    }

    public abstract String packMessage(String message);
    public abstract String unpackMessage(String message);
}