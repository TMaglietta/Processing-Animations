PImage nordic;
color from = color(2, 53, 100);
color to = color(5, 113, 142);

void setup(){
  size(640, 427);
  //surface.setResizable(true);
  nordic = loadImage("NordicLandscape.jpg");
  
  
  background(#355F76); //water
  
  for(int i = 0; i < 268; i++){ //sky
    stroke(lerpColor(from, to, (float) i/250));
    line(0, i, width, i);
  }
  //image(nordic, 0, 0);
}

void draw(){ 
  noStroke();
  //rocks
  fill(#131F18);
  beginShape();  //bottom left rock
    vertex(20, 423);
    vertex(8, 362);
    vertex(21, 302);
    vertex(119, 308);
    vertex(177, 328);
    vertex(98, 409);
    vertex(61, 424);
  endShape(CLOSE);
 
  beginShape(); //big group of rocks
    vertex(170, 333);
    vertex(188, 344);
    vertex(303, 376);
    vertex(270, 407);
    vertex(349, 415);
    vertex(332, 386);
    vertex(422, 380);
    vertex(640, 401);
    vertex(640, 256);
    vertex(500, 256);
    vertex(342, 271);
    vertex(339, 282);
    vertex(196, 272);
    vertex(141, 299);
    vertex(193, 304);
  endShape(CLOSE);
  //mountains
  fill(#6E8BA1);
  
  beginShape();
    vertex(230, 268);
    vertex(180, 244);
    vertex(126, 248);
    vertex(102, 240);
    vertex(50, 250);
    vertex(17, 243);
    vertex(10, 246);
    vertex(0, 243);
    vertex(0, 268);
  endShape();
  
  //aurora
  fill(#74EE97);
  //noFill();
  beginShape(); // top
    vertex(386, 0);
    vertex(306, 0);
    curveVertex(306, 0);
    curveVertex(240, 58);
    curveVertex(258, 165);
    curveVertex(296, 73);
    curveVertex(380, 0);
    curveVertex(358, 36);
  endShape(CLOSE);
  
  beginShape(); //little C shape
    curveVertex(273, 135);
    curveVertex(273, 135);
    curveVertex(326, 172);//outer cuve
    curveVertex(263, 191);
    curveVertex(263, 191);
    curveVertex(305, 169);
    curveVertex(273, 135);
  endShape(CLOSE);
  
  //ellipse(483, 136, 60, 42);
  //ellipse(254, 227, 48, 42);
  
  
  //stroke(#74EE97);
  //strokeWeight(10);
  //line(474, 144, 258, 211);
  //curve(436, 177, 341, 203, 474, 144, 258, 211);
}

void mouseClicked() {
  println(mouseX, mouseY); 
}
