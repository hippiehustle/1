package Z3;

import n6.InterfaceC1162a;

/* renamed from: Z3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0372g f7374e;

    public /* synthetic */ C0371f(C0372g c0372g, int i4) {
        this.f7373d = i4;
        this.f7374e = c0372g;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f7373d) {
            case 0:
                return this.f7374e.n();
            default:
                return new D4.y(this.f7374e.m(), 25);
        }
    }
}
