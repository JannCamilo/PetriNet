package Classes;

import java.util.List;

public class Transition {
	
	public Transition(List<Arc> listArcs) {};
	public Transition() {};
	
	public boolean fireable() {return false;}
	public void fire() {}
	
	public List<Arc> getArcs() {return null;}
	public void setArcs(List<Arc> listArcs) {}
	public void addArc(Arc arc) {}
	public void deleteArc (Arc arc) {}
	public String toString() {return null;}
}
