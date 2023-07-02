class Plate {
    int length;
    int width;

    Plate(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Box extends Plate {
    int height;

    Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int length, int width, int height, int thick) {
        super(length, width, height);
        this.thick = thick;
    }
}

public class q2 {
    public static void main(String[] args) {
        // Creating objects of WoodBox class
        WoodBox woodBox = new WoodBox(10, 8, 6, 2);

        // Accessing the data members of WoodBox class
        System.out.println("WoodBox Details:");
        System.out.println("Length: " + woodBox.length);
        System.out.println("Width: " + woodBox.width);
        System.out.println("Height: " + woodBox.height);
        System.out.println("Thickness: " + woodBox.thick);
   }
}
