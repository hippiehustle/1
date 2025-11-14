package O7;

import P7.AbstractC0285b;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1166e;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public final class L implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4084d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f[] f4085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f4086f;

    /* JADX WARN: Multi-variable type inference failed */
    public L(InterfaceC0233f[] interfaceC0233fArr, InterfaceC1166e interfaceC1166e) {
        this.f4085e = interfaceC0233fArr;
        this.f4086f = (AbstractC0720j) interfaceC1166e;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f6.j, n6.e] */
    /* JADX WARN: Type inference failed for: r2v1, types: [n6.f, f6.j] */
    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f4084d) {
            case 0:
                Object a3 = AbstractC0285b.a(interfaceC0234g, interfaceC0617c, new K((InterfaceC0617c) null, (InterfaceC1166e) this.f4086f), this.f4085e);
                if (a3 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return a3;
            default:
                Object a4 = AbstractC0285b.a(interfaceC0234g, interfaceC0617c, new K((InterfaceC0617c) null, (InterfaceC1167f) this.f4086f), this.f4085e);
                if (a4 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return a4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L(InterfaceC0233f[] interfaceC0233fArr, InterfaceC1167f interfaceC1167f) {
        this.f4085e = interfaceC0233fArr;
        this.f4086f = (AbstractC0720j) interfaceC1167f;
    }
}
