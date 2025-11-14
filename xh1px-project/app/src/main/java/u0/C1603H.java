package u0;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1162a;
import n6.InterfaceC1164c;

/* renamed from: u0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603H extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15164h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1609N f15165i;
    public final /* synthetic */ InterfaceC1162a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603H(C1609N c1609n, InterfaceC1162a interfaceC1162a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15165i = c1609n;
        this.j = interfaceC1162a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1603H) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1603H(this.f15165i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15164h;
        InterfaceC1162a interfaceC1162a = this.j;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    Z5.a.d(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Z5.a.d(obj);
                C1609N c1609n = this.f15165i;
                this.f15164h = 1;
                obj = C1609N.b(c1609n, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (obj == enumC0646a) {
                    return enumC0646a;
                }
            }
            interfaceC1162a.a();
            return Z5.y.f7506a;
        } catch (Throwable th) {
            interfaceC1162a.a();
            throw th;
        }
    }
}
