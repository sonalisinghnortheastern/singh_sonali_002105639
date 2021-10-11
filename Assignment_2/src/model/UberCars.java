/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sonal
 */
public class UberCars {
    private ArrayList<Car> cars;
    private Date fleetCatalogueUpdate;
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
 public  UberCars()
 {
     this.cars=new ArrayList<Car>();
 }

    public Date getFleetCatalogueUpdate() {
        return fleetCatalogueUpdate;
    }

    public void setFleetCatalogueUpdate(Date fleetCatalogueUpdate) {
        this.fleetCatalogueUpdate = fleetCatalogueUpdate;
    }
    public List<Car> getCars() {
        return this.cars;
    }

    public void setCars(ArrayList<Car> car) {
        this.cars=car;
    }
    public Car addNewCar()
    {
        Car car=new Car();
        cars.add(car);
        return car;
    }
}
