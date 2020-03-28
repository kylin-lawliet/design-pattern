package blackcat.demo.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 游戏客户端
 * FileName: client
 * @author :   blackcat
 * @date :     2019/11/13 15:34
 */
public class client {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<Enemyplan> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            // Enemyplan ep = new Enemyplan(new Random().nextInt(200));
            Enemyplan ep = EnemyPlaneFactory.getInstance(new Random().nextInt(200));
            list.add(ep);
        }
    }

}
