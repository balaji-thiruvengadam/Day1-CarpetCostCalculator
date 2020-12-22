/**
 * 
 */
package com.training;

/**
 * @author balaji
 *
 */
public class RoomCarpet extends RoomDimensions {
	
	 private double costPerSqFt;

	/**
	 * Default constructor
	 */
	public RoomCarpet() {
	}

	/**
	 * @param size of RoomDimensions
	 */
	public RoomCarpet(RoomDimensions size, double cost) {
		super(size);
		this.setCostPerSqFt(cost);
	}

	/**
	 * @return the costPerSqFt
	 */
	public double getCostPerSqFt() {
		return costPerSqFt;
	}

	/**
	 * @param costPerSqFt the costPerSqFt to set
	 */
	public void setCostPerSqFt(double costPerSqFt) {
		this.costPerSqFt = costPerSqFt;
	}
	
	public double getCarpetCost() {
        return costPerSqFt * super.getArea();
    }

}
