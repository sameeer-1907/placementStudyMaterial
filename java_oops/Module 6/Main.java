package application;
/*
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.canvas.*;
*/

import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import java.io.File;
import java.io.FileInputStream;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.geometry.Insets;


/*
public class Main extends Application {
	
	public void start(Stage primaryStage) {
		//try {
			VBox v1=new VBox();
			Button b1=new Button("Click me1");
			v1.getChildren().add(b1);
			Scene s1=new Scene(v1, 200,200);
			primaryStage.setScene(s1);
			primaryStage.show();
		//} catch(Exception e) {
			//e.printStackTrace();
		//}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
*/

/*
public class Main extends Application {	
	public void start(Stage primaryStage) {
		try {VBox v1=new VBox();
			Text t1=new Text("Button1 is clicked");
			Text t2=new Text("Button2 is clicked");
			//v1.getChildren().add(t1);
			
			Button b1=new Button("Click me1");
			Button b2=new Button("Click me2");
			b1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
			
					v1.getChildren().add(t1); //approach 1
					//t1.setText("button is clicked approach 2");
				}			});
			b2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
			
					v1.getChildren().add(t2); //approach 1
					//t1.setText("button is clicked approach 2");
				}			});
			//b1.setMaxSize(50, 60);
			Label label = new Label("VIT-AP");
			CheckBox checkBox1 = new CheckBox("Green");
			CheckBox checkBox2 = new CheckBox("Red");
			//CheckBox checkBox3 = new CheckBox("Blue");
			ChoiceBox choiceBox = new ChoiceBox();
			choiceBox.getItems().add("Choice 1");
			choiceBox.getItems().add("Choice 2");
			RadioButton radioButton1 = new RadioButton("Left"); 
			RadioButton radioButton2 = new RadioButton("Right"); 
			//RadioButton radioButton3 = new RadioButton("Up"); 
			//RadioButton radioButton4 = new RadioButton("Down");
			v1.getChildren().add(radioButton2);
			v1.getChildren().add(choiceBox);
			v1.getChildren().add(checkBox1);
			v1.getChildren().add(checkBox2);
			v1.getChildren().add(label);
			v1.getChildren().add(b1);
			v1.getChildren().add(b2);
			//v1.setSpacing(30); 
			//v1.setAlignment(Pos.BASELINE_RIGHT);
			//v1.setAlignment(Pos.BASELINE_RIGHT);
			v1.setAlignment(Pos.BASELINE_CENTER);
			Scene s1=new Scene(v1, 500,500);
			primaryStage.setScene(s1);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
*/

/*
public class Main extends Application {	
	public void start(Stage primaryStage) {
		try {VBox v1=new VBox();
			Text t1=new Text("Button1 is clicked");
			Text t2=new Text("Button2 is clicked");
			//v1.getChildren().add(t1);
			
			Button b1=new Button("Click me1");
			Button b2=new Button("Click me2");
			b1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
			
					v1.getChildren().add(t1); //approach 1
					//t1.setText("button is clicked approach 2");
				}			});
			
			b2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
			
					v1.getChildren().add(t2); //approach 1
					//t1.setText("button is clicked approach 2");
				}			});
			v1.getChildren().add(b1);
			v1.getChildren().add(b2);
			v1.setSpacing(30); 
			//v1.setAlignment(Pos.BASELINE_RIGHT);
			//v1.setAlignment(Pos.BASELINE_RIGHT);
			v1.setAlignment(Pos.BASELINE_CENTER);
			Scene s1=new Scene(v1, 500,500);
			primaryStage.setScene(s1);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
*/

