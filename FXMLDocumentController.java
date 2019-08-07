/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_200395834;

import java.awt.event.KeyEvent;
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
    ArrayList<Integer> sumOfWords = new ArrayList<Integer>();
    int wordCount=0;
   
    ArrayList<Integer> totalScore = new ArrayList<Integer>();

     String value;
     String newsome = "";
     String newsome2 = "";
    int wordSum;
    public void showPoints(){
         
        
        value =  (typeHere.getText()).toLowerCase();       
        
        if(((value.matches("^[a-zA+]"))||value.contains("a")||value.contains("e")||value.contains("i")||value.contains("o")|| 
            value.contains("u")||value.contains("y"))&&((value.length()>= 2)&&(value.length()<= 8))&&comparingWords()==true) {

        mylist.add(value);
        
        String[] words = value.split("");
            restrictWords.addAll(Arrays.asList(words));

        oldWords.setText(mylist.toString().replace("[","").replace("]",""));
       // oldWords.setText(restrictWords.toString());
        
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
				  wordCount = count[newsome.charAt(i)];
                                 
                                System.out.println("character:"+character+"."+"count:"+wordCount);
                                
                                 
                                 
                               if((wordCount>12 && character == 'e')||(wordCount>9 && character == 'a')||(wordCount>6 && (character == 'r'||character == 't'||character == 'n'))
                                         ||(wordCount>8 &&( character == 'o'||character == 'i'))||(wordCount>6 && character == 'r')||(wordCount>4 && (character == 's'||character == 'l'||character == 'd'||character == 'u'))
                                         ||(wordCount>3 && character == 'g')||(wordCount>2 && (character == 'p'||character == 'm'||character == 'b'||character == 'h'
                                         ||character == 'c'||character == 'w'||character == 'y'||character == 'f'||character == 'v'))||(wordCount>1 && (character == 'k'||character == 'x'||character == 'z'
                                         ||character == 'j'||character == 'q'))){
                                   
                                   int finalSum=0;
                                    System.out.println(sumOfWords);
                                    for(int k=0; k<sumOfWords.size();k++){
                                        finalSum = finalSum + sumOfWords.get(k);
                                    }

                                    
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
                typeHere.clear();
              
       
                                }
                                else{
                                   
                                   if(i==0){
                                       if((wordCount>12 && character == 'e')||(wordCount>9 && character == 'a')||(wordCount>6 && (character == 'r'||character == 't'||character == 'n'))
                                         ||(wordCount>8 &&( character == 'o'||character == 'i'))||(wordCount>6 && character == 'r')||(wordCount>4 && (character == 's'||character == 'l'||character == 'd'||character == 'u'))
                                         ||(wordCount>3 && character == 'g')||(wordCount>2 && (character == 'p'||character == 'm'||character == 'b'||character == 'h'
                                         ||character == 'c'||character == 'w'||character == 'y'||character == 'f'||character == 'v'))||(wordCount>1 && (character == 'k'||character == 'x'||character == 'z'
                                         ||character == 'j'||character == 'q'))){
                                           
                                           
                                       }
                                       else{
                                            System.out.println(sumManagement());
                                            
                                       }
                                   }
                                   
                                }
                                    
                                oldWords.setText(mylist.toString().replace("[","").replace("]",""));
			}
                        
		}
                int finalSum=0;
                System.out.println(sumOfWords);
                for(int k=0; k<sumOfWords.size();k++){
                    finalSum = finalSum + sumOfWords.get(k);
                }
                
                System.out.println(finalSum);
                points.setText(Integer.toString(finalSum));    

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
   
    public int sumManagement(){
        
        System.out.println("WORKS");
        
         value =  (typeHere.getText()).toLowerCase();  
         String[] currentWordLength = value.split("");
         
         for(int y=0; y< currentWordLength.length;y++){
             System.out.println(currentWordLength[y]);
            
            String loop = currentWordLength[y];
            
            switch(loop){
                                            
                                            
                                           case "a":   
                                                wordSum = 1;
                                               
                                                break;
                                                
                                            case "b":
                                                
                                                 wordSum = 3; 
                                                 
                                                break;
                                            case "c":
                                                
                                                 wordSum = 3; 
                                                
                                                break; 
                                                
                                            case "d":
                                                
                                                 wordSum = 2; 
                                             
                                                break;   
                                                
                                             case "e":
                                                
                                                wordSum = 1;
                                                break;
                                                
                                            case "f":
                                                
                                                 wordSum = 4; 
                                                  
                                                break;
                                            case "g":
                                                
                                                 wordSum = 2;
                                               
                                                break; 
                                                
                                            case "h":
                                                
                                                 wordSum = 4; 
                                                 
                                                break;   
                                             
                                             case "i":
                                                
                                                wordSum = 1;
                                                break;
                                                
                                            case "j":
                                                
                                                 wordSum = 8; 
                                                break;
                                            case "k":
                                                
                                                 wordSum = 5; 
                                                break; 
                                                
                                            case "l":
                                                
                                                 wordSum = 1; 
                                                break;   
                                                
                                             case "m":
                                                
                                                wordSum = 3;
                                                break;
                                                
                                            case "n":
                                                
                                                 wordSum = 1; 
                                                break;
                                            case "o":
                                                
                                                 wordSum = 1; 
                                                break; 
                                                
                                            case "p":
                                                
                                                 wordSum = 3; 
                                                break;   
                                                
                                             case "q":
                                                
                                                wordSum = 10;
                                                break;
                                                
                                            case "r":
                                                
                                                 wordSum = 1; 
                                                break;
                                            case "s":
                                                
                                                 wordSum = 1; 
                                                break; 
                                                
                                            case "t":
                                                
                                                 wordSum = 1; 
                                                break;   
                                                
                                             case "u":
                                                
                                                wordSum = 1;
                                                break;
                                                
                                            case "v":
                                                
                                                 wordSum = 4; 
                                                break;
                                            case "w":
                                                
                                                 wordSum = 4; 
                                                break; 
                                                
                                            case "x":
                                                
                                                 wordSum = 8; 
                                                break;       
                                            
                                             case "y":
                                                
                                                 wordSum = 4; 
                                                break; 
                                                
                                            case "z":
                                                
                                                 wordSum = 10; 
                                                break;      
                                                
                                            default:
                                                break;
                                        }
                                       
                                     
                                     sumOfWords.add(wordSum);
                                     typeHere.undo();
                                    
    }return 2; 
    }
    
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