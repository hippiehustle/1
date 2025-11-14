package p7;

import a6.AbstractC0436k;
import n6.InterfaceC1162a;

/* renamed from: p7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328j implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13832d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1162a f13833e;

    public /* synthetic */ C1328j(int i4, InterfaceC1162a interfaceC1162a) {
        this.f13832d = i4;
        this.f13833e = interfaceC1162a;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13832d) {
            case 0:
                InterfaceC1333o interfaceC1333o = (InterfaceC1333o) this.f13833e.a();
                if (interfaceC1333o instanceof C1329k) {
                    return ((C1329k) interfaceC1333o).h();
                }
                return interfaceC1333o;
            default:
                return AbstractC0436k.V0((Iterable) this.f13833e.a());
        }
    }
}
