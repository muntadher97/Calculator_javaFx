/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claculatewithjavafx;

import com.sun.jndi.dns.DnsContextFactory;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Stage;
/**
 *
 * @author Muntadher
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    TextField result;
    double n1,n2; 
    String op;
    public void numbers(ActionEvent ae){
      String numbers =((Button)ae.getSource()).getText();
      result.setText(result.getText()+numbers); 
    }
    public void opertion(ActionEvent ae){
           String operation =((Button)ae.getSource()).getText();
           if(!operation.equals("=")){
             op=operation;
             n1=Double.valueOf(result.getText());
             result.setText("");
             System.out.println(n1+op);
           }
           else{
            n2=Double.valueOf(result.getText());
            System.out.println(n1+op+n2);
            double z=Calculate(n1, n2, op);
            result.setText(String.valueOf(z));
           
           }      
    }
 
   
    public void exit (ActionEvent ae){
        
        
        
        
        Platform.exit();
//       Stage s=new Stage();
//       Group g=new Group();
//        Button b1=new Button("GOTO Stage1");
//       b1.setOnAction((event) -> {
//           s.close();
//       });
//       g.getChildren().add(b1);
//       Scene scene =new Scene(g,300,300);
//       s.setScene(scene);
//       s.setTitle("STAGE2");
//       s.show();
    }
    
    public void Clear (ActionEvent ae){
        result.setText("");
    }
    
    public double Calculate(double n1,double n2,String op){
           double z=0;
           switch(op){
               case "/":z=n1/n2;break;
               case "*":z=n1*n2;break;
               case "+":z=n1+n2;break;
               case "-":z=n1+n2;break;
               case "%":z=n1%n2;break;
           }
           return z;
           }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
