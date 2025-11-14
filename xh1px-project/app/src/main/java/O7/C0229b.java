package O7;

import P7.C0288e;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: O7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229b extends P7.f {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0720j f4122g;

    /* JADX WARN: Multi-variable type inference failed */
    public C0229b(InterfaceC1164c interfaceC1164c, InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        super(interfaceC0622h, i4, aVar);
        this.f4122g = (AbstractC0720j) interfaceC1164c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, n6.c] */
    @Override // P7.f
    public final Object a(N7.s sVar, C0288e c0288e) {
        Object l6 = this.f4122g.l(sVar, c0288e);
        if (l6 == EnumC0646a.f10656d) {
            return l6;
        }
        return Z5.y.f7506a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f6.j, n6.c] */
    @Override // P7.f
    public final P7.f b(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        return new C0229b(this.f4122g, interfaceC0622h, i4, aVar);
    }

    @Override // P7.f
    public final String toString() {
        return "block[" + this.f4122g + "] -> " + super.toString();
    }
}