/*
public class Main extends Application {	
	public void start(Stage primaryStage) {

//primaryStage.setWidth(400);
//primaryStage.setHeight(500);
//scene = new Scene(loadFXML("primary"), 400, 300);
VBox v1=new VBox();
Scene s1=new Scene(v1, 500,500);

Label label = new Label("VIT-AP");
Button btOK1 = new Button ("Enlarge"); 
Button btOK2 = new Button ("Shrink"); 
//btOK1.setStyle("-fx-text-fill: #0000ff");
btOK1.setMaxSize(50, 60);
btOK2.setMaxSize(50, 60);

CheckBox checkBox1 = new CheckBox("Green");
CheckBox checkBox2 = new CheckBox("Red");
CheckBox checkBox3 = new CheckBox("Blue");

ChoiceBox choiceBox = new ChoiceBox();
choiceBox.getItems().add("Choice 1");
choiceBox.getItems().add("Choice 2");
choiceBox.getItems().add("Choice 3");

RadioButton radioButton1 = new RadioButton("Left"); 
RadioButton radioButton2 = new RadioButton("Right"); 
RadioButton radioButton3 = new RadioButton("Up"); 
RadioButton radioButton4 = new RadioButton("Down");

ListView listView = new ListView();
listView.getItems().add("Item 1");
listView.getItems().add("Item 2");
listView.getItems().add("Item 3");


DatePicker datePicker = new DatePicker();

ColorPicker colorPicker = new ColorPicker();

//   Color value = colorPicker.getValue();
TextField textField = new TextField();

PasswordField passwordField = new PasswordField();

Slider slider = new Slider(0, 100, 0);

TextArea textArea = new TextArea();

MenuItem menuItem1 = new MenuItem("Option 1");
MenuItem menuItem2 = new MenuItem("Option 2");
MenuItem menuItem3 = new MenuItem("Option 3");

MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3);

ProgressBar progressBar = new ProgressBar(0);

progressBar.setProgress(0.7);

FileChooser fileChooser = new FileChooser();

Button button = new Button("Select File");
button.setOnAction(e -> {File selectedFile = fileChooser.showOpenDialog(primaryStage);
});

Menu menu = new Menu("Menu 1");
MenuItem menuItem11 = new MenuItem("Item 1");
MenuItem menuItem21 = new MenuItem("Item 2");

menu.getItems().add(menuItem11);
menu.getItems().add(menuItem21);

MenuBar menuBar = new MenuBar();
menuBar.getMenus().add(menu);

TreeItem rootItem = new TreeItem("Tutorials");

TreeItem webItem = new TreeItem("Web Tutorials");
webItem.getChildren().add(new TreeItem("HTML  Tutorial"));
webItem.getChildren().add(new TreeItem("HTML5 Tutorial"));
webItem.getChildren().add(new TreeItem("CSS Tutorial"));
webItem.getChildren().add(new TreeItem("SVG Tutorial"));
rootItem.getChildren().add(webItem);

TreeItem javaItem = new TreeItem("Java Tutorials");
javaItem.getChildren().add(new TreeItem("Java Language"));
javaItem.getChildren().add(new TreeItem("Java Collections"));
javaItem.getChildren().add(new TreeItem("Java Concurrency"));
rootItem.getChildren().add(javaItem);

TreeView treeView = new TreeView();
treeView.setRoot(rootItem);

treeView.setShowRoot(false);

Canvas canvas = new Canvas();
canvas.setHeight(512);
canvas.setWidth(512);

GraphicsContext graphicsContext2D = canvas.getGraphicsContext2D();

graphicsContext2D.setFill(Color.valueOf("#ff0000"));
graphicsContext2D.fillRect(100, 100, 200, 200);

graphicsContext2D.setStroke(Color.valueOf("#0000ff"));
graphicsContext2D.strokeRect(200, 200, 200, 200);

VBox hbox = new VBox(canvas);
hbox.setSpacing(10);
hbox.setAlignment(Pos.CENTER);
/*
//Create a pane to hold the circle
FlowPane pane = new FlowPane();
pane.getChildren().add(new Button("OK"));

// Create a circle and set its properties
Circle circle = new Circle();
circle.setCenterX(100);
circle.setCenterY(100);
circle.setRadius(50);
circle.setStroke(Color.RED);
circle.setFill(new Color(0.9, 0.9, 0.5, 0.6));

pane.getChildren().add(circle);
// Create a scene and place it in the stage
*/

/*
Scene scene = new Scene(hbox, 200, 200);

primaryStage.setTitle("ShowCircle"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage


}

static void setRoot(String fxml) throws IOException {
scene.setRoot(loadFXML(fxml));
}

private static Parent loadFXML(String fxml) throws IOException {
FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
return fxmlLoader.load();
}

public static void main(String[] args) {
launch();
}}
*/




