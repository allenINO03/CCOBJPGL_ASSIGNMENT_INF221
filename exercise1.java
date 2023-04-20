package Activity1;

public class App {


    static boolean iWillNotCheat = true; 
    static boolean iWillWin = true;
   
    public static void main(String[] args) throws Exception {

        // Precondition
       assert iWillNotCheat == true: "Cheater Amp!";
     
        enterCompetition();
        // Postcondition
        assert iWillWin == true: "okay lang sino ba naman ako diba? ";
    }
        static void enterCompetition(){
            iWillWin = false;
        }
}   

