package F4;

import L7.InterfaceC0163v;
import S1.L;
import T1.O;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class p extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f1417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f1418i;
    public final /* synthetic */ int j;
    public final /* synthetic */ C0999a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, int i4, C0999a c0999a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f1418i = sVar;
        this.j = i4;
        this.k = c0999a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((p) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new p(this.f1418i, this.j, this.k, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r10 == r6) goto L21;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f1417h;
        int i8 = this.j;
        s sVar = this.f1418i;
        y yVar = y.f7506a;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            this.f1417h = 1;
            obj = s.a(sVar, i8, this);
        }
        if (obj == null) {
            L s8 = sVar.f1424a.s();
            O o7 = new O(i8, this.k.f12187a);
            this.f1417h = 2;
            Object C8 = D2.f.C(this, new M7.c(s8, 8, o7), s8.f5241a, false, true);
            if (C8 != enumC0646a) {
                C8 = yVar;
            }
            if (C8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return yVar;
    }
}
