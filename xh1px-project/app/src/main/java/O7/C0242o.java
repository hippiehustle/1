package O7;

import L7.AbstractC0143a;
import L7.AbstractC0166y;
import L7.EnumC0164w;
import L7.InterfaceC0163v;
import P7.AbstractC0285b;
import d6.C0618d;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;

/* renamed from: O7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242o extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public o6.u f4165h;

    /* renamed from: i, reason: collision with root package name */
    public o6.t f4166i;
    public int j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H7.o f4168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f f4169n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0242o(H7.o oVar, InterfaceC0233f interfaceC0233f, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.f4168m = oVar;
        this.f4169n = interfaceC0233f;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        C0242o c0242o = new C0242o(this.f4168m, this.f4169n, (InterfaceC0617c) obj3);
        c0242o.k = (InterfaceC0163v) obj;
        c0242o.f4167l = (InterfaceC0234g) obj2;
        return c0242o.v(Z5.y.f7506a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0139, code lost:
    
        if (r12.c(r19) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x001d, code lost:
    
        if (r12.d(r19) == r6) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, o6.t] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [N7.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [o6.u] */
    /* JADX WARN: Type inference failed for: r7v5, types: [o6.u] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o6.u] */
    /* JADX WARN: Type inference failed for: r7v9, types: [N7.u] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        InterfaceC0234g interfaceC0234g;
        Object obj2;
        o6.t tVar;
        ?? r72;
        o6.u uVar;
        ?? r73;
        InterfaceC0234g interfaceC0234g2;
        T7.e eVar;
        o6.t tVar2;
        Object obj3;
        Object obj4;
        int i4 = this.j;
        InterfaceC0617c interfaceC0617c = null;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    uVar = this.f4165h;
                    r73 = (N7.u) this.f4167l;
                    interfaceC0234g2 = (InterfaceC0234g) this.k;
                    Z5.a.d(obj);
                    interfaceC0234g = interfaceC0234g2;
                    obj2 = r73;
                    obj3 = uVar;
                    r72 = obj3;
                    obj4 = r72.f13642d;
                    if (obj4 == AbstractC0285b.f4642d) {
                        ?? obj5 = new Object();
                        tVar = obj5;
                        if (obj4 != null) {
                            Q7.t tVar3 = AbstractC0285b.f4640b;
                            Long l6 = 1000L;
                            long longValue = l6.longValue();
                            obj5.f13641d = longValue;
                            tVar = obj5;
                            if (longValue >= 0) {
                                if (longValue == 0) {
                                    Object obj6 = r72.f13642d;
                                    if (obj6 == tVar3) {
                                        obj6 = null;
                                    }
                                    this.k = interfaceC0234g;
                                    this.f4167l = obj2;
                                    this.f4165h = r72;
                                    this.f4166i = obj5;
                                    this.j = 1;
                                    if (interfaceC0234g.n(obj6, this) != enumC0646a) {
                                        tVar2 = obj5;
                                        r72.f13642d = null;
                                        tVar = tVar2;
                                    }
                                    return enumC0646a;
                                }
                            } else {
                                throw new IllegalArgumentException("Debounce timeout should not be negative");
                            }
                        }
                        uVar = r72;
                        r73 = obj2;
                        interfaceC0234g2 = interfaceC0234g;
                        InterfaceC0622h interfaceC0622h = this.f10782e;
                        o6.j.b(interfaceC0622h);
                        eVar = new T7.e(interfaceC0622h);
                        if (uVar.f13642d != null) {
                            long j = tVar.f13641d;
                            C0238k c0238k = new C0238k(interfaceC0234g2, uVar, interfaceC0617c, 0);
                            T7.b bVar = new T7.b(j);
                            T7.a aVar = T7.a.f5906l;
                            o6.y.c(3, aVar);
                            eVar.f(new T7.c(eVar, bVar, aVar, T7.g.f5926d, T7.h.f5931e, c0238k, null), false);
                        }
                        R3.r i8 = r73.i();
                        eVar.f(new T7.c(eVar, (N7.h) i8.f5082e, N7.d.f3802l, N7.e.f3803l, null, new C0239l(uVar, interfaceC0234g2, null), (InterfaceC1165d) i8.f5083f), false);
                        this.k = interfaceC0234g2;
                        this.f4167l = r73;
                        this.f4165h = uVar;
                        this.f4166i = null;
                        this.j = 2;
                        if (!(T7.e.f5920i.get(eVar) instanceof T7.c)) {
                        }
                        interfaceC0234g = interfaceC0234g2;
                        obj2 = r73;
                        obj3 = uVar;
                        r72 = obj3;
                        obj4 = r72.f13642d;
                        if (obj4 == AbstractC0285b.f4642d) {
                            return Z5.y.f7506a;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                tVar2 = this.f4166i;
                r72 = this.f4165h;
                obj2 = (N7.u) this.f4167l;
                interfaceC0234g = (InterfaceC0234g) this.k;
                Z5.a.d(obj);
                r72.f13642d = null;
                tVar = tVar2;
                uVar = r72;
                r73 = obj2;
                interfaceC0234g2 = interfaceC0234g;
                InterfaceC0622h interfaceC0622h2 = this.f10782e;
                o6.j.b(interfaceC0622h2);
                eVar = new T7.e(interfaceC0622h2);
                if (uVar.f13642d != null) {
                }
                R3.r i82 = r73.i();
                eVar.f(new T7.c(eVar, (N7.h) i82.f5082e, N7.d.f3802l, N7.e.f3803l, null, new C0239l(uVar, interfaceC0234g2, null), (InterfaceC1165d) i82.f5083f), false);
                this.k = interfaceC0234g2;
                this.f4167l = r73;
                this.f4165h = uVar;
                this.f4166i = null;
                this.j = 2;
                if (!(T7.e.f5920i.get(eVar) instanceof T7.c)) {
                }
                interfaceC0234g = interfaceC0234g2;
                obj2 = r73;
                obj3 = uVar;
                r72 = obj3;
                obj4 = r72.f13642d;
                if (obj4 == AbstractC0285b.f4642d) {
                }
            }
        } else {
            Z5.a.d(obj);
            InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.k;
            InterfaceC0234g interfaceC0234g3 = (InterfaceC0234g) this.f4167l;
            C0241n c0241n = new C0241n(this.f4169n, null);
            N7.h H2 = E2.c.H(0, 4, N7.a.f3795d);
            InterfaceC0622h j5 = AbstractC0166y.j(interfaceC0163v.p(), C0623i.f10448d, true);
            S7.e eVar2 = L7.F.f3175a;
            if (j5 != eVar2 && j5.B(C0618d.f10447d) == null) {
                j5 = j5.D(eVar2);
            }
            AbstractC0143a rVar = new N7.r(j5, H2);
            rVar.g0(EnumC0164w.f3248d, rVar, c0241n);
            interfaceC0234g = interfaceC0234g3;
            obj2 = rVar;
            obj3 = new Object();
            r72 = obj3;
            obj4 = r72.f13642d;
            if (obj4 == AbstractC0285b.f4642d) {
            }
        }
    }
}
