package com.citi.example;


import java.io.Serializable;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


 class SingletonSerialized implements Serializable {

	private String name ="chetan";
    private static final long serialVersionUID = -7604766932017737115L;

    private SingletonSerialized(){}

    private static class SingletonHelper {
        private static final SingletonSerialized instance = new SingletonSerialized();
    }

    public static SingletonSerialized getInstance() {
        return SingletonHelper.instance;
    }
    
    protected Object readResolve() {
        return getInstance();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}



public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    	SingletonSerialized instanceOne = SingletonSerialized.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SingletonSerialized instanceTwo = (SingletonSerialized) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        instanceOne.setName("ABC");
        
        System.out.println("instanceTwo hashCode="+instanceTwo.getName());
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());



    }

}