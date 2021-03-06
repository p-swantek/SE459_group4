
package edu.se459grp4.project.sensors;

import edu.se459grp4.project.simulator.Simulator;
import edu.se459grp4.project.simulator.types.SurfaceType;

/**
 * Sensor that is part of the clean sweep that senses the type of floor that the clean
 * sweep is currently on
 * 
 * @author Group 4
 * @version 1.8
 *
 */
class SurfaceSensor {
	
	/**
	 * Sense the type of floor at the given spot
	 * 
	 * @param x the x coordinate of the floor to sense
	 * @param y the y coordinate of the floor to sense
	 * @return the TileStatus of the floor at that point
	 * @see SurfaceType
	 */
    public SurfaceType getSensorData(int x,int y){
        return Simulator.getInstance().getSurfaceData(x, y);
    }
}
