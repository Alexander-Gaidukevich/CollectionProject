
public class Pen {
    private String producer;
    private String collor;
    private String collorPen;
    private double width;

    public Pen(String producer, String collor, String collorPen, double width) {
        this.producer = producer;
        this.collor = collor;
        this.collorPen = collorPen;
        this.width = width;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public String getCollorPen() {
        return collorPen;
    }

    public void setCollorPen(String collorPen) {
        this.collorPen = collorPen;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.width, width) != 0) return false;
        if (!producer.equals(pen.producer)) return false;
        if (!collor.equals(pen.collor)) return false;
        return collorPen.equals(pen.collorPen);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producer.hashCode();
        result = 31 * result + collor.hashCode();
        result = 31 * result + collorPen.hashCode();
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "producer='" + producer + '\'' +
                ", collor='" + collor + '\'' +
                ", collorPen='" + collorPen + '\'' +
                ", width=" + width +
                '}';
    }
}
