package Y4;

import L7.AbstractC0160s;
import L7.InterfaceC0163v;
import Z5.y;
import b2.r;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import o2.C1229a;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f7186h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f7187i;
    public final /* synthetic */ i j;
    public final /* synthetic */ long k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f7188l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f7189m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z8, i iVar, long j, String str, a aVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7187i = z8;
        this.j = iVar;
        this.k = j;
        this.f7188l = str;
        this.f7189m = aVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new g(this.f7187i, this.j, this.k, this.f7188l, this.f7189m, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (L7.AbstractC0166y.A(r9, r0, r8) == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r9 == r5) goto L24;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f7186h;
        i iVar = this.j;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Z5.a.d(obj);
                        return y.f7506a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
            } else {
                Z5.a.d(obj);
            }
        } else {
            Z5.a.d(obj);
            boolean z8 = this.f7187i;
            String str = this.f7188l;
            long j = this.k;
            if (z8) {
                r rVar = iVar.f7195d;
                this.f7186h = 1;
                obj = rVar.c(j, str, this);
            } else {
                C1229a c1229a = iVar.f7196e;
                this.f7186h = 2;
                obj = c1229a.f13440a.b(j, str, this);
            }
            return enumC0646a;
        }
        AbstractC0160s abstractC0160s = iVar.f7193b;
        f fVar = new f(this.f7189m, null);
        this.f7186h = 3;
    }
}
