package month11.day16.door;

/**
 * ClassName: ProofDoor
 * Description:
 * date: 2021/11/16 15:52
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class ProofDoor extends Door implements ElectronicBellImp,LockImp{

    @Override
    public void touchBell() {
        System.out.println("按门铃");
    }

    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
        closeLock();
        System.out.println("自动上锁");
    }

    @Override
    public boolean openLock(int LockId) {
        if(this.LockId!=LockId){
            System.out.println("打不开锁");
            return false;
        }
        System.out.println("打开了锁");
        return true;
    }

    @Override
    public void closeLock() {
    }
}
