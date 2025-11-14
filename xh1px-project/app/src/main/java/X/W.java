package X;

import L7.C0156n;
import L7.C0158p;
import java.util.concurrent.CancellationException;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class W extends o6.l implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.s f6701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A4.a f6702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(c.s sVar, A4.a aVar) {
        super(1);
        this.f6701e = sVar;
        this.f6702f = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Z5.y yVar;
        Z5.y yVar2;
        Throwable th;
        Throwable th2 = (Throwable) obj;
        this.f6701e.m(th2);
        N7.h hVar = (N7.h) this.f6702f.f282g;
        hVar.h(th2, false);
        do {
            Object l6 = hVar.l();
            yVar = null;
            if (l6 instanceof N7.n) {
                l6 = null;
            }
            yVar2 = Z5.y.f7506a;
            if (l6 != null) {
                C0156n c0156n = ((T) l6).f6694b;
                if (th2 == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                } else {
                    th = th2;
                }
                c0156n.getClass();
                c0156n.R(new C0158p(th, false));
                yVar = yVar2;
            }
        } while (yVar != null);
        return yVar2;
    }
}
