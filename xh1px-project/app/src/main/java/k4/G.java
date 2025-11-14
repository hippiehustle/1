package k4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class G implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f12019e;

    public /* synthetic */ G(H h8, int i4) {
        this.f12018d = i4;
        this.f12019e = h8;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12018d) {
            case 0:
                return this.f12019e.n();
            default:
                return new C0932r(this.f12019e.m(), 5);
        }
    }
}
