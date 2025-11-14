package M3;

import n6.InterfaceC1162a;

/* renamed from: M3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182o implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0183p f3455e;

    public /* synthetic */ C0182o(C0183p c0183p, int i4) {
        this.f3454d = i4;
        this.f3455e = c0183p;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f3454d) {
            case 0:
                return this.f3455e.n();
            default:
                return new D4.y(this.f3455e.m(), 8);
        }
    }
}
