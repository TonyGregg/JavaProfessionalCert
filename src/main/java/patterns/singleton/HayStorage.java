package patterns.singleton;

/**
 * Created by genil on 6/13/18 at 09 27
 **/
public class HayStorage implements Cloneable{
    //Step # 1. Make the constructor private
    private HayStorage() {

    }

    // Step # 2. Declare private static volatile reference of the singleton class

    private static volatile HayStorage hayStorageInstance = null;

    // Step # 3. Create thread-safe getInstance method

    // The method should be public and static for other class to access

    public static HayStorage getInstance() {
        if(hayStorageInstance == null) {
            synchronized (HayStorage.class) {
                if (hayStorageInstance == null) {
                    hayStorageInstance = new HayStorage();

                }
            }
        }
        return hayStorageInstance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Do not clone");
    }

    public int getQuantity() {
        quantity--;
        return quantity;
    }

    private int quantity = 100;




}
