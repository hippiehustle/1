package c2;

import T1.F;
import T1.G;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import g2.C0777a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class x extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9595h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9596i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9596i = j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((x) p((InterfaceC0617c) obj2, (C0777a) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        x xVar = new x(this.f9596i, interfaceC0617c);
        xVar.f9595h = obj;
        return xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        G g8;
        C0777a c0777a = (C0777a) this.f9595h;
        Z5.a.d(obj);
        o6.j.e(c0777a, "<this>");
        Object obj2 = c0777a.f11136d;
        if (c0777a.f11135c != null && obj2 != null) {
            long j = c0777a.f11133a.f12187a;
            long j5 = c0777a.f11134b.f12187a;
            if (obj2 instanceof Boolean) {
                g8 = G.f5517d;
            } else if (obj2 instanceof Byte) {
                g8 = G.f5518e;
            } else if (obj2 instanceof Character) {
                g8 = G.f5519f;
            } else if (obj2 instanceof Double) {
                g8 = G.f5520g;
            } else if (obj2 instanceof Integer) {
                g8 = G.f5521h;
            } else if (obj2 instanceof Float) {
                g8 = G.f5522i;
            } else if (obj2 instanceof Short) {
                g8 = G.j;
            } else if (obj2 instanceof String) {
                g8 = G.k;
            } else {
                throw new IllegalArgumentException("Unsupported value type");
            }
            F f8 = new F(j, j5, g8, c0777a.f11135c, obj2.toString());
            f8.f5513b = this.f9596i;
            return f8;
        }
        throw new IllegalStateException("Can't create entity, action is invalid");
    }
}
