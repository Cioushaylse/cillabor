import javafx.scene.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

Rectangle r = new Rectangle();
r.setX(50);
r.setY(50);
r.setWidth(50);
r.setHeight(50);
r.setFill(Color.BLUE);

Circle c = new Circle();
c.setFill(Color.rgb(255, 0, 0, 0.5));
c.setCenterX(50);
c.setCenterY(50);
c.setRadius(25);
c.setBlendMode(BlendMode.DARKEN);

Group g = new Group();
g.getChildren().add(r);
g.getChildren().add(c);
