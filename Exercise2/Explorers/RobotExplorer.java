package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Data system sync successfully ... exploring Mercury");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Data system sync successfully... exploring Venus");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Data system sync successfully... exploring Earth");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Data system sync successfully... exploring Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Data system sync successfully... exploring Saturn");
    }

    @Override
    public void visit(Neptune neptune) {
            System.out.println("Data system sync successfully... exploring Neptune");
    }

    @Override
    public void visit(Uranus uranus) {
            System.out.println("Data system sync successfully... exploring Urenus");
    }
 
    @Override
    public void visit(Jupiter jupiter) {
            System.out.println("Data system sync successfully... exploring Jupiter");
    }
}