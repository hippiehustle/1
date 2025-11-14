package T3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class n implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5737e;

    public /* synthetic */ n(o oVar, int i4) {
        this.f5736d = i4;
        this.f5737e = oVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5736d) {
            case 0:
                return this.f5737e.n();
            default:
                return new D4.y(this.f5737e.m(), 19);
        }
    }
}
