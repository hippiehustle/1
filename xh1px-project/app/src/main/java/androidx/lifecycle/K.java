package androidx.lifecycle;

import L7.AbstractC0166y;
import L7.C0150h;
import L7.InterfaceC0163v;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class K implements InterfaceC0508t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC0503n f8788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o6.u f8789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0163v f8790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EnumC0503n f8791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0150h f8792h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U7.c f8793i;
    public final /* synthetic */ AbstractC0720j j;

    /* JADX WARN: Multi-variable type inference failed */
    public K(EnumC0503n enumC0503n, o6.u uVar, InterfaceC0163v interfaceC0163v, EnumC0503n enumC0503n2, C0150h c0150h, U7.c cVar, InterfaceC1164c interfaceC1164c) {
        this.f8788d = enumC0503n;
        this.f8789e = uVar;
        this.f8790f = interfaceC0163v;
        this.f8791g = enumC0503n2;
        this.f8792h = c0150h;
        this.f8793i = cVar;
        this.j = (AbstractC0720j) interfaceC1164c;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f6.j, n6.c] */
    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        EnumC0503n enumC0503n2 = this.f8788d;
        o6.u uVar = this.f8789e;
        if (enumC0503n == enumC0503n2) {
            uVar.f13642d = AbstractC0166y.q(this.f8790f, null, null, new J(this.f8793i, this.j, null), 3);
            return;
        }
        if (enumC0503n == this.f8791g) {
            L7.X x8 = (L7.X) uVar.f13642d;
            if (x8 != null) {
                x8.d(null);
            }
            uVar.f13642d = null;
        }
        if (enumC0503n == EnumC0503n.ON_DESTROY) {
            this.f8792h.k(Z5.y.f7506a);
        }
    }
}
