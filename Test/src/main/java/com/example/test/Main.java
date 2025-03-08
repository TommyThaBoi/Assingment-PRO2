package com.example.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application
{
  @Override public void start(Stage stage) throws IOException
  {
    Model model = new Model();
    ViewModel viewModel = new ViewModel(model);

    FXMLLoader fxmlLoader = new FXMLLoader(
    Main.class.getResource("MainView.fxml"));

    fxmlLoader.setControllerFactory(controllerClass -> new VinylViewController(viewModel));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args)
  {
    launch();
  }
}