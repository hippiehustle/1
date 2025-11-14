package P7;

import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.concurrent.atomic.AtomicInteger;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class q extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f[] f4672i;
    public final /* synthetic */ int j;
    public final /* synthetic */ AtomicInteger k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N7.h f4673l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC0233f[] interfaceC0233fArr, int i4, AtomicInteger atomicInteger, N7.h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4672i = interfaceC0233fArr;
        this.j = i4;
        this.k = atomicInteger;
        this.f4673l = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((q) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new q(this.f4672i, this.j, this.k, this.f4673l, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4671h;
        AtomicInteger atomicInteger = this.k;
        N7.h hVar = this.f4673l;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    Z5.a.d(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Z5.a.d(obj);
                InterfaceC0233f[] interfaceC0233fArr = this.f4672i;
                int i8 = this.j;
                InterfaceC0233f interfaceC0233f = interfaceC0233fArr[i8];
                p pVar = new p(hVar, i8);
                this.f4671h = 1;
                Object x8 = interfaceC0233f.x(pVar, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                E2.d.g(hVar);
            }
            return Z5.y.f7506a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                E2.d.g(hVar);
            }
        }
    }
}
