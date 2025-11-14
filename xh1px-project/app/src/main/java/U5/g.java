package U5;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6169a = new HashSet();

    public final void a() {
        if (AbstractC1638C.f15359e == null) {
            AbstractC1638C.f15359e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == AbstractC1638C.f15359e) {
            Iterator it = this.f6169a.iterator();
            if (!it.hasNext()) {
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
