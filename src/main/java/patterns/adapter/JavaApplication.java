package patterns.adapter;

public class JavaApplication {
    //the same logic as have to be in Database implementation
    public void saveObject(){
        System.out.println("Saving..");
    }
    public void updateObject(){
        System.out.println("Updating");
    }
    public void loadObject(){
        System.out.println("Loading");
    }
    public void deleteObject(){
        System.out.println("Deleting");
    }
}
