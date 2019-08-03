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
    private Button test;
    
    @FXML
    private TextField points;
    
     @FXML
    private TextArea oldWords;
     
    ArrayList<String> mylist = new ArrayList<String>();
    ArrayList<String> restrictWords = new ArrayList<String>();
   
  
    
    String value;
     String newsome = "";
     String newsome2 = "";
    
   
     
    
    public void showPoints(){
        
        value =  (typeHere.getText()).toLowerCase();       
        
        if(((value.matches("^[a-zA+]"))||value.contains("a")||value.contains("e")||value.contains("i")||value.contains("o")|| 
            value.contains("u")||value.contains("y"))&&((value.length()>= 2)&&(value.length()<= 8))&&comparingWords()==true) {
       
        
        mylist.add(value);
        
        String[] words = value.split("");
            // restrictWords.add(Arrays.toString(words));
            restrictWords.addAll(Arrays.asList(words));

        oldWords.setText(mylist.toString());
       // oldWords.setText(restrictWords.toString());
        points.setText(Arrays.toString(words));
        
         int[] count = new int[255];
 
		int length = restrictWords.size();
 
		for (int i = 0; i < length; i++) {
                    newsome = restrictWords.toString();
                    newsome = newsome.replace("[", "");
                    newsome = newsome.replaceAll("]", "");
                    newsome = newsome.replaceAll("\\s", "");
                    newsome = newsome.replaceAll(",", "");
			count[newsome.charAt(i)]++;
		}
 
		char[] ch = new char[newsome.length()];
		for (int i = 0; i < length; i++) {
			ch[i] = newsome.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (newsome.charAt(i) == ch[j])
					find++;
			}
 
			if (find == 1) {
                                
                                char character = newsome.charAt(i);
				 int wordCount = count[newsome.charAt(i)];
                                 
                              //  oldWords.setText("character:"+character+"."+"count:"+wordCount);
                                System.out.println("character:"+character+"."+"count:"+wordCount);
                                 
                                 
                                if((wordCount>12 && character == 'e')||(wordCount>9 && character == 'a')||(wordCount>6 && (character == 'r'||character == 't'||character == 'n'))
                                         ||(wordCount>8 &&( character == 'o'||character == 'i'))||(wordCount>6 && character == 'r')||(wordCount>4 && (character == 's'||character == 'l'||character == 'd'||character == 'u'))
                                         ||(wordCount>3 && character == 'g')||(wordCount>2 && (character == 'p'||character == 'm'||character == 'b'||character == 'h'
                                         ||character == 'c'||character == 'w'||character == 'y'||character == 'f'||character == 'v'))||(wordCount>1 && (character == 'k'||character == 'x'||character == 'z'
                                         ||character == 'j'||character == 'q'))){
                                    
                                    
                                     int length2 = (mylist.get(mylist.size() - 1)).length();
 
                                    for(int l=1; l <= length2; l++){
                                            restrictWords.remove(restrictWords.size() - l);
                                        }
                                    for (int k = 0; k < length2; k++) {
                                        newsome2 = (mylist.get(mylist.size() - 1));
                                        count[newsome2.charAt(k)]--;
                                        System.out.println(newsome2);
                                    }
                                    
                                    mylist.remove(mylist.size() - 1);
                                    
                                     
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
                                oldWords.setText(mylist.toString());
			}
		}
                
                
    
        
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
