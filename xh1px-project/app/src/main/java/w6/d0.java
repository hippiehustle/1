package w6;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class d0 implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15849d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f15850e;

    public /* synthetic */ d0(f0 f0Var, int i4) {
        this.f15849d = i4;
        this.f15850e = f0Var;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15849d) {
            case 0:
                return new e0(this.f15850e);
            default:
                return this.f15850e.u();
        }
    }
}
