public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("It is TV on?"+ smartTV.status);
        System.out.println("Channel: "+ smartTV.channel);
        System.out.println("Sound: "+ smartTV.soundVolume);
    }
}
