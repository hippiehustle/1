package p7;

import C6.InterfaceC0002c;
import i7.AbstractC0898m;
import i7.C0896k;
import java.util.ArrayList;

/* renamed from: p7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325g extends AbstractC0898m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1326h f13827d;

    public C1325g(ArrayList arrayList, AbstractC1326h abstractC1326h) {
        this.f13826c = arrayList;
        this.f13827d = abstractC1326h;
    }

    @Override // i7.AbstractC0898m
    public final void b(InterfaceC0002c interfaceC0002c) {
        o6.j.e(interfaceC0002c, "fakeOverride");
        C0896k.r(interfaceC0002c, null);
        this.f13826c.add(interfaceC0002c);
    }

    @Override // i7.AbstractC0898m
    public final void d(InterfaceC0002c interfaceC0002c, InterfaceC0002c interfaceC0002c2) {
        o6.j.e(interfaceC0002c2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f13827d.f13829b + ": " + interfaceC0002c + " vs " + interfaceC0002c2).toString());
    }
}
