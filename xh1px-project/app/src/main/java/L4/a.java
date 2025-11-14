package L4;

import F4.p;
import F4.s;
import L7.AbstractC0166y;
import L7.F;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.Objects;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class a extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2896h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f2897i;
    public final /* synthetic */ j j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = jVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((a) p((InterfaceC0617c) obj2, bool)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        a aVar = new a(this.j, interfaceC0617c);
        aVar.f2897i = ((Boolean) obj).booleanValue();
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r8 == r1) goto L23;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object obj2;
        boolean z8 = this.f2897i;
        int i4 = this.f2896h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        if (z8) {
            this.f2897i = z8;
            this.f2896h = 1;
            j jVar = this.j;
            Integer num = (Integer) jVar.k.f();
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (num != null) {
                int intValue = num.intValue();
                C0999a c0999a = jVar.f2926i;
                if (c0999a != null) {
                    s sVar = jVar.f2921d;
                    sVar.getClass();
                    Objects.toString(c0999a);
                    S7.e eVar = F.f3175a;
                    obj2 = AbstractC0166y.A(S7.d.f5456f, new p(sVar, intValue, c0999a, null), this);
                    if (obj2 != enumC0646a) {
                        obj2 = yVar;
                    }
                }
            }
            obj2 = yVar;
            if (obj2 == enumC0646a) {
                return enumC0646a;
            }
        }
        return yVar;
    }
}
