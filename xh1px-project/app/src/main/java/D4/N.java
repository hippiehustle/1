package D4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import android.content.Context;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import j2.C0902b;
import java.util.List;
import java.util.Objects;
import l2.C1001a;
import n6.InterfaceC1164c;
import t0.C1536c;
import w2.C1691a;

/* loaded from: classes.dex */
public final class N extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public C0034j f927h;

    /* renamed from: i, reason: collision with root package name */
    public int f928i;
    public final /* synthetic */ P j;
    public final /* synthetic */ Context k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p8, Context context, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = p8;
        this.k = context;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((N) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new N(this.j, this.k, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C0034j c0034j;
        int i4 = this.f928i;
        Z5.y yVar = Z5.y.f7506a;
        P p8 = this.j;
        if (i4 != 0) {
            if (i4 == 1) {
                c0034j = this.f927h;
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            if (((Boolean) p8.f934f.f4088d.f()).booleanValue() || (c0034j = (C0034j) p8.f931c.f()) == null) {
                return yVar;
            }
            this.f927h = c0034j;
            this.f928i = 1;
            Object g8 = AbstractC0166y.g(500L, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        v2.h hVar = p8.f930b;
        C1001a c1001a = c0034j.f964a;
        C0902b c0902b = c0034j.f965b;
        A1.h hVar2 = new A1.h(3, p8);
        hVar.getClass();
        o6.j.e(c1001a, "scenario");
        o6.j.e(c0902b, "condition");
        C1691a c1691a = new C1691a(c1001a, c0902b);
        C1536c c1536c = new C1536c(c1691a, 13, hVar2);
        C1001a I8 = c1691a.I();
        List H2 = c1691a.H();
        Objects.toString(I8);
        Objects.toString(H2);
        hVar.f15502b.b(this.k, c1691a.I(), c1691a.H(), c1691a.J(), c1536c);
        return yVar;
    }
}
