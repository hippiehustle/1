package M3;

import n6.InterfaceC1162a;

/* renamed from: M3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189w implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0190x f3472e;

    public /* synthetic */ C0189w(C0190x c0190x, int i4) {
        this.f3471d = i4;
        this.f3472e = c0190x;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f3471d) {
            case 0:
                return this.f3472e.n();
            default:
                return new D4.y(this.f3472e.m(), 9);
        }
    }
}
