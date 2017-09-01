/**
 * 游戏角色，会使用武器
 */
public class Character {
    //将功能封装成接口，构造器传入或set方法改变，便于替换
    WeaponBehavior weapon;

    //使用武器战斗
    public void fight() {
    }

    //每个角色一次只能使用一个武器
    public void setWeapon(WeaponBehavior w) {
        weapon = w;
    }
}
