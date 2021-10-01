package planes;

public enum PlaneType {

    BOEING747(10, 200),
    AIRBUSA300(4, 300),
    DASH7(200, 300);

    private int seatCapacity;
    private int totalWeight;

    PlaneType(int seatCapacity, int totalWeight) {
        this.seatCapacity = seatCapacity;
        this.totalWeight = totalWeight;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public int getWeight() {
        return totalWeight;
    }
}
