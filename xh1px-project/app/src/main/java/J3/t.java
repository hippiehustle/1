package J3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class t implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f2464e;

    public /* synthetic */ t(u uVar, int i4) {
        this.f2463d = i4;
        this.f2464e = uVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f2463d) {
            case 0:
                return this.f2464e.n();
            case 1:
                return new D4.y(this.f2464e.m(), 3);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f2464e.n();
            default:
                return new D4.y(this.f2464e.m(), 4);
        }
    }
}
