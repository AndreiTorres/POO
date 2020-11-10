public class Device {
    private int Id;
    private boolean Status;
    private String Name;
    private DeviceSpecs deviceSpecs;
    
    public Device() {
        this.Id = 0;
        this.Status = false;
        this.Name = null;
        
    }

    public Device(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs) {
        this.Id = Id;
        this.Status = Status;
        this.Name = Name;
        this.deviceSpecs = deviceSpecs;
    }
    public DeviceSpecs getdeviceSpecs(){
        return deviceSpecs;
    }

    public void setdeviceSpecs(DeviceSpecs deviceSpecs){
        this.deviceSpecs = deviceSpecs;
    }


    public int getId() {
        return Id;
    }

    public boolean getStatus(){
        return Status;
    }

    public String getName(){
        return Name;
    }
    
    public void setId(int id){
        this.Id = id;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    

    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                //"Device specs: \n" + this.deviceSpecs.toString();
                //"Brand: " + deviceSpecs.getBrand() + "\n"+
                //"Model: " + deviceSpecs.getModel() + "\n"+
                //"Wifi: " + deviceSpecs.getWifiBuiltIn() + "\n"+
                //"Bluetooth: " + deviceSpecs.getBluetoothwifiBuiltIn() + "\n";
                "Braaaaand: " + this.deviceSpecs.getBrand() + "\n"+
                "Brand: " + deviceSpecs.getBrand() + "\n"+
                "Model: " + this.deviceSpecs.getModel() + "\n"+
                "Wifi: " + this.deviceSpecs.getWifiBuiltIn() + "\n"+
                "Bluetooth: " + this.deviceSpecs.getBluetoothwifiBuiltIn() + "\n";

               
        return output;
    }
  
}    