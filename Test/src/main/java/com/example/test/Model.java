package com.example.test
    ;

import java.util.ArrayList;
import java.util.List;

public class Model
{
  private List<Vinyl> vinyls;

  public Model()
  {
    vinyls = new ArrayList<>();
    addVinyl("Gola", "messi", 2001, "Okey");
    addVinyl("Gola", "messi", 2001, "Okey");
    addVinyl("Gola", "messi", 2001, "Okey");
    addVinyl("Gola", "messi", 2001, "Okey");

  }

  public void addVinyl(String title, String artist, int releaseYear, String state)
  {
    {
      vinyls.add(new Vinyl(title, artist, releaseYear, state));
      System.out.println("Vinyl added: " + title + ", " + artist + ", " + releaseYear + ", " + state);
    }
  }

  public List<Vinyl> getVinyls()
  {
    return vinyls;
  }

  public void reserveVinyl(Vinyl vinyl)
  {

  }

  public void borrowVinyl(Vinyl vinyl)
  {

  }
  public void returnVinyl(Vinyl vinyl)
  {

  }
  public void removeVinyl(Vinyl vinyl)
  {

  }
}