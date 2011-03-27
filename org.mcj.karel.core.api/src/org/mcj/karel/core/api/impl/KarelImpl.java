/**
 * 
 */
package org.mcj.karel.core.api.impl;

import org.mcj.karel.core.api.Karel;
import org.mcj.karel.core.api.KarelHeadingEnum;

/**
 * Core implementation of Karel.
 * 
 * @author Michal Malohlava
 *
 */
public abstract class KarelImpl implements Karel {
	
	private int x;
	private int y;
	
	private KarelHeadingEnum heading;
	
	/* (non-Javadoc)
	 * @see cz.cuni.mff.d3s.karel.core.api.Karel#setPosition(int, int)
	 */
	@Override
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see cz.cuni.mff.d3s.karel.core.api.Karel#setHeading(int)
	 */
	@Override
	public void setHeading(KarelHeadingEnum heading) {
		this.heading = heading;		
	}
	
	@Override
	public KarelHeadingEnum getHeading() {		
		return heading;
	}

	/* (non-Javadoc)
	 * @see cz.cuni.mff.d3s.karel.core.api.Karel#move()
	 */
	@Override
	public void move() {
		System.out.println("Karel moved");

	}

	/* (non-Javadoc)
	 * @see cz.cuni.mff.d3s.karel.core.api.Karel#get()
	 */
	@Override
	public void get() {
		System.out.println("Karel got mark");

	}

	/* (non-Javadoc)
	 * @see cz.cuni.mff.d3s.karel.core.api.Karel#put()
	 */
	@Override
	public void put() {
		System.out.println("Karel put mark");
	}

	/* (non-Javadoc)
	 * @see cz.cuni.mff.d3s.karel.core.api.Karel#turn()
	 */
	@Override
	public void turn() {
		System.out.println("Karel turned");
	}

	/* (non-Javadoc)
	 * @see cz.cuni.mff.d3s.karel.core.api.Karel#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Karel was turned off");

	}

	/* (non-Javadoc)
	 * @see cz.cuni.mff.d3s.karel.core.api.Karel#turnOn()
	 */
	@Override
	public void turnOn() {
		System.out.println("Karel was turned On");
	}

	@Override
	public int getX() {		
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public boolean isWallAhead() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMarkedPlace() {
		// TODO Auto-generated method stub
		return false;
	}

}
