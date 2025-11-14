package D4;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class G implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f910e;

    public /* synthetic */ G(H h8, int i4) {
        this.f909d = i4;
        this.f910e = h8;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f909d) {
            case 0:
                return this.f910e.n();
            default:
                return new y(this.f910e.m(), 1);
        }
    }
}
