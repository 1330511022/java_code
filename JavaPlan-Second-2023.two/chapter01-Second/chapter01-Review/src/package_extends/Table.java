package package_extends;

public class Table {
    //成员变量
    public int length;
    public int width;
    public int height;
    public int thickness;
    public String material;

    public Table(int length, int width, int height, int thickness, String material) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.material = material;
    }

    public Table() {
    }

    public String  maketable(){
        return "属性如下：长="+this.length+",宽："+this.width+",高："+this.height+",厚度"+this.thickness+",材质："+this.material;
    }
}

