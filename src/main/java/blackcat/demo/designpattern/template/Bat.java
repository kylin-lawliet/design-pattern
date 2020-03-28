package blackcat.demo.designpattern.template;

/**
 * 蝙蝠
 * FileName: Bat
 * @author :   blackcat
 * @date :     2019/11/25 17:48
 * 设计模式-模板方法 示例二
 */
public class Bat extends Mammal{

    @Override
    public void move() {
        System.out.println("用翅膀飞……");
    }
}
