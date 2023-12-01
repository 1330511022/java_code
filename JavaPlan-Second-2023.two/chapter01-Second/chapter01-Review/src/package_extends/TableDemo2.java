package package_extends;

public class TableDemo2 {
    //成员变量
    private int length;
    private int width;
    private int height;
    private int thickness;
    private String material;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "package_extends.TableDemo2{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", thickness=" + thickness +
                ", material='" + material + '\'' +
                '}';
    }

    public TableDemo2(int length, int width, int height, int thickness, String material) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.material = material;
        System.out.println("父类构造方法-有参");
    }

    public TableDemo2() {
        System.out.println("父类构造方法-无参");
    }

    public String maketable(){
        return "属性如下：长="+this.length+",宽："+this.width+",高："+this.height+",厚度"+this.thickness+",材质："+this.material;
    }
}

