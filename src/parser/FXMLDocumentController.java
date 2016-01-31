package parser;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField tbInput;
    @FXML
    private Button btnSolve;
    @FXML
    private Label lblSolution;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void solve(ActionEvent event) {

        //Beat, till own method works
        
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = tbInput.getText();
        try {
            lblSolution.setText(engine.eval(foo).toString());
        } catch (ScriptException ex) {
            lblSolution.setText("an error occured, please check your equation");
        }

    }

}
