class Smartphone{

    private Battery battery;
    private Display display;
    private Processor processor;
    private String brand;
    private String model;
    private boolean displayOn;
    private boolean poweredOn;

    public Smartphone(String brand, String model, Battery battery, Display display, Processor processor){
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.display = display;
        this.processor = processor;
        this.displayOn = false;
        this.poweredOn = false;
    }

    public Smartphone(String brand, String model, int batteryCapacity, double displaySize, String resolution, String processorModel, double processorSpeed){
        this.brand = brand;
        this.model = model;
        this.battery = new Battery(batteryCapacity);
        this.display = new Display(displaySize, resolution);
        this.processor = new Processor(processorModel, processorSpeed);
        this.displayOn = false;
        this.poweredOn = false;
    }

    public String powerOn(){
        if (battery.isCharged()) {
            displayOn = true;
            poweredOn = true;
            return "Powering on " + brand + " " + model;
        } else {
            return "Cannot power on: Battery depleted";
        }
    }

    public String powerOff() {
        displayOn = false;
        poweredOn = false;
        return "Powering off " + brand + " " + model;
    }

    public void chargeBattery(){
        battery.charge();
    } 
    
    public String runApp(String appName){
        if (displayOn) {
            String processMS = processor.processTask(appName);
            return appName + " running.";
        } else {
            return "Phone is off. Cannot run " + appName;
        }
    } 

    public void upgradeComponent(Battery newBattery) {
        this.battery = newBattery;
    }

    public void upgradeComponent(Display newDisplay) {
        this.display = newDisplay;
    } 

    public void upgradeComponent(Processor newProcessor) {
        this.processor = newProcessor;
    } 

    public String toString() {
        return this.brand + " " + this.model + " Smartphone\n" + 
               battery.toString() + "\n" + 
               display.toString() + "\n" + 
               processor.toString();
    } 
}