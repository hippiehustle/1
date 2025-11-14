package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494e implements InterfaceC0508t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8838d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8839e;

    public /* synthetic */ C0494e(int i4, Object obj) {
        this.f8838d = i4;
        this.f8839e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        switch (this.f8838d) {
            case 0:
                new HashMap();
                InterfaceC0498i[] interfaceC0498iArr = (InterfaceC0498i[]) this.f8839e;
                if (interfaceC0498iArr.length <= 0) {
                    if (interfaceC0498iArr.length <= 0) {
                        return;
                    }
                    InterfaceC0498i interfaceC0498i = interfaceC0498iArr[0];
                    throw null;
                }
                InterfaceC0498i interfaceC0498i2 = interfaceC0498iArr[0];
                throw null;
            default:
                if (enumC0503n == EnumC0503n.ON_CREATE) {
                    interfaceC0510v.g().f(this);
                    ((V) this.f8839e).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0503n).toString());
                }
        }
    }
}
