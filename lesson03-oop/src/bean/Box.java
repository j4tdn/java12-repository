package bean;

/**
 *  OOP - Theory(ly thuyet)
 *  System = & Objects
 *  Object  = &Atribute + % Methods
 *
 *  OOP _ In essence
 *  System = & Objects
 *  Object  = &Atribute + % Methods
 *
 * class => create Objets
 * Class = &Sttribute + MEthods
 * Object = Value  + Value
 */
public class Box {
    // Attributes ( nhung thuoc tinh)
    private int  width;
    private int height;

//    Empty constructor
    public Box(){
    }

    public Box(int width, int height){
        this.height = height;
        this.width = width;
    }
// permission to acess(set | get ) attributes is value
//    setter (gan gia tri vao)
    public void setWidth(int width){
        // box1.width = 8
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

