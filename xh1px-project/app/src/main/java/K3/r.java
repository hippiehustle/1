package K3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class r implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f2706e;

    public /* synthetic */ r(s sVar, int i4) {
        this.f2705d = i4;
        this.f2706e = sVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f2705d) {
            case 0:
                return this.f2706e.n();
            default:
                return new D4.y(this.f2706e.m(), 5);
        }
    }
}
