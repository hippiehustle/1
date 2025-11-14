package g0;

import a.AbstractC0405a;
import c.C0553g;
import e.InterfaceC0626b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752v extends AbstractC0754x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W5.a f11070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0405a f11072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0626b f11073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0755y f11074e;

    public C0752v(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, W5.a aVar, AtomicReference atomicReference, AbstractC0405a abstractC0405a, InterfaceC0626b interfaceC0626b) {
        this.f11074e = abstractComponentCallbacksC0755y;
        this.f11070a = aVar;
        this.f11071b = atomicReference;
        this.f11072c = abstractC0405a;
        this.f11073d = interfaceC0626b;
    }

    @Override // g0.AbstractC0754x
    public final void a() {
        C0553g c0553g;
        StringBuilder sb = new StringBuilder("fragment_");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f11074e;
        sb.append(abstractComponentCallbacksC0755y.f11114h);
        sb.append("_rq#");
        sb.append(abstractComponentCallbacksC0755y.Y.getAndIncrement());
        String sb2 = sb.toString();
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = (AbstractComponentCallbacksC0755y) this.f11070a.f6634e;
        C0731A c0731a = abstractComponentCallbacksC0755y2.f11129y;
        if (c0731a != null) {
            c0553g = c0731a.f10846m.f9342o;
        } else {
            c0553g = abstractComponentCallbacksC0755y2.M().f9342o;
        }
        this.f11071b.set(c0553g.d(sb2, abstractComponentCallbacksC0755y, this.f11072c, this.f11073d));
    }
}
