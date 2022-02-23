import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    // Size of sketchboard
    size(400, 400);
  }

  public void setup() {
    // Background Colour
    background(66, 228, 253);
  }
  
  public void draw() {
    // Drawing the square of the house
    fill(165, 22, 23);
    rect(125, 200, 150, 150); 

    // Drawing the chimmney
    fill(198, 109, 71);
    rect(230, 90, 25, 50);

    // Drawing chimmney smoke
    fill(255, 255, 255);
    ellipse(243, 55, 20, 50);
    
    // Drawing the top triangle of the house
    fill(165, 22, 23);
    triangle(90, 200, 200, 80, 310, 200);

    // Drawing the Grass
    fill(0, 255, 0);
    rect(0, 350, 400, 70);

    // Drawing the top window
    fill(204, 255, 255);
    ellipse(200, 130, 40, 40);

    // Drawing the right window
    fill(204, 255, 255);
    rect(225, 215, 40, 40);
    // Drawing lines for the right window
    line(225, 235, 265, 235);
    line(245, 215, 245, 255);
    
    // Drawing the left window
    fill(204, 255, 255);
    rect(135, 215, 40, 40);
    // Drawing lines for the left window
    line(135, 235, 175, 235);
    line(155, 215, 155, 255);

    // Drawing the Door
    fill(204, 102, 0);
    rect(185, 300, 35, 50);

    // Drawing the sun
    fill(255, 255, 0);
    ellipse(25, 25, 100, 100);
  }
  
}