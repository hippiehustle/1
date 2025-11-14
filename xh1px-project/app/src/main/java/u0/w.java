package u0;

import L7.InterfaceC0163v;
import O7.C0238k;
import d6.InterfaceC0617c;
import d6.InterfaceC0620f;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class w extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15287h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15288i;
    public final /* synthetic */ C0238k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0238k c0238k, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c0238k;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((w) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        w wVar = new w(this.j, interfaceC0617c);
        wVar.f15288i = obj;
        return wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        x xVar;
        x xVar2 = this.f15287h;
        try {
            if (xVar2 != 0) {
                if (xVar2 == 1) {
                    xVar = (x) this.f15288i;
                    Z5.a.d(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Z5.a.d(obj);
                InterfaceC0620f B8 = ((InterfaceC0163v) this.f15288i).p().B(x.f15289f);
                o6.j.b(B8);
                xVar = (x) B8;
                xVar.f15291e.incrementAndGet();
                C0238k c0238k = this.j;
                this.f15288i = xVar;
                this.f15287h = 1;
                obj = c0238k.m(this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (obj == enumC0646a) {
                    return enumC0646a;
                }
            }
            xVar2 = xVar.f15291e.decrementAndGet();
            if (xVar2 >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th) {
            if (xVar2.f15291e.decrementAndGet() >= 0) {
                throw th;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
