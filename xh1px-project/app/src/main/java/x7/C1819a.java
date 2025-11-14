package x7;

import w7.AbstractC1741c;
import w7.I;
import w7.Q;
import w7.X;
import w7.z;
import z7.InterfaceC1887d;
import z7.InterfaceC1888e;

/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819a extends AbstractC1741c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1820b f16278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f16279b;

    public C1819a(InterfaceC1820b interfaceC1820b, Q q6) {
        this.f16278a = interfaceC1820b;
        this.f16279b = q6;
    }

    @Override // w7.AbstractC1741c
    public final InterfaceC1888e C(I i4, InterfaceC1887d interfaceC1887d) {
        o6.j.e(i4, "state");
        o6.j.e(interfaceC1887d, "type");
        InterfaceC1820b interfaceC1820b = this.f16278a;
        z V6 = interfaceC1820b.V(this.f16279b.g(interfaceC1820b.k(interfaceC1887d), X.INVARIANT));
        o6.j.b(V6);
        return V6;
    }
}
