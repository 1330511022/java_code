package package_extends;

public class TableTest {
    public static void main(String[] args) {  // psvm 可快速输出主main

        Table myDesk = new Table();
        myDesk.length=120;
        myDesk.width=70;
        myDesk.height=80;
        myDesk.thickness=5;
        myDesk.material="木+铁+贴皮";


        System.out.println(myDesk.maketable());

        Table TeaTable = new Table(100,100,70,5,"楠竹");
        System.out.println(TeaTable.maketable());

        Table TeaTable2 = new Table(200,200,70,5,"楠木");
        System.out.println(TeaTable2.maketable());

        TableDemo2 TeaTable3 = new TableDemo2();
        TeaTable3.setLength(150);
        TeaTable3.setWidth(150);
        TeaTable3.setHeight(75);
        TeaTable3.setThickness(5);
        TeaTable3.setMaterial("红木");
        System.out.println(TeaTable3.toString());

        ComputerDesk ComputerDesk1 = new ComputerDesk();
        ComputerDesk1.setLength(200);
        ComputerDesk1.setWidth(70);
        ComputerDesk1.setHeight(80);
        ComputerDesk1.setThickness(4);
        ComputerDesk1.setMaterial("板木");
        ComputerDesk1.setHasMonitorStand(false);
        System.out.println(ComputerDesk1.toString());
        ComputerDesk ComputerDesk2 = new ComputerDesk(true);
        System.out.println(ComputerDesk2.isHasMonitorStand());







    }
}
