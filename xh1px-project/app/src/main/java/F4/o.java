package F4;

import L7.InterfaceC0163v;
import S1.F;
import T1.C0316o;
import T1.K;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.List;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class o extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public s f1413h;

    /* renamed from: i, reason: collision with root package name */
    public long f1414i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1415l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f1416m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i4, s sVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f1415l = i4;
        this.f1416m = sVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((o) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new o(this.f1415l, this.f1416m, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d0, code lost:
    
        if (r1 == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (r1 == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r1 == r8) goto L33;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object a3;
        Object b4;
        long j;
        int i4;
        Object I8;
        Object d2;
        int i8 = this.k;
        s sVar = this.f1416m;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            Z5.a.d(obj);
                            d2 = obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        int i9 = this.j;
                        long j5 = this.f1414i;
                        sVar = this.f1413h;
                        Z5.a.d(obj);
                        j = j5;
                        i4 = i9;
                        I8 = obj;
                        C0316o c0316o = (C0316o) I8;
                        if (c0316o != null) {
                            b2.r rVar = sVar.f1426c;
                            K k = c0316o.f5609a;
                            long j8 = k.f5528a;
                            String str = k.f5529b;
                            boolean z8 = k.f5531d;
                            boolean z9 = k.f5532e;
                            o6.j.e(str, "name");
                            K k6 = new K(j8, str, 1200, z8, z9);
                            List list = c0316o.f5610b;
                            o6.j.e(list, "events");
                            C0316o c0316o2 = new C0316o(k6, list);
                            this.f1413h = null;
                            this.f1414i = j;
                            this.j = i4;
                            this.k = 4;
                            d2 = rVar.d(c0316o2, this);
                        }
                        return null;
                    }
                } else {
                    Z5.a.d(obj);
                    a3 = obj;
                    C0999a c0999a = (C0999a) a3;
                    if (c0999a != null) {
                        j = c0999a.f12187a;
                        F r8 = sVar.f1424a.r();
                        this.f1413h = sVar;
                        this.f1414i = j;
                        i4 = 0;
                        this.j = 0;
                        this.k = 3;
                        I8 = r8.I(j, this);
                    }
                    return null;
                }
            } else {
                Z5.a.d(obj);
                b4 = obj;
                return (Long) b4;
            }
        } else {
            Z5.a.d(obj);
            int i10 = this.f1415l;
            if (i10 == 0) {
                b2.r rVar2 = sVar.f1426c;
                C1001a c1001a = new C1001a(new C0999a(0L, new Long(0L)), "Tutorial", 1200, false, false, 120);
                this.k = 1;
                b4 = rVar2.b(c1001a, this);
            } else {
                this.k = 2;
                a3 = s.a(sVar, i10 - 1, this);
            }
            return enumC0646a;
        }
        return (Long) d2;
    }
}
