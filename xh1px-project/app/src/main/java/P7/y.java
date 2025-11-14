package P7;

import L7.AbstractC0166y;
import L7.C0159q;
import O7.InterfaceC0234g;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.InterfaceC0714d;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class y extends AbstractC0713c implements InterfaceC0234g {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0234g f4687g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0622h f4688h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4689i;
    public InterfaceC0622h j;
    public InterfaceC0617c k;

    public y(InterfaceC0234g interfaceC0234g, InterfaceC0622h interfaceC0622h) {
        super(w.f4685d, C0623i.f10448d);
        this.f4687g = interfaceC0234g;
        this.f4688h = interfaceC0622h;
        this.f4689i = ((Number) interfaceC0622h.n(0, new C0159q(3))).intValue();
    }

    @Override // f6.AbstractC0711a, f6.InterfaceC0714d
    public final InterfaceC0714d g() {
        InterfaceC0617c interfaceC0617c = this.k;
        if (interfaceC0617c instanceof InterfaceC0714d) {
            return (InterfaceC0714d) interfaceC0617c;
        }
        return null;
    }

    @Override // f6.AbstractC0713c, d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        InterfaceC0622h interfaceC0622h = this.j;
        if (interfaceC0622h == null) {
            return C0623i.f10448d;
        }
        return interfaceC0622h;
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        try {
            Object x8 = x(interfaceC0617c, obj);
            if (x8 == EnumC0646a.f10656d) {
                return x8;
            }
            return Z5.y.f7506a;
        } catch (Throwable th) {
            this.j = new s(interfaceC0617c.h(), th);
            throw th;
        }
    }

    @Override // f6.AbstractC0711a
    public final StackTraceElement u() {
        return null;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Throwable a3 = Z5.l.a(obj);
        if (a3 != null) {
            this.j = new s(h(), a3);
        }
        InterfaceC0617c interfaceC0617c = this.k;
        if (interfaceC0617c != null) {
            interfaceC0617c.k(obj);
        }
        return EnumC0646a.f10656d;
    }

    public final Object x(InterfaceC0617c interfaceC0617c, Object obj) {
        InterfaceC0622h h8 = interfaceC0617c.h();
        AbstractC0166y.i(h8);
        InterfaceC0622h interfaceC0622h = this.j;
        if (interfaceC0622h != h8) {
            if (!(interfaceC0622h instanceof s)) {
                if (((Number) h8.n(0, new C1.b(6, this))).intValue() == this.f4689i) {
                    this.j = h8;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f4688h + ",\n\t\tbut emission happened in " + h8 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(I7.o.Q("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((s) interfaceC0622h).f4682e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.k = interfaceC0617c;
        InterfaceC1165d interfaceC1165d = A.f4629a;
        InterfaceC0234g interfaceC0234g = this.f4687g;
        o6.j.c(interfaceC0234g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object j = interfaceC1165d.j(interfaceC0234g, obj, this);
        if (!o6.j.a(j, EnumC0646a.f10656d)) {
            this.k = null;
        }
        return j;
    }
}
