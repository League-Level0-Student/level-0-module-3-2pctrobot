
void setup() {
 size(1000,1000);
  // set the size of your sketch
  
}

void draw() {
  ellipse(500,500,500,500);
  int looper = 0;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  noStroke();
  while (looper < 1000) {
    fill(random(0,255),random(0,255),random(0,255));
  ellipse(500,500,1000-looper,1000-looper);
  looper += 1000;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
