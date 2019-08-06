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
   
   
  
    
     String value;
     String newsome = "";
     String newsome2 = "";
    int wordSum = 0;
    public void showPoints(){
         sumOfWords.add(0);
        
        value =  (typeHere.getText()).toLowerCase();       
        
        if(((value.matches("^[a-zA+]"))||value.contains("a")||value.contains("e")||value.contains("i")||value.contains("o")|| 
            value.contains("u")||value.contains("y"))&&((value.length()>= 2)&&(value.length()<= 8))&&comparingWords()==true) {
            
            
       
        
        mylist.add(value);
        
        String[] words = value.split("");
            // restrictWords.add(Arrays.toString(words));
            restrictWords.addAll(Arrays.asList(words));

        oldWords.setText(mylist.toString().replace("[","").replace("]",""));
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
                                
//                                 if((wordCount<=12 && character == 'e')||(wordCount<=9 && character == 'a')||(wordCount<=6 && (character == 'r'||character == 't'||character == 'n'))
//                                         ||(wordCount<=8 &&( character == 'o'||character == 'i'))||(wordCount<=6 && character == 'r')||(wordCount<=4 && (character == 's'||character == 'l'||character == 'd'||character == 'u'))
//                                         ||(wordCount<=3 && character == 'g')||(wordCount<=2 && (character == 'p'||character == 'm'||character == 'b'||character == 'h'
//                                         ||character == 'c'||character == 'w'||character == 'y'||character == 'f'||character == 'v'))||(wordCount<=1 && (character == 'k'||character == 'x'||character == 'z'
//                                         ||character == 'j'||character == 'q'))){
                                     
//                                      for(int s= 0; s< newsome.length();s++)
//                                    {
//                                        char loop = newsome.charAt(s);
//                                        System.out.println(loop);
//                                        
//                                        switch(loop){
//                                            
//                                            
//                                            case 'a':
//                                                
//                                                wordSum = (1 + wordSum)*wordCount;
//                                               // System.out.println(wordCount);
//                                                break;
//                                                
//                                            case 'b':
//                                                
//                                                 wordSum = (3 + wordSum)*wordCount; 
//                                                break;
//                                            case 'c':
//                                                
//                                                 wordSum = (3 + wordSum)*wordCount; 
//                                                break; 
//                                                
//                                            case 'd':
//                                                
//                                                 wordSum = (2 + wordSum)*wordCount; 
//                                                break;   
//                                                
//                                             case 'e':
//                                                
//                                                wordSum = (1 + wordSum)*wordCount;
//                                                break;
//                                                
//                                            case 'f':
//                                                
//                                                 wordSum = (4 + wordSum)*wordCount; 
//                                                break;
//                                            case 'g':
//                                                
//                                                 wordSum = (2 + wordSum)*wordCount; 
//                                                break; 
//                                                
//                                            case 'h':
//                                                
//                                                 wordSum = (4 + wordSum)*wordCount; 
//                                                break;   
//                                             
//                                             case 'i':
//                                                
//                                                wordSum = (1 + wordSum)*wordCount;
//                                                break;
//                                                
//                                            case 'j':
//                                                
//                                                 wordSum = (8 + wordSum)*wordCount; 
//                                                break;
//                                            case 'k':
//                                                
//                                                 wordSum = (5 + wordSum)*wordCount; 
//                                                break; 
//                                                
//                                            case 'l':
//                                                
//                                                 wordSum = (1 + wordSum)*wordCount; 
//                                                break;   
//                                                
//                                             case 'm':
//                                                
//                                                wordSum = (3 + wordSum)*wordCount;
//                                                break;
//                                                
//                                            case 'n':
//                                                
//                                                 wordSum = (1 + wordSum)*wordCount; 
//                                                break;
//                                            case 'o':
//                                                
//                                                 wordSum = (1 + wordSum)*wordCount; 
//                                                break; 
//                                                
//                                            case 'p':
//                                                
//                                                 wordSum = (3 + wordSum)*wordCount; 
//                                                break;   
//                                                
//                                             case 'q':
//                                                
//                                                wordSum = (10 + wordSum)*wordCount;
//                                                break;
//                                                
//                                            case 'r':
//                                                
//                                                 wordSum = (1 + wordSum)*wordCount; 
//                                                break;
//                                            case 's':
//                                                
//                                                 wordSum = (1 + wordSum)*wordCount; 
//                                                break; 
//                                                
//                                            case 't':
//                                                
//                                                 wordSum = (1 + wordSum)*wordCount; 
//                                                break;   
//                                                
//                                             case 'u':
//                                                
//                                                wordSum = (1 + wordSum)*wordCount;
//                                                break;
//                                                
//                                            case 'v':
//                                                
//                                                 wordSum = (4 + wordSum)*wordCount; 
//                                                break;
//                                            case 'w':
//                                                
//                                                 wordSum = (4 + wordSum)*wordCount; 
//                                                break; 
//                                                
//                                            case 'x':
//                                                
//                                                 wordSum = (8 + wordSum)*wordCount; 
//                                                break;       
//                                            
//                                             case 'y':
//                                                
//                                                 wordSum = (4 + wordSum)*wordCount; 
//                                                break; 
//                                                
//                                            case 'z':
//                                                
//                                                 wordSum = (10 + wordSum)*wordCount; 
//                                                break;      
//                                                
//                                            default:
//                                                break;
//                                        }
//                                        
//                                    }
//                                      sumOfWords.add(wordSum);
//                                     wordSum =  sumOfWords.get(sumOfWords.size()-1)+ wordSum;
//                                      System.out.println((wordSum));
                                     
                                 
                                 
                                //}
                                 
                                 
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
                               
                                
                                else{
//                                        for(int s= 0; s< restrictWords.size();s++)
//                                    {
                                        String loop = restrictWords.get(i);
                                        System.out.println(loop);
                                        
                                        switch(loop){
                                            
                                            
                                            case "a":
                                                
                                                wordSum = (1 + wordSum);
                                               System.out.println("a"+wordSum);
                                                break;
                                                
                                            case "b":
                                                
                                                 wordSum = (3 + wordSum); 
                                                 System.out.println("b"+wordSum);
                                                break;
                                            case "c":
                                                
                                                 wordSum = (3 + wordSum); 
                                                 System.out.println("c"+wordSum);
                                                break; 
                                                
                                            case "d":
                                                
                                                 wordSum = (2 + wordSum); 
                                                  System.out.println("d"+wordSum);
                                                break;   
                                                
                                             case "e":
                                                
                                                wordSum = (1 + wordSum);
                                                 System.out.println("e"+wordSum);
                                                break;
                                                
                                            case "f":
                                                
                                                 wordSum = (4 + wordSum); 
                                                  System.out.println("f"+wordSum);
                                                break;
                                            case "g":
                                                
                                                 wordSum = (2 + wordSum);
                                                  System.out.println("g"+wordSum);
                                                break; 
                                                
                                            case "h":
                                                
                                                 wordSum = (4 + wordSum); 
                                                  System.out.println("h"+wordSum);
                                                break;   
                                             
                                             case "i":
                                                
                                                wordSum = (1 + wordSum);
                                                 System.out.println("i"+wordSum);
                                                break;
                                                
                                            case "j":
                                                
                                                 wordSum = (8 + wordSum); 
                                                break;
                                            case "k":
                                                
                                                 wordSum = (5 + wordSum); 
                                                break; 
                                                
                                            case "l":
                                                
                                                 wordSum = (1 + wordSum); 
                                                break;   
                                                
                                             case "m":
                                                
                                                wordSum = (3 + wordSum);
                                                break;
                                                
                                            case "n":
                                                
                                                 wordSum = (1 + wordSum); 
                                                break;
                                            case "o":
                                                
                                                 wordSum = (1 + wordSum); 
                                                break; 
                                                
                                            case "p":
                                                
                                                 wordSum = (3 + wordSum); 
                                                break;   
                                                
                                             case "q":
                                                
                                                wordSum = (10 + wordSum);
                                                break;
                                                
                                            case "r":
                                                
                                                 wordSum = (1 + wordSum); 
                                                break;
                                            case "s":
                                                
                                                 wordSum = (1 + wordSum); 
                                                break; 
                                                
                                            case "t":
                                                
                                                 wordSum = (1 + wordSum); 
                                                break;   
                                                
                                             case "u":
                                                
                                                wordSum = (1 + wordSum);
                                                break;
                                                
                                            case "v":
                                                
                                                 wordSum = (4 + wordSum); 
                                                break;
                                            case "w":
                                                
                                                 wordSum = (4 + wordSum); 
                                                break; 
                                                
                                            case "x":
                                                
                                                 wordSum = (8 + wordSum); 
                                                break;       
                                            
                                             case "y":
                                                
                                                 wordSum = (4 + wordSum); 
                                                break; 
                                                
                                            case "z":
                                                
                                                 wordSum = (10 + wordSum); 
                                                break;      
                                                
                                            default:
                                                break;
                                        }
                                       
                               //}
                                    
                                      //  wordSum = wordSum;
                                       
                                     sumOfWords.add(wordSum);
                                     
                                     System.out.println(sumOfWords);
                                     System.out.println(wordSum);
                                    
                                     // System.out.println(sumOfWords);
                                     //wordSum =  sumOfWords.get(sumOfWords.size()-1)+ wordSum;
                                    /// System.out.println(wordSum);
                                    // System.out.println(sumOfWords);
                                    
                               }
                              
                                oldWords.setText(mylist.toString().replace("[","").replace("]",""));
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
     * @param event
     */
//    
//    public void sumManagement(KeyEvent event){
//        
//        System.out.println("WORKS");
//    
//    }
    
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
