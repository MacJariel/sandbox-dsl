/**
 * 
 */
package org.mcj.karel.core.api;

/**
 * Karel the robot.
 * 
 * Generated robot will inherit this interface and append new methods
 * 
 * @author Michal Malohlava
 *
 */
public interface Karel {
	
	public void setPosition(int x, int y);
	public int getX();
	public int getY(); 
	
	public void setHeading(KarelHeadingEnum heading);
	public KarelHeadingEnum getHeading();
	
	public void move();
	public void get();
	public void put();
	public void turn();
	
	public void turnOff();
	public void turnOn();
	
	public boolean isWallAhead();
	public boolean isMarkedPlace();
}
