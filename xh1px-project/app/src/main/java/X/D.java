package X;

import L7.AbstractC0166y;
import L7.C0156n;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.concurrent.atomic.AtomicInteger;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class D extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6643h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6644i;
    public final /* synthetic */ H j;
    public final /* synthetic */ AbstractC0720j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(H h8, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = h8;
        this.k = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((D) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        D d2 = new D(this.j, this.k, interfaceC0617c);
        d2.f6644i = obj;
        return d2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        N7.m mVar;
        int i4 = this.f6643h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f6644i;
        C0156n a3 = AbstractC0166y.a();
        H h8 = this.j;
        T t8 = new T(this.k, a3, h8.k.b(), interfaceC0163v.p());
        A4.a aVar = h8.f6664o;
        Object m6 = ((N7.h) aVar.f282g).m(t8);
        Throwable th = null;
        if (m6 instanceof N7.m) {
            if (m6 != null) {
                mVar = (N7.m) m6;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                th = mVar.f3839a;
            }
            if (th == null) {
                throw new IllegalStateException("Channel was closed normally");
            }
            throw th;
        }
        if (!(m6 instanceof N7.n)) {
            if (((AtomicInteger) ((W0.c) aVar.f283h).f6486e).getAndIncrement() == 0) {
                AbstractC0166y.q((Q7.d) aVar.f280e, null, null, new X(aVar, null), 3);
            }
            this.f6643h = 1;
            Object e02 = a3.e0(this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (e02 == enumC0646a) {
                return enumC0646a;
            }
            return e02;
        }
        throw new IllegalStateException("Check failed.");
    }
}
