package com.example.test;

import javafx.fxml.FXML;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.util.List;
import java.io.IOException;

public class ViewModel
{

  private Model model;


  public ViewModel(Model model)
  {
    this.model = model;
  }
  public void initialize()
  {
  }
  public List<Vinyl> getVinyls()
  {
   return model.getVinyls();
  }

}