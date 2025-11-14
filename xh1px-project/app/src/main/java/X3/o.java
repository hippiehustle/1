package X3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class o implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f6908e;

    public /* synthetic */ o(p pVar, int i4) {
        this.f6907d = i4;
        this.f6908e = pVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f6907d) {
            case 0:
                return this.f6908e.n();
            default:
                return new D4.y(this.f6908e.m(), 23);
        }
    }
}
