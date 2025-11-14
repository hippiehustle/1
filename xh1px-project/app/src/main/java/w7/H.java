package w7;

import z7.InterfaceC1887d;
import z7.InterfaceC1888e;

/* loaded from: classes.dex */
public final class H extends AbstractC1741c {

    /* renamed from: b, reason: collision with root package name */
    public static final H f15955b = new H(0);

    /* renamed from: c, reason: collision with root package name */
    public static final H f15956c = new H(1);

    /* renamed from: d, reason: collision with root package name */
    public static final H f15957d = new H(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15958a;

    public /* synthetic */ H(int i4) {
        this.f15958a = i4;
    }

    @Override // w7.AbstractC1741c
    public final InterfaceC1888e C(I i4, InterfaceC1887d interfaceC1887d) {
        switch (this.f15958a) {
            case 0:
                o6.j.e(i4, "state");
                o6.j.e(interfaceC1887d, "type");
                return i4.f15961c.k(interfaceC1887d);
            case 1:
                o6.j.e(i4, "state");
                o6.j.e(interfaceC1887d, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                o6.j.e(i4, "state");
                o6.j.e(interfaceC1887d, "type");
                return i4.f15961c.P(interfaceC1887d);
        }
    }
}
