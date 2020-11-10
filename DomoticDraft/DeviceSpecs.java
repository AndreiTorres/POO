public class DeviceSpecs{
    private Brand brand;
    private String model;
    private boolean wifiBuiltIn;
    private boolean bluetoothwifiBuiltIn; 

    public DeviceSpecs(){
        this.brand = null;
        this.model = null;
        this.wifiBuiltIn = false;
        this.bluetoothwifiBuiltIn = false;
    }

    public DeviceSpecs(Brand brand, String model, Boolean wifiBuiltIn, Boolean bluetoothwifiBuiltIn){
        this.brand = brand;
        this.model = model;
        this.wifiBuiltIn = wifiBuiltIn;
        this.bluetoothwifiBuiltIn = bluetoothwifiBuiltIn;
    }

    public void setBrand(Brand brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setWifiBuiltIn(Boolean wifiBuiltIn){
        this.wifiBuiltIn = wifiBuiltIn;
    }
    public void setBluetoothwifiBuiltIn(Boolean bluetoothwifiBuiltIn){
        this.bluetoothwifiBuiltIn = bluetoothwifiBuiltIn;
    }
    public Brand getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public boolean getWifiBuiltIn(){
        return wifiBuiltIn;
    }
    public boolean getBluetoothwifiBuiltIn(){
        return bluetoothwifiBuiltIn;
    }

    public String toString(){

        String salida = null;

        salida = "Brand: " + this.brand.getBrandName() + "\n"
                 + "Model: " + this.model + "\n" +
                 "Wofiiiii: " + this.wifiBuiltIn + "\n" +
                 "Bluetooth: " + this.bluetoothwifiBuiltIn + "\n";
                 
                 return salida;
    } 
}