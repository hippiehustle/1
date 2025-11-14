package P7;

import O7.U;
import O7.g0;

/* loaded from: classes.dex */
public final class D extends U implements g0 {
    public final void w(int i4) {
        synchronized (this) {
            Object[] objArr = this.k;
            o6.j.b(objArr);
            t(Integer.valueOf(((Number) objArr[((int) ((this.f4100l + ((int) ((l() + this.f4102n) - this.f4100l))) - 1)) & (objArr.length - 1)]).intValue() + i4));
        }
    }
}
