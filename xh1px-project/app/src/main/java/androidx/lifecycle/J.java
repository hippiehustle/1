package androidx.lifecycle;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class J extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public U7.a f8785h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0720j f8786i;
    public int j;
    public final /* synthetic */ U7.c k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f8787l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(U7.c cVar, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.k = cVar;
        this.f8787l = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((J) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new J(this.k, this.f8787l, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r7.d(r6) == r4) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [n6.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [U7.a] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        U7.c cVar;
        ?? r02;
        U7.a aVar;
        Throwable th;
        int i4 = this.j;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        aVar = this.f8785h;
                        try {
                            Z5.a.d(obj);
                            aVar.a(null);
                            return Z5.y.f7506a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar.a(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC1164c interfaceC1164c = (InterfaceC1164c) this.f8786i;
                ?? r22 = this.f8785h;
                Z5.a.d(obj);
                cVar = r22;
                r02 = interfaceC1164c;
            } else {
                Z5.a.d(obj);
                cVar = this.k;
                this.f8785h = cVar;
                AbstractC0720j abstractC0720j = this.f8787l;
                this.f8786i = abstractC0720j;
                this.j = 1;
                r02 = abstractC0720j;
            }
            I i8 = new I(r02, null);
            this.f8785h = cVar;
            this.f8786i = null;
            this.j = 2;
            if (AbstractC0166y.f(i8, this) != enumC0646a) {
                aVar = cVar;
                aVar.a(null);
                return Z5.y.f7506a;
            }
            return enumC0646a;
        } catch (Throwable th3) {
            aVar = cVar;
            th = th3;
            aVar.a(null);
            throw th;
        }
    }
}
