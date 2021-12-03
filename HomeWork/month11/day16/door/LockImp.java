package month11.day16.door;

/**
 * ClassName: LockImp
 * Description:
 * date: 2021/11/16 15:53
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public interface LockImp {
    int LockId = 123;

    boolean openLock(int id);
    void closeLock();
}
