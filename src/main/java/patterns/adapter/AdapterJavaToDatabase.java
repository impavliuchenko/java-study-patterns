package patterns.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database{
    //Adapter connect logic in JavaApplication and Database implementation
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
