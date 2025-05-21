class Smartphone{

    private Battery battery;
    private Display display;
    private Processor processor;
    private String brand;
    private String model;

    public Smartphone(String brand, String model, Battery battery, Display display, Processor processor){
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.display = display;
        this.processor = processor;
    }

    public Smartphone(String brand, String model, int batteryCapacity, double displaySize, String resolution, String processorModel, double processorSpeed){
        
    }
}