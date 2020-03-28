package blackcat.demo.designpattern.adapter;

/**
 * 两项插头接口
 * @author :    blackcat
 * @date : 2019/11/21 10:58
 * 设计模式-适配器 示例
*/
public interface DualPin {

    /**
     * 通电
     * @author:     blackcat
     * @date : 2019/11/21 10:59
     * @param l:火线live
     * @param n:零线null
    */
    void electrify(int l, int n);
}
