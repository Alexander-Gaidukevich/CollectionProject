package carpack;

public class Car {
    private String name;
    private String collor;
    private int cost;

    public Car(String name, String collor, int cost) {
        this.name = name;
        this.collor = collor;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (cost != car.cost) return false;
        if (!name.equals(car.name)) return false;
        return collor.equals(car.collor);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + collor.hashCode();
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", collor='" + collor + '\'' +
                ", cost=" + cost +
                '}';
    }
}
