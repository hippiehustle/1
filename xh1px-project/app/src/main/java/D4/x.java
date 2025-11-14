package D4;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class x implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f997e;

    public /* synthetic */ x(A a3, int i4) {
        this.f996d = i4;
        this.f997e = a3;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f996d) {
            case 0:
                return this.f997e.n();
            default:
                return new y(this.f997e.m(), 0);
        }
    }
}
