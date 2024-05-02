public class SmartTV {
    boolean status = false;
    int channel = 1;
    int soundVolume = 18;

    public void turnOn(){
        status = true;
    }
    public void turnOff(){
        status = false;
    }
    public void upVolume(){
        soundVolume++;
    }
    public void downVolume(){
        soundVolume--;
    }
    public void increaseChannel(){
        channel++;
    }
    public void decreaseChannel(){
        channel--;
    }
    public void changeChannel(int newchannel){
        channel = newchannel;
    }
}