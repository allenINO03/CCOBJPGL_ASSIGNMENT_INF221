package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying the rover to Mars... exploring life");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying the rover to Mars... exploring life");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Deploying the rover to Venus... exploring life");
    }

    @Override
    public void visit(Earth earth ) {
        System.out.println("Deploying the rover to Earth... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying the rover to Saturn... exploring life");
    }

    @Override
    public void visit(Neptune neptune) {
            System.out.println("Deploying the rover to Neptune... exploring life");
    }

    @Override
    public void visit(Uranus uranus) {
            System.out.println("Deploying the rover to urenus... exploring life");
    }

    @Override
    public void visit(Jupiter jupiter) {
            System.out.println("Deploying the rover to Jupiter... exploring life");
    }

}