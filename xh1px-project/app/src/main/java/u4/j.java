package u4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class j implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f15337e;

    public /* synthetic */ j(k kVar, int i4) {
        this.f15336d = i4;
        this.f15337e = kVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15336d) {
            case 0:
                return this.f15337e.f();
            default:
                return new C0932r(this.f15337e.j(), 21);
        }
    }
}
