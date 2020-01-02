import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* Serialization Code*/
class EngineObject implements Serializable{
    public EngineObject(){
        
    }
    /**
	 *
	 */
    private static final long serialVersionUID = 1L;
    /** If you don't want to store a variables inside file declare transient variable */
	//transient int a=1;
    //transient int b=3;
    int a=1;
    int b=2;
    static int st=4;
}
class Serilization1{
    public static void main(String []args) throws IOException ,ClassNotFoundException {
        EngineObject eno=new EngineObject();
        File f=new File("engineObject.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream objs=new ObjectOutputStream(fos);
        objs.writeObject(eno);
        objs.close();
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream Obin=new ObjectInputStream(fis);
        EngineObject d=(EngineObject) Obin.readObject();
        System.out.println(d.a+" "+d.b+d.st);
        Obin.close();
        System.out.println("Hello");    
    }
}