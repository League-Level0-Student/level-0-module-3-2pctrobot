
void setup() {
 size(750,750);
  // set the size of your sketch
  
}

void draw() {
  ellipse(375,375,375,375);
  int looper = 0;
  //1,2,3,5,6,10,15,25,30,50,75,125,250,375,750
  
  while (looper < 750) {
    fill(random(0,255),random(0,255),random(0,255));
  ellipse(375,375,750-looper,750-looper);
  looper += 750;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
