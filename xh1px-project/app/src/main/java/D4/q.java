package D4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import android.content.Context;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.List;
import java.util.Objects;
import k2.C0952b;
import l2.C1001a;
import n6.InterfaceC1164c;
import t0.C1536c;
import w2.C1691a;

/* loaded from: classes.dex */
public final class q extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f981i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Context context, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f981i = sVar;
        this.j = context;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((q) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new q(this.f981i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f980h;
        Z5.y yVar = Z5.y.f7506a;
        s sVar = this.f981i;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            if (!((Boolean) sVar.f985d.f4088d.f()).booleanValue()) {
                this.f980h = 1;
                Object g8 = AbstractC0166y.g(500L, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (g8 == enumC0646a) {
                    return enumC0646a;
                }
            }
            return yVar;
        }
        C0035k c0035k = (C0035k) sVar.f984c.f();
        if (c0035k != null) {
            v2.h hVar = sVar.f983b;
            C1001a c1001a = c0035k.f966a;
            C0952b c0952b = c0035k.f967b;
            A1.h hVar2 = new A1.h(2, sVar);
            hVar.getClass();
            o6.j.e(c1001a, "scenario");
            o6.j.e(c0952b, "event");
            C1691a c1691a = new C1691a(c1001a, c0952b);
            C1536c c1536c = new C1536c(c1691a, 14, hVar2);
            C1001a I8 = c1691a.I();
            List H2 = c1691a.H();
            Objects.toString(I8);
            Objects.toString(H2);
            hVar.f15502b.b(this.j, c1691a.I(), c1691a.H(), c1691a.J(), c1536c);
        }
        return yVar;
    }
}
