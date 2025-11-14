package R3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class m implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f5067e;

    public /* synthetic */ m(n nVar, int i4) {
        this.f5066d = i4;
        this.f5067e = nVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5066d) {
            case 0:
                return this.f5067e.n();
            default:
                return new D4.y(this.f5067e.m(), 16);
        }
    }
}
