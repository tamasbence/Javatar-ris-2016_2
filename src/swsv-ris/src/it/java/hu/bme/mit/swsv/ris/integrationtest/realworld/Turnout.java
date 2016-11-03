package hu.bme.mit.swsv.ris.integrationtest.realworld;

import hu.bme.mit.swsv.ris.common.Direction;
import hu.bme.mit.swsv.ris.common.Side;
import hu.bme.mit.swsv.ris.common.SideTriple;

public class Turnout {

	public int id = -1;

	// Elements of turnout
	public SideTriple<Integer> elements;

	// Neighbourhood
	public SideTriple<Integer> neighbours;

	// Neighbourhood connecting sides
	public SideTriple<Side> neighbourSides;

	public Direction direction;
}
