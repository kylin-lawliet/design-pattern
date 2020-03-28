package blackcat.demo.designpattern.flyweight;

/**
 * @author: blackcat
 * @date: 2019/12/21 10:29
 * 设计模式-享元 示例
 */
public interface  Drawable {

    /**
     * 绘制方法，接收地图坐标
     * @author: blackcat
     * @date: 2019/12/21 10:30
     * @param x, y
    */
    void draw(int x, int y);
}
