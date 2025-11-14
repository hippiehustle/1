package U3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class n implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f6122e;

    public /* synthetic */ n(o oVar, int i4) {
        this.f6121d = i4;
        this.f6122e = oVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f6121d) {
            case 0:
                return this.f6122e.n();
            default:
                return new D4.y(this.f6122e.m(), 20);
        }
    }
}
