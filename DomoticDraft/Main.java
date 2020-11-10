public class Main{

    public static void main(String[] args) {
        
        //Inventory inventario = new Inventory();
        //inventario.createInventory();
        //inventario.getDevice(3);

        //DeviceSpecs spec1 = new DeviceSpecs(Brand.LG , "123", true, false);
        //DeviceSpecs spec1 = new DeviceSpecs(Brand.LG , "123", true, false);
        Device prueba = new Device(4, true, "AG", new DeviceSpecs(Brand.LG , "123", true, false));
        System.out.println(prueba.toString());
        //System.out.println(prueba.getdeviceSpecs());
        //System.out.println(prueba.deviceSpecs.toString());//:v
    }
}