/*
//Drawing using Canvas 
public class Main extends Application {

    
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        Pane root = new Pane();

        Canvas canvas = new Canvas(300, 300); //A Canvas is constructed with a width and height that 
        										//specifies the size of the image into which 
        											//the canvas drawing commands are rendered.
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawLines(gc);

        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 300, 250, Color.WHITESMOKE);

        stage.setTitle("Lines");
        stage.setScene(scene);
        stage.show();
    }

    private void drawLines(GraphicsContext gc) {
    	
// Draw a tringle
        //gc.beginPath();//The beginPath method starts a new path.
       // gc.moveTo(30.5, 30.5); //The moveTo method moves the starting point of the current path to the specified coordinate.
        //gc.lineTo(150.5, 30.5); //The lineTo methods add line segments to the current path.
        //gc.lineTo(155.5, 100.5);
        //gc.lineTo(30.5, 30.5);
        //gc.stroke();
        
        //Draw a path, shaped as the letter L
       // gc.beginPath();
        //gc.moveTo(20, 20);
        //gc.lineTo(20, 100);
        //gc.lineTo(70, 100);
        
        
        gc.stroke(); //The stroke method strokes the path with the current stroke paint.
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/


/*
public class Main extends Application {

    
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        Pane root = new Pane();

        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        doDrawing(gc);

        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 300, 250, Color.WHITESMOKE);

        stage.setTitle("Stroke and fill");
        stage.setScene(scene);
        stage.show();
    }

    private void doDrawing(GraphicsContext gc) {

        gc.setStroke(Color.RED.brighter());
        gc.setLineWidth(5);
       // gc.strokeLine(0, 0, 70, 40);
        //gc.strokeText("Hi",150,150);
        gc.strokeRect(10, 20, 100, 80);
        gc.strokeOval(30, 30, 30, 30);
        //gc.setFill(Color.FORESTGREEN);
        //gc.fillRect(130, 30, 80, 80);
      //  gc.fillOval(130, 30, 80, 80);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/


/*
public class Main extends Application {

   
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        Pane root = new Pane();

        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);

        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 280, 200, Color.WHITESMOKE);

        stage.setTitle("Colours");
        stage.setScene(scene);
        stage.show();
    }

    private void drawShapes(GraphicsContext gc) {

        gc.setFill(Color.CADETBLUE);
        gc.fillOval(30, 30, 50, 50);

        gc.setFill(Color.DARKRED);
        gc.fillOval(110, 30, 50, 50);

        gc.setFill(Color.STEELBLUE);
        gc.fillOval(190, 30, 50, 50);

        gc.setFill(Color.BURLYWOOD);
        gc.fillOval(30, 110, 50, 50);

        gc.setFill(Color.LIGHTSEAGREEN);
        gc.fillOval(110, 110, 50, 50);

        gc.setFill(Color.CHOCOLATE);
        gc.fillOval(190, 110, 50, 50);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/
/*
public class  Main extends Application {
GraphicsContext gc;
Color c[]= {Color.RED,Color.BLUE,Color.GREEN,Color.BLACK};
int cid=0;
public void start(Stage myStage)
{
	FlowPane node1=new FlowPane();
	node1.setAlignment(Pos.CENTER);
	Scene scene1=new Scene(node1,600,600);
	myStage.setScene(scene1);
	Canvas c1=new Canvas(400,400);
	gc=c1.getGraphicsContext2D();
	Button b=new Button("Click here to change color");
	b.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent ae)
		{
			gc.setStroke(c[cid]);
			gc.setFill(c[cid]);
			gc.strokeLine(0,0,150,150);
			gc.fillText("drawing on canvas", 50, 50);
			gc.fillRect(150,200,150,50);
			cid++;
			if(cid==c.length)
				cid=0;
		}
	});
	gc.fillOval(0,0,20,20);
	node1.getChildren().addAll(c1,b);
	myStage.show();
		
}
}
*/


/*
public class Main extends Application  {
private StackPane root = new StackPane();
private Stage stage;


public void init() {
    Button button = new Button("OPEN");
    VBox vBox = new VBox();
    Text t1=new Text("Button is clicked");

    vBox.setSpacing(8);
    vBox.setPadding(new Insets(10,10,10,10));
    vBox.getChildren().addAll(
            new Label("Your Name"),
            new TextField(),
            new Label("Your Username"),
            new TextField(),
            new Label("Your Password"),
            new PasswordField(),
            new Label("Confirm Password"),
            new PasswordField(),
            new Button("REGISTER"));
    root.getChildren().addAll(vBox);
/*
    button.setOnAction(actionEvent-> {
        if(stage!=null){
            stage.requestFocus();
            return;
        }
        */
/*
        button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
		
				vBox.getChildren().add(t1); 
				 stage = new Stage();
			        StackPane stackPane = new StackPane();
			        stage.setScene(new Scene(stackPane, 200,200));
			        stage.show();
				
			}			});
        vBox.getChildren().add(button);
       
   
}


public void start(Stage primaryStage) {
    Scene scene = new Scene(root,400,600);
    primaryStage.setScene(scene);
    primaryStage.show();
    primaryStage.setTitle("Registration Example JavaFX");
    primaryStage.setAlwaysOnTop(true);
}


public static void main(String[] args) {
    launch(args);
}
}
*/