package P7;

import L7.AbstractC0166y;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import a6.AbstractC0436k;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f implements v {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0622h f4647d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4648e;

    /* renamed from: f, reason: collision with root package name */
    public final N7.a f4649f;

    public f(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        this.f4647d = interfaceC0622h;
        this.f4648e = i4;
        this.f4649f = aVar;
    }

    public abstract Object a(N7.s sVar, C0288e c0288e);

    public abstract f b(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar);

    public InterfaceC0233f c() {
        return null;
    }

    @Override // P7.v
    public final InterfaceC0233f m(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        InterfaceC0622h interfaceC0622h2 = this.f4647d;
        InterfaceC0622h D7 = interfaceC0622h.D(interfaceC0622h2);
        N7.a aVar2 = N7.a.f3795d;
        N7.a aVar3 = this.f4649f;
        int i8 = this.f4648e;
        if (aVar == aVar2) {
            if (i8 != -3) {
                if (i4 != -3) {
                    if (i8 != -2) {
                        if (i4 != -2) {
                            i4 += i8;
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i8;
            }
            aVar = aVar3;
        }
        if (o6.j.a(D7, interfaceC0622h2) && i4 == i8 && aVar == aVar3) {
            return this;
        }
        return b(D7, i4, aVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C0623i c0623i = C0623i.f10448d;
        InterfaceC0622h interfaceC0622h = this.f4647d;
        if (interfaceC0622h != c0623i) {
            arrayList.add("context=" + interfaceC0622h);
        }
        int i4 = this.f4648e;
        if (i4 != -3) {
            arrayList.add("capacity=" + i4);
        }
        N7.a aVar = N7.a.f3795d;
        N7.a aVar2 = this.f4649f;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return A.j.q(sb, AbstractC0436k.v0(arrayList, ", ", null, null, null, 62), ']');
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        Object f8 = AbstractC0166y.f(new C0287d(interfaceC0234g, this, null), interfaceC0617c);
        if (f8 == EnumC0646a.f10656d) {
            return f8;
        }
        return Z5.y.f7506a;
    }
}
