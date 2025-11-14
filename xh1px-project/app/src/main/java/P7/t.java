package P7;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* loaded from: classes.dex */
public final class t extends Q7.q {
    @Override // L7.d0
    public final boolean A(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return t(th);
    }
}
