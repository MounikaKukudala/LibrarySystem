package items;

public class CD extends LibraryItem {
    private double Length;
    private double StorageCapacity;

    public CD(String title, String identifier, int price, double length, double storageCapacity) {
        super(title, identifier, price);
        Length = length;
        StorageCapacity = storageCapacity;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getStorageCapacity() {
        return StorageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        StorageCapacity = storageCapacity;
    }

    @Override
    public int calculateLateFee(int days) {
        return 20*days;
    }
}
