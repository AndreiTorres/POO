/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar.cambranes
 */
public class House {
    private final int MAXLEVELS = 5;
    private int levelCounter;
    private Level levels[];
    private String name;
    
    
    public House (Level[] levels, String name){
        this.levels = levels;
        this.name = name;
        this.levelCounter = getLevelCounter(levels);
    }
    
    public House ( String name){
        this.levels = new Level[MAXLEVELS];
        this.name = name;
        this.levelCounter = 0;
        
    }
    
    
    public int getLevelCounter(Level[] levels){
        int levelCounter = 0;
        for(int i = 0;i < levels.length; i++){
            if(levels[i] != null){
                levelCounter++;
            }
            else{
                break;
            }
        }
        return levelCounter;
    
    }
    
    public int searchLevel(String name){
            int index = 0;
            boolean  flag = false;
            for(index=0; index<levelCounter && flag == false; index++){
                if(levels[index].equals(new Level(name))){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                index = -1;
            }
            return index;
        }
    
public int countDevicesOn(){
    int devicesOn=0;
    for(int i=0;i<levelCounter; i++){
        Room rooms[] = levels[i].getRooms();
        int counterRooms= levels[i].getCounterRooms(rooms);
        for(int j=0;j<counterRooms; j++){
            Device devices[] = rooms[j].getDevices();
            int counterDevices = rooms[j].getDeviceCounter();
            for(int k=0;k<counterDevices; k++){
                if(devices[k].isStatus() == true){
                devicesOn++;
                }
            }
        }
    }
    return devicesOn;
}

public int countSpecificDevice(String name){
    int counter=0;
    for(int i=0;i<levelCounter; i++){
        Room rooms[] = levels[i].getRooms();
        int counterRooms= levels[i].getCounterRooms(rooms);
        for(int j=0;j<counterRooms; j++){
            Device devices[] = rooms[j].getDevices();
            int counterDevices = rooms[j].getDeviceCounter();
            for(int k=0;k<counterDevices; k++){
                if(devices[k].getName().equals(name)){
                counter++;
                }
            }
        }
    }
    return counter;
}

public boolean toogleSpecificDeviceLevel(String level,String device){
    boolean flag = false;
    for(int i=0;i<levelCounter; i++){
        if(levels[i].getName().equals(level)){
        Room rooms[] = levels[i].getRooms();
        int counterRooms= levels[i].getCounterRooms(rooms);
        for(int j=0;j<counterRooms; j++){
            Device devices[] = rooms[j].getDevices();
            int counterDevices = rooms[j].getDeviceCounter();
            for(int k=0;k<counterDevices; k++){
                if(devices[k].getName().equals(name)){
                devices[k].toggleDevice();
                flag = true;
                }
            }
          }
        }
    }
    return flag;
}


    
}

