package fifthclass.assignments.problem5;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return this.ramSize;
	}
	
	public double getProcessorSpeed() {
		return this.processorSpeed;
	}
	
	public double computePower() {
		return (this.ramSize * this.processorSpeed);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o == null) return false;
		if(!(o instanceof Computer)) return false;
		
		Computer comp = (Computer) o;
		
		if(this.manufacturer.equals(comp.manufacturer) &&
				this.processor.equals(comp.processor) && 
				this.ramSize == comp.ramSize &&
				this.processorSpeed == comp.processorSpeed) {
			return true;
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		String status = "Manufacturer : " + manufacturer + 
				"  Processor : " + processor + 
				"  Ram Size : " + ramSize +
				"  Processor Speed : " + processorSpeed;
		
		return status;
	}
}
