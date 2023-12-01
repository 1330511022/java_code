package package_extends;

public class ComputerDesk extends TableDemo2 {
    private boolean hasMonitorStand;//是否有显示器底座

    public boolean isHasMonitorStand() {
        return hasMonitorStand;
    }

    public void setHasMonitorStand(boolean hasMonitorStand) {
        this.hasMonitorStand = hasMonitorStand;
    }
    public ComputerDesk(){
        System.out.println("子类构造方法-无参");
    }
    public ComputerDesk(boolean hasMonitorStand){
        super(200, 70,80, 4, "板材");
        System.out.println("子类构造方法-有参");
        this.hasMonitorStand=hasMonitorStand;
    }

    @Override
    public String toString() {
        return "package_extends.ComputerDesk{" +super.toString()+super.maketable()+
                ",hasMonitorStand=" + hasMonitorStand +
                '}';
    }
}
