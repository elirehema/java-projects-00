
package javafxapplication4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.PieChart;

public class PieChartExample extends Application {
 @Override
 public void start(Stage stage) {

 //Preparing ObservbleList object
 ObservableList<PieChart.Data> pieChartData =
 FXCollections.observableArrayList(
 new PieChart.Data("Iphone 5S", 13),
 new PieChart.Data("Samsung Grand", 25),
 new PieChart.Data("MOTO G", 10),
 new PieChart.Data("Nokia Lumia", 22),
 new PieChart.Data("Acer10", 19),
 new PieChart.Data("Samsung_Galaxy", 20));

 //Creating a Pie chart
 PieChart pieChart = new PieChart(pieChartData);
 pieChart.setTitle("Mobile Sales");
 pieChart.setClockwise(true);
 pieChart.setLabelLineLength(50);
 pieChart.setLabelsVisible(true);
 pieChart.setStartAngle(180);
 Group root = new Group(pieChart);
 Scene scene = new Scene(root, 600, 400);
 stage.setTitle("Pie chart");
 stage.setScene(scene);
 stage.show();

 }
 public static void main(String args[]){
 launch(args);
 }
}