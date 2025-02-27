/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Diogo Alves
 * @version 2025.02.03
 */
public class Picture
{
    private Square sky;
    private Square grass;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person kid;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        kid = new Person();
        sky = new Square();
        grass = new Square();
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("skyblue");
            sky.moveHorizontal(-340);
            sky.moveVertical(-550);
            sky.changeSize(550);
            sky.makeVisible();
            
            grass.changeColor("green");
            grass.moveHorizontal(-320);
            grass.changeSize(550);
            grass.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("skyblue");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeColor("black");
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(125);
            sun.moveVertical(-70);
            sun.changeSize(80);
            sun.makeVisible();
            
            kid.changeColor("skin color");
            kid.changeSize(80,40);
            kid.moveHorizontal(-215);
            kid.moveVertical(55);
            kid.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        grass.changeColor("white");
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("white");
        kid.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("skyblue");
        grass.changeColor("green");
        wall.changeColor("red");
        window.changeColor("skyblue");
        roof.changeColor("black");
        sun.changeColor("yellow");
        kid.changeColor("skin color");
    }
}
