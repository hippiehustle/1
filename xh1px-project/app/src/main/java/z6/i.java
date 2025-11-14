package z6;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class i implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16719d;

    /* renamed from: e, reason: collision with root package name */
    public final j f16720e;

    public /* synthetic */ i(j jVar, int i4) {
        this.f16719d = i4;
        this.f16720e = jVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f16719d) {
            case 0:
                return n.k.a(this.f16720e.f16729d);
            default:
                return n.k.a(this.f16720e.f16730e);
        }
    }
}
