package A0;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import u0.C1617h;
import u0.u;
import u0.y;
import u0.z;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public y f204h;

    /* renamed from: i, reason: collision with root package name */
    public int f205i;
    public /* synthetic */ Object j;
    public final /* synthetic */ boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f206l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f207m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f208n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC0617c interfaceC0617c, InterfaceC1163b interfaceC1163b, u uVar, boolean z8, boolean z9) {
        super(2, interfaceC0617c);
        this.k = z8;
        this.f206l = z9;
        this.f207m = uVar;
        this.f208n = interfaceC1163b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((g) p((InterfaceC0617c) obj2, (z) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        g gVar = new g(interfaceC0617c, this.f208n, this.f207m, this.k, this.f206l);
        gVar.j = obj;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r11 != r8) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b6  */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        y yVar;
        z zVar;
        y yVar2;
        z zVar2;
        z zVar3;
        Object obj2;
        int i4 = this.f205i;
        InterfaceC1163b interfaceC1163b = this.f208n;
        u uVar = this.f207m;
        boolean z8 = this.f206l;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            obj2 = this.j;
                            Z5.a.d(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                C1617h e9 = uVar.e();
                                e9.f15231b.e(e9.f15234e, e9.f15235f);
                            }
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = (z) this.j;
                    Z5.a.d(obj);
                    if (!z8) {
                        this.j = obj;
                        this.f205i = 4;
                        Object b4 = zVar.b(this);
                        if (b4 != enumC0646a) {
                            obj2 = obj;
                            obj = b4;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            return obj2;
                        }
                        return enumC0646a;
                    }
                    return obj;
                }
                yVar = this.f204h;
                zVar3 = (z) this.j;
                Z5.a.d(obj);
                yVar2 = yVar;
                zVar = zVar3;
                f fVar = new f(null, interfaceC1163b);
                this.j = zVar;
                this.f204h = null;
                this.f205i = 3;
                obj = zVar.d(yVar2, fVar, this);
            } else {
                yVar = this.f204h;
                zVar2 = (z) this.j;
                Z5.a.d(obj);
            }
        } else {
            Z5.a.d(obj);
            z zVar4 = (z) this.j;
            if (this.k) {
                if (z8) {
                    yVar = y.f15292d;
                } else {
                    yVar = y.f15293e;
                }
                if (!z8) {
                    this.j = zVar4;
                    this.f204h = yVar;
                    this.f205i = 1;
                    Object b9 = zVar4.b(this);
                    if (b9 != enumC0646a) {
                        zVar2 = zVar4;
                        obj = b9;
                    }
                    return enumC0646a;
                }
                y yVar3 = yVar;
                zVar = zVar4;
                yVar2 = yVar3;
                f fVar2 = new f(null, interfaceC1163b);
                this.j = zVar;
                this.f204h = null;
                this.f205i = 3;
                obj = zVar.d(yVar2, fVar2, this);
            } else {
                o6.j.c(zVar4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return interfaceC1163b.m(((w0.y) zVar4).c());
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C1617h e10 = uVar.e();
            this.j = zVar2;
            this.f204h = yVar;
            this.f205i = 2;
            if (e10.a(this) != enumC0646a) {
                zVar3 = zVar2;
                yVar2 = yVar;
                zVar = zVar3;
                f fVar22 = new f(null, interfaceC1163b);
                this.j = zVar;
                this.f204h = null;
                this.f205i = 3;
                obj = zVar.d(yVar2, fVar22, this);
            }
            return enumC0646a;
        }
        yVar2 = yVar;
        zVar = zVar2;
        f fVar222 = new f(null, interfaceC1163b);
        this.j = zVar;
        this.f204h = null;
        this.f205i = 3;
        obj = zVar.d(yVar2, fVar222, this);
    }
}
