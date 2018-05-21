package Creational;
import java.util.HashMap;


/**
 *
 * @author Binod
 */
public class Multiton {
    private static HashMap<String,Multiton> instances=new HashMap<String,Multiton>();
    private static Object lock=new Object();
    private Multiton(){
        
    }
    public static Multiton getMultiton(String key){
        if (!instances.containsKey(key)){
            synchronized(lock){
                if(!instances.containsKey(key) && instances.size()<=100){
                    instances.put(key, new Multiton());
                }
            }
        }
        return instances.get(key);
    }
}
