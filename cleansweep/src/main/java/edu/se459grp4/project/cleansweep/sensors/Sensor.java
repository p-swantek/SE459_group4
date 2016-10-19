/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.se459grp4.project.cleansweep.sensors;

/**
 *
 * @author Weihua
 */
public abstract class Sensor {
  
 
    private Boolean mbStarted = false;
    
    //Start this Sensor
    public boolean start()
    {
        mbStarted = true;
        return true;
    }
    
    //Stop this Sensor
    public boolean stop()
    {
        mbStarted = false;
        return true;
    }
    
    //Check if the sensor is running
    public boolean isRunning()
    {
        return mbStarted;
    }
    
}