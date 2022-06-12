package design.pattern.memento;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BlackBox implements Serializable{
	
	private long altitude;
    private double speed;
    private float engineTemperature;
    private static final long serialVersionUID = 1L;
    
    
    
	public BlackBox() {
		super();
	}
	public BlackBox(long altitude, double speed, float engineTemperature) {
		super();
		this.altitude = altitude;
		this.speed = speed;
		this.engineTemperature = engineTemperature;
	}
	// Saving the state of the object as a byte stream
	public byte[] getState() throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;		
		byte[] memento = null;
		try {
			out = new ObjectOutputStream(bos);
			out.writeObject(this);
			out.flush();
			memento = bos.toByteArray();
		}finally {
			try {
				bos.close();
			}catch(IOException ex) {
				//ignore close exception
			}
		}		
		return memento;
	}
	
	// Restoring state from memento
	public BlackBox setState(byte[] memento) throws Exception {
		ByteArrayInputStream bis = new ByteArrayInputStream(memento, 0, memento.length);
		ObjectInputStream objectInputStream 
			= new ObjectInputStream(bis);
		
		BlackBox blackBox = (BlackBox)objectInputStream.readObject();  
		objectInputStream.close();
		return blackBox;
	}
	public long getAltitude() {
		return altitude;
	}
	public void setAltitude(long altitude) {
		this.altitude = altitude;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public float getEngineTemperature() {
		return engineTemperature;
	}
	public void setEngineTemperature(float engineTemperature) {
		this.engineTemperature = engineTemperature;
	}
	@Override
	public String toString() {
		return "BlackBox [altitude=" + altitude + ", speed=" + speed + ", engineTemperature=" + engineTemperature + "]";
	}
	
	
    

}
