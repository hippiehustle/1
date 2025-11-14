package w6;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class a0 implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15834d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f15835e;

    public /* synthetic */ a0(c0 c0Var, int i4) {
        this.f15834d = i4;
        this.f15835e = c0Var;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15834d) {
            case 0:
                return new b0(this.f15835e);
            default:
                return this.f15835e.u();
        }
    }
}
