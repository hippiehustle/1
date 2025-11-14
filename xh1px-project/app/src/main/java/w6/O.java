package w6;

import n6.InterfaceC1162a;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class O implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15805d;

    /* renamed from: e, reason: collision with root package name */
    public final T f15806e;

    public /* synthetic */ O(T t8, int i4) {
        this.f15805d = i4;
        this.f15806e = t8;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15805d) {
            case 0:
                return new S(this.f15806e);
            default:
                return AbstractC1638C.q(this.f15806e.f15818e);
        }
    }
}
