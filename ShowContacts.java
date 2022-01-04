package view;

import java.util.ArrayList;

import model.AllContacts;
import model.Contact;
import model.MailAdress;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowContacts extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            ScrollPane root = new ScrollPane();
            VBox box = new VBox();
            box.setSpacing(20);

            ArrayList<Contact> contacts = AllContacts.getDefaultList();
            for (Contact c : contacts) {
                GridPane adressPane = showContact(c);
                box.getChildren().add(adressPane);
            }
            root.setContent(box);
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private GridPane showContact(Contact c) {
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.getColumnConstraints().add(new ColumnConstraints(100));
        root.getColumnConstraints().add(new ColumnConstraints(140));
        root.setPadding(new Insets(25, 25, 25, 25));

        Label contact = new Label(c.getFirstName() + " " + c.getLastName() + "\n" + c.getMailAdress());
        root.add(contact, 0, 0);

        Image image = new Image(getClass().getResource("/resources/" + c.getPhoto()).toString());

        ImageView imageview = new ImageView(image);
        root.add(imageview, 0, 1);

        Label labelMailadress = new Label("E-Mail-Adressen:");
        root.add(labelMailadress, 0, 2);
        Label labelfirstMail = new Label(c.getMailAdress());
        root.add(labelfirstMail, 0, 1);
        root.add(showAdresses(c), 0, 3, 2, 1);
        return root;

    }

    private ScrollPane showAdresses(Contact c) {
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(8, 8, 8, 8));
        int row = 0;
        ArrayList<MailAdress> mailadresses = c.getMailAdresses();
        for (int i = 0; i < c.getMailAdresses().size(); i++) {
           MailAdress mail = mailadresses.get(i);
           if(!(mail.getMailAdress().equals(""))) {
            root.add(new Label(mail.getMailAdress()), 1, row);
            row++;
            continue;
           }
            
        }
        
        ScrollPane pane = new ScrollPane();
        pane.setContent(root);
        return pane;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
