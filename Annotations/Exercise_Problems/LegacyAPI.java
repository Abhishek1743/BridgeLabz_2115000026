public class LegacyAPI {
    
    @Deprecated
    public void oldFeature(){
        System.out.println("This is the old feature. It is deprecated and should not be used.");
    }
    
    public void newFeature(){
        System.out.println("This is the new feature. Use this instead.");
    }
    
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        
        api.oldFeature(); // This should show a warning
        api.newFeature();
    }
}
