package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class 自由落體 extends Application implements EventHandler<ActionEvent> {
	
 	private final Group root = new Group();
    private final Canvas canvas = new Canvas(400, 400);
    private final GraphicsContext gc = canvas.getGraphicsContext2D();
    
    double v=0;
    double g=10;
    double h=0;
    int 預設高度 = 300;
    boolean fall=true;
    
	    private final AnimationTimer timer = new AnimationTimer() {
	        @Override
	        public void handle(long now) {
	        	
	            gc.clearRect(0, 0, 400, 400);
	            gc.setFill(Color.AQUA);
	            gc.fillOval(canvas.getWidth()/2-30/2,canvas.getHeight()-(預設高度), 30, 30);
	           
	            v+=1.25;
	            h = Math.pow(v,2)/(2*g);
	            
	            gc.setFill(Color.RED);
	            gc.fillOval(canvas.getWidth()/2-30/2,canvas.getHeight()-(預設高度-h), 30, 30);
	            
	            if(h>=300-30) {
	            	v*=-1;
	            }
	            System.out.println(h);
	        }
	    };

		public static void main(String args[]){          
			 launch(args);     
		} 
			
		@Override     
		public void start(Stage stage) {
			root.getChildren().add(canvas);
		    Scene scene = new Scene(root, 400, 400);
		    stage.setScene(scene);
		    stage.show();
		    stage.setTitle("自由落體");
		    timer.start();
		}
		
		public void handle(ActionEvent event) {
			
		}
}



