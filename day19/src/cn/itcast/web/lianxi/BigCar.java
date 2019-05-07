package cn.itcast.web.lianxi;

public class BigCar implements Car{
    @Override
    public void get() {
        System.out.println("一辆车");
    }

    @Override
    public void methord(String str) {
        System.out.println(str);
    }

    @Override
    public String back() {
        return "HelloWord";
    }
}
