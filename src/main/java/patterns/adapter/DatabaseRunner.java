package patterns.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        //Adapter in work
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
