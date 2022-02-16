package homework.lesson9;

public class Area {
    public int width;
    public int length;

    public void setDim(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int calculateArea() {
        return length * width;
    }
}
