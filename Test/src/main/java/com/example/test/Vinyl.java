package com.example.test;

public class Vinyl
{

  private String title;
  private String artist;
  private int releaseYear;
  private String state;

  public Vinyl(String title, String artist, int releaseYear, String state) {
    this.title = title;
    this.artist = artist;
    this.releaseYear = releaseYear;
    this.state = state; // Default state
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getArtist()
  {
    return artist;
  }

  public void setArtist(String artist)
  {
    this.artist = artist;
  }

  public int getReleaseYear()
  {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear)
  {
    this.releaseYear = releaseYear;
  }

  public VinylViewController getState()
  {
    return null;
  }

  public void setState(VinylViewController state)
  {
    //    this.state = state;
  }

}
