package O7;

import d6.InterfaceC0617c;

/* renamed from: O7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232e implements InterfaceC0233f, a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0232e f4134e = new C0232e(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4135d;

    public /* synthetic */ C0232e(int i4) {
        this.f4135d = i4;
    }

    @Override // O7.a0
    public InterfaceC0233f a(P7.D d2) {
        switch (this.f4135d) {
            case 1:
                return new C0235h(X.f4109d);
            default:
                return new W0.d(new c0(d2, null));
        }
    }

    public String toString() {
        switch (this.f4135d) {
            case 1:
                return "SharingStarted.Eagerly";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        return Z5.y.f7506a;
    }
}
