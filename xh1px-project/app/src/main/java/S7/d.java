package S7;

import L7.AbstractC0160s;
import L7.Q;
import Q7.u;
import d6.C0623i;
import d6.InterfaceC0622h;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d extends Q implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final d f5456f = new AbstractC0160s();

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0160s f5457g;

    /* JADX WARN: Type inference failed for: r0v0, types: [L7.s, S7.d] */
    static {
        l lVar = l.f5470f;
        int i4 = u.f4970a;
        if (64 >= i4) {
            i4 = 64;
        }
        f5457g = lVar.Q(Q7.b.l("kotlinx.coroutines.io.parallelism", i4, 12));
    }

    @Override // L7.AbstractC0160s
    public final void N(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        f5457g.N(interfaceC0622h, runnable);
    }

    @Override // L7.AbstractC0160s
    public final void O(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        f5457g.O(interfaceC0622h, runnable);
    }

    @Override // L7.AbstractC0160s
    public final AbstractC0160s Q(int i4) {
        return l.f5470f.Q(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        N(C0623i.f10448d, runnable);
    }

    @Override // L7.AbstractC0160s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
