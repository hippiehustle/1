package w6;

import C6.InterfaceC0002c;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class r implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0002c f15904d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15905e;

    public r(InterfaceC0002c interfaceC0002c, int i4) {
        this.f15904d = interfaceC0002c;
        this.f15905e = i4;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        Object obj = this.f15904d.z0().get(this.f15905e);
        o6.j.d(obj, "get(...)");
        return (C6.K) obj;
    }
}
