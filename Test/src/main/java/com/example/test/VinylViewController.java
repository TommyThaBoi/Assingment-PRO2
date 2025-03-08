package com.example.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class VinylViewController
{
  @FXML private TableView<Vinyl> vinylTable;

  @FXML private Button reserveButton;
  @FXML private Button borrowButton;
  @FXML private Button returnButton;
  @FXML private Button removeButton;


  @FXML private Label welcomeText;
  @FXML private TableView<Vinyl> vinyls;

  private ViewModel viewModel;

  public VinylViewController(ViewModel viewModel)
  {
    this.viewModel = viewModel;

  }

  public void initialize()
  {
    // vinyls.
    System.out.println(viewModel.getVinyls().getFirst().getArtist());
  }

  @FXML protected void onHelloButtonClick()
  {
    welcomeText.setText("Welcome to JavaFX Application!");
  }

  private void handleReserve() {
    Vinyl selected = vinylTable.getSelectionModel().getSelectedItem();
    if (selected != null) {
      //selected.reserve();
      vinylTable.refresh();
    }
  }


  private void handleBorrow() {
    Vinyl selected = vinylTable.getSelectionModel().getSelectedItem();
    if (selected != null) {
      //selected.borrow();
      vinylTable.refresh();
    }
  }

  private void handleReturn() {
    Vinyl selected = vinylTable.getSelectionModel().getSelectedItem();
    if (selected != null) {
      //selected.returnVinyl();
      vinylTable.refresh();
    }
  }

  private void handleRemove() {
    Vinyl selected = vinylTable.getSelectionModel().getSelectedItem();
    if (selected != null) {
      //selected.removeVinyl();
      vinylTable.refresh();
    }
  }
}