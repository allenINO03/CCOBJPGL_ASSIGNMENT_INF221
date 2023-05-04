package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Venus;
import Planets.Earth;
import Planets.Neptune;
import Planets.Uranus;
import Planets.Jupiter;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Venus venus);

    void visit(Earth earth);

    void visit(Neptune neptune);

    void visit(Uranus urenus);

    void visit(Jupiter jupiter);
    
    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}