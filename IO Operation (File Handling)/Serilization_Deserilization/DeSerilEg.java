

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;

    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
   
    
}

public class DeSerilEg
{
    public static void main(String[] args) throws Exception
     {
           

        FileInputStream fis=new FileInputStream("pw.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Cricketer cr=(Cricketer)ois.readObject();
        cr.disp();

        ois.close();

      
        
    }
    
}
