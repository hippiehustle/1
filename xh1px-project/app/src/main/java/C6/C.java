package C6;

import a6.AbstractC0436k;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import java.util.List;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class C implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f713d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.a f714e;

    public /* synthetic */ C(A4.a aVar, int i4) {
        this.f713d = i4;
        this.f714e = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        InterfaceC0006g interfaceC0006g;
        int i4;
        switch (this.f713d) {
            case 0:
                C0723c c0723c = (C0723c) obj;
                o6.j.e(c0723c, "fqName");
                return new B6.p((A) this.f714e.f281f, c0723c, 1);
            default:
                D d2 = (D) obj;
                o6.j.e(d2, "<destruct>");
                C0722b c0722b = d2.f715a;
                List list = d2.f716b;
                if (!c0722b.f10795c) {
                    C0722b e9 = c0722b.e();
                    A4.a aVar = this.f714e;
                    if (e9 != null) {
                        interfaceC0006g = aVar.i(e9, AbstractC0436k.m0(list));
                    } else {
                        interfaceC0006g = (InterfaceC0006g) ((v7.e) aVar.f282g).m(c0722b.f10793a);
                    }
                    InterfaceC0006g interfaceC0006g2 = interfaceC0006g;
                    boolean g8 = c0722b.g();
                    v7.k kVar = (v7.k) aVar.f280e;
                    C0725e f8 = c0722b.f();
                    Integer num = (Integer) AbstractC0436k.r0(list);
                    if (num != null) {
                        i4 = num.intValue();
                    } else {
                        i4 = 0;
                    }
                    return new E(kVar, interfaceC0006g2, f8, g8, i4);
                }
                throw new UnsupportedOperationException("Unresolved local class: " + c0722b);
        }
    }
}
