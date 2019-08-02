/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_200395834;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author kbany
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField typeHere;
    
    @FXML
    private TextField points;
    
     @FXML
    private TextArea oldWords;
    ArrayList<String> mylist = new ArrayList<String>();
   
  
    
    String value;
    
   
     
    
    public void showPoints(){
        
        value =  (typeHere.getText()).toLowerCase();
       
        
        if((value.contains("a")||value.contains("e")||value.contains("i")||value.contains("o")|| 
            value.contains("u")||value.contains("y"))&&((value.length()>= 2)&&(value.length()<= 8))&&comparingWords()==true) {
       
        
        mylist.add(value);
        String[] words = value.split("");
        oldWords.setText(mylist.toString());
        points.setText(Arrays.toString(words));
        }
        
       else {
                
                
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("TestRun");
                dialog.setMinHeight(300);
                dialog.setMinWidth(300);
                Label label = new Label();
                label.setText("ALERT");
                Button closeButton = new Button("You have entered wrong input");
                closeButton.setOnAction(e-> dialog.close());
                VBox layout = new VBox(10);
                layout.getChildren().addAll(label, closeButton);
                layout.setAlignment(Pos.CENTER);
                Scene scene = new Scene(layout);
                dialog.setScene(scene);
                dialog.showAndWait();
        }
        
        
         
        
        
        
        
    }
    
    /**
     *
     * @return
     */
    
    public boolean comparingWords(){
        
        for (int i=0; i<= mylist.size(); i++) {
            
        
            if(mylist.contains(value)){
                
                return false;
            }
           
        }
        return true;
        
        }
   
     
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
