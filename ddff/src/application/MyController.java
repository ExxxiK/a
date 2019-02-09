package application;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class MyController implements Initializable {
   private static final String LoginString = null;
private static final String OK = null;
private static final String Login = null;
private String pass = "asd";
private String login = "asd";
@FXML
   private Button MyButton; 
   @FXML
   private TextField MyTextField;   
   @FXML
   private TextField MyPasswordField;
   @FXML
   private Text MyText;
   @Override
   public void initialize(URL location, ResourceBundle resources) {
      
   }
   public void showDateTime(ActionEvent event) {

        MyTextField.setText(LoginString);
      
   }
   public void Login() {
       if(MyTextField.getText().equals(login) ) {
           if(MyPasswordField.getText().equals(pass) ) { 	   
        	   System.out.println("вы вошли");
        	   MyText.setText("вы вошли");
           }
       }
       else {
    	   System.out.println("вы не вошли");
    	   MyText.setText("вы не вошли");
       }
     
  }
  
}