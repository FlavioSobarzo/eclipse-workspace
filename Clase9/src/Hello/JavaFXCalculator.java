package Hello;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class JavaFXCalculator extends Application {
   private TextField tfDisplay;    // display textfield //CAmbiar de color el TextFiled a blanco
   private Button[] btns;          // 20 buttons
   private String[] btnLabels = {  // Labels of 20 buttons
      "7", "8", "9", "+", "x2", "%",
      "4", "5", "6", "-", "√", "",
      "1", "2", "3", "x", "+/-", "",
      "C", "0", "=", "/", "M", "",
   };
   // For computation
   private double result = 0;      // Result of computation
   private String inStr = "0";// Input number as String
   private double saveNum;
   private boolean M = false;
   // Previous operator: ' '(nothing), '+', '-', '*', '/', '='
   private char lastOperator = ' ';

   // Event handler for all the 20 Buttons
   EventHandler handler = evt -> {
      String currentBtnLabel = ((Button)evt.getSource()).getText();
      switch (currentBtnLabel) {
         // Number buttons
         case "0": case "1": case "2": case "3": case "4":
         case "5": case "6": case "7": case "8": case "9":
  
        	M = false;
            if (inStr.equals("0")) {
               inStr = currentBtnLabel;  // no leading zero
            } else {
               inStr += currentBtnLabel; // append input digit
            }
            tfDisplay.setText(inStr);
            // Clear buffer if last operator is '='
            if (lastOperator == '=') {
               result = 0;
               lastOperator = ' ';
            }
            break;

         // Operator buttons: '+', '-', 'x', '/' and '='
         case "+":
            compute();
            lastOperator = '+';
            M = true;
            break;
         case "-":
            compute();
            lastOperator = '-';
            M = true;
            break;
         case "x":
            compute();
            lastOperator = '*';
            M = true;
            break;
         case "/":
            compute();
            lastOperator = '/';
            M = true;
            break;
         case "=":
            compute();
            lastOperator = '=';
            M = false;
            break;
         case "x2":
             compute();
             lastOperator = 'x';
             M = true;
             break;
         case "√":
             compute();
             lastOperator = 'r';
             M = true;
             break;
         case "+/-":
             compute();
             lastOperator = 's';
             M = true;
             break;
         case "%":
             compute();
             lastOperator = '%';
             M = true;
             break;
         case "M":
        	 if (M == true){
        		 if (inStr.equals("0")) {
                     inStr = String.valueOf(saveNum);  // no leading zero
                  } else {
                     inStr += saveNum; // append input digit
                  }
                  tfDisplay.setText(inStr);
                  // Clear buffer if last operator is '='
                  if (lastOperator == '=') {
                     result = 0;
                     lastOperator = ' ';
                  }
                  break;
        	 }
        	 else {
        		 compute();
        		 lastOperator = 'm';
        		 break;
        	 }
         // Clear button
         case "C":
        	saveNum = 0;
            result = 0;
            inStr = "0";
            lastOperator = ' ';
            tfDisplay.setText("0");
            break;
      }
   };

   // User pushes '+', '-', '*', '/' or '=' button.
   // Perform computation on the previous result and the current input number,
   // based on the previous operator.
   private void compute() {
      int inNum = Integer.parseInt(inStr);
      inStr = "0";
      if (lastOperator == ' ') {
         result = inNum;
      } else if (lastOperator == '+') {
         result += inNum;
      } else if (lastOperator == '-') {
         result -= inNum;
      } else if (lastOperator == '*') {
         result *= inNum;
      } else if (lastOperator == '/') {
         result /= inNum;
      } else if (lastOperator == '=') {
         // Keep the result for the next operation
      }else if (lastOperator == 'x') {
          result = Math.pow(result, 2);
      }else if (lastOperator == 'r') {
          result = Math.sqrt(result);
      }else if (lastOperator == 's') {
          result = result*-1;
      }else if (lastOperator == '%') {
          result = (result*inNum)/100;
      }else if (lastOperator == 'm') {
          saveNum = result;
          result = saveNum;
    	  
      }
      
      tfDisplay.setText(result + "");
   }

   // Setup the UI
   @Override
   public void start(Stage primaryStage) {
      // Setup the Display TextField
      tfDisplay = new TextField("0");
      tfDisplay.setEditable(false);
      tfDisplay.setAlignment(Pos.CENTER_RIGHT);
      tfDisplay.setStyle("-fx-text-inner-color: white;");
      tfDisplay.setStyle("-fx-control-inner-background: black");

      // Setup a GridPane for 5x4 Buttons
      int numCols = 6;
      int numRows = 4;
      GridPane paneButton = new GridPane();
      paneButton.setPadding(new Insets(15, 0, 15, 0));  // top, right, bottom, left
      paneButton.setVgap(5);  // Vertical gap between nodes
      paneButton.setHgap(5);  // Horizontal gap between nodes
      // Setup 4 columns of equal width, fill parent
      ColumnConstraints[] columns = new ColumnConstraints[numCols];
      for (int i = 0; i < numCols; ++i) {
         columns[i] = new ColumnConstraints();
         columns[i].setHgrow(Priority.ALWAYS) ;  // Allow column to grow
         columns[i].setFillWidth(true);  // Ask nodes to fill space for column
         paneButton.getColumnConstraints().add(columns[i]);
      }

      // Setup 20 Buttons and add to GridPane; and event handler
      btns = new Button[24];
      for (int i = 0; i < btns.length; ++i) {
         btns[i] = new Button(btnLabels[i]);
         btns[i].setOnAction(handler);  // Register event handler
         btns[i].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);  // full-width
         paneButton.add(btns[i], i % numCols, i / numCols);  // control, col, row
      }

      // Setup up the scene graph rooted at a BorderPane (of 5 zones)
      BorderPane root = new BorderPane();
      root.setPadding(new Insets(15, 15, 15, 15));  // top, right, bottom, left
      root.setTop(tfDisplay);     // Top zone contains the TextField
      root.setCenter(paneButton); // Center zone contains the GridPane of Buttons

      // Set up scene and stage
      primaryStage.setScene(new Scene(root, 300, 300));
      primaryStage.setTitle("JavaFX Calculator");
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}