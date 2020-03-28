package blackcat.demo.designpattern.state;

/**
 * FileName: Off
 * @author :   blackcat
 * @date :     2019/11/22 16:26
 */
public class Off implements State{

    @Override
    public void switchOn(Switcher switcher) {
        switcher.setState(new On());
        System.out.println("OK...灯亮");
    }

    @Override
    public void switchOff(Switcher switcher) {
        System.out.println("WARN!!!断电状态无需再关");
        return;
    }

}
