class TV {
    int channel;
    int volume;
    boolean isOn;

    public TV() {
        channel = 1;
        volume = 1;
        isOn = true;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void channelUp() {
        if (channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (channel > 1) {
            channel--;
        }
    }

    public void volumeUp(){ 
        if(volume < 7){ 
            volume++;
        }
    }

    public void volumeDown(){
        if(volume > 1){ 
            volume--;
        }
    }

    public void setChannel(int newChannel) {
        if (newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume){ 
        if(newVolume >= 1 && newVolume <= 7){ 
            volume = newVolume;
        }
    }
}

public class TVPlayerMain {
    public static void main(String[] args){
        TV obj = new TV();
        obj.setChannel(100);
        obj.setVolume(10);
        System.out.println("Volume Level: " + obj.volume);
        System.out.println("Channel: " + obj.channel);
        obj.channelDown();
        obj.volumeUp();
        System.out.println("-------------");
        System.out.println("Volume Level: " + obj.volume);
        System.out.println("Channel: " + obj.channel);
    }
}
