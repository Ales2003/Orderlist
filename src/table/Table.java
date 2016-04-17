/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 

/**
 *
 * @author Алекс1
 */
public class Table extends Application {
    
  private TableView table = new TableView();
  
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Sales");
        stage.setWidth(300);
        stage.setHeight(500);
 
        final Label label = new Label("List of orders");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn numberOfOrderCol = new TableColumn("Number");
        TableColumn goodsInOrderCol = new TableColumn("Goods");
        TableColumn receiptDateCol = new TableColumn("Date");
        
        table.getColumns().addAll(numberOfOrderCol, goodsInOrderCol, receiptDateCol);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
}
