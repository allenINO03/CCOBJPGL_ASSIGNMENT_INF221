package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class classmates {

    @FXML
    ImageView Arjay, jasper, Christine, Beatriz, Darwin; 

    @FXML
    Button jayBtn, tinBtn, beaBtn, winBtn, perBtn;

    Arjay jay= new Arjay();
    Christine tin = new Christine();
    Beatriz bea = new Beatriz();
    Darwin win= new Darwin(); 
    jasper per = new jasper(); 


    public void initialize() {

        jay.setRating("INF221 Cutie");
        jay.setTaste("Cutie");

        bea.setRating("Future ComSci Expert");
        bea.setTaste("Code Source");

        tin.setRating("Overthinker na maganda");
        tin.setTaste("overthinker pero atleast maganda");

        win.setRating("Alfonso King");
        win.setTaste("Shot muna bago shoot!");

        per.setRating("BBC");
        per.setTaste("Kimmy lang Bhie");
      
    }

    
    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton == jayBtn) {
            alert.setContentText("Arjay " + jay.getRating() + " and " + jay.getTaste());
        }

       
        if (sourceButton == beaBtn) {
            alert.setContentText("Beatriz " + bea.getRating() + " and " + bea.getTaste());
        }

        if (sourceButton == tinBtn) {
            alert.setContentText("Christine" + tin.getRating() + " and " + tin.getTaste());
        }

        
        if (sourceButton == winBtn) {
            alert.setContentText("Darwin" + win.getRating() + " and " + win.getTaste());
        }

        if (sourceButton == perBtn) {
            alert.setContentText("Jasper" + per.getRating() + " and " + per.getTaste());
        }

        alert.showAndWait();

    }

}