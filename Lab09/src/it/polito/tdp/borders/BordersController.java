/**
 * Skeleton for 'Borders.fxml' Controller Class
 */

package it.polito.tdp.borders;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.borders.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BordersController {

	Model model;

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtAnno"
	private TextField txtAnno; // Value injected by FXMLLoader

	@FXML // fx:id="txtResult"
	private TextArea txtResult; // Value injected by FXMLLoader

	@FXML
	void doCalcolaConfini(ActionEvent event) {
    try {
    	int anno=Integer.parseInt(txtAnno.getText());
    	if(anno>=1816 && anno<=2016) {
    	   model.creaGrafo(anno);
    	   txtResult.appendText("Lista e numero stati confinanti: \n");
    	   txtResult.appendText(model.getListaConnessi());
    	   txtResult.appendText("\n");
    	   txtResult.appendText(""+model.numeroGrafi());
    	   
    	}
    }catch(NumberFormatException e) {
    	e.printStackTrace();
    	txtResult.setText("ERRORE ANNO");
    }
	}

	
	public void setModel(Model model) {
		this.model = model;
	}


	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtAnno != null : "fx:id=\"txtAnno\" was not injected: check your FXML file 'Borders.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Borders.fxml'.";
	}
}
