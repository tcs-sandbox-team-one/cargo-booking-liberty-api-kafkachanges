package com.cargotracker.shareddomain.events;

public class CargoHandledEvent{

    private CargoHandledEventData cargoHandledEventData;
    
    public CargoHandledEvent() {}
    public CargoHandledEvent(CargoHandledEventData cargoHandledEventData) { this.cargoHandledEventData = cargoHandledEventData; }
    
    public CargoHandledEventData getCargoHandledEventData() {
        return cargoHandledEventData;
    }
	public void setCargoHandledEventData(CargoHandledEventData cargoHandledEventData) {
		this.cargoHandledEventData = cargoHandledEventData;
	}
    
}
