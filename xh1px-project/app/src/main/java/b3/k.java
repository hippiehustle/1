package b3;

import T1.C0316o;
import Z5.y;
import a6.AbstractC0436k;
import b2.r;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1167f;
import o2.C1229a;
import o6.s;

/* loaded from: classes.dex */
public final class k extends AbstractC0720j implements InterfaceC1167f {

    /* renamed from: h, reason: collision with root package name */
    public int f9156h;

    /* renamed from: i, reason: collision with root package name */
    public s f9157i;
    public List j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public n f9158l;

    /* renamed from: m, reason: collision with root package name */
    public Object f9159m;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f9160n;

    /* renamed from: o, reason: collision with root package name */
    public n2.s f9161o;

    /* renamed from: p, reason: collision with root package name */
    public C0316o f9162p;

    /* renamed from: q, reason: collision with root package name */
    public int f9163q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ List f9164r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ List f9165s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f9166t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ boolean f9167u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ N7.s f9168v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f9169w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(N7.s sVar, n nVar, AbstractC0713c abstractC0713c) {
        super(5, abstractC0713c);
        this.f9168v = sVar;
        this.f9169w = nVar;
    }

    @Override // n6.InterfaceC1167f
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0713c abstractC0713c) {
        int intValue = ((Number) obj3).intValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        k kVar = new k(this.f9168v, this.f9169w, abstractC0713c);
        kVar.f9164r = (List) obj;
        kVar.f9165s = (List) obj2;
        kVar.f9166t = intValue;
        kVar.f9167u = booleanValue;
        return kVar.v(y.f7506a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e8, code lost:
    
        if (r7 == r12) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012b, code lost:
    
        if (((N7.r) r16.f9168v).f3845g.b(r16, r1) == r12) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (r7 == r12) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, o6.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e8 -> B:13:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009d -> B:23:0x00a1). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Iterator it;
        n nVar;
        List list;
        int i4;
        s sVar;
        Iterator it2;
        s sVar2;
        List list2;
        List list3;
        int i8;
        List list4 = this.f9164r;
        List list5 = this.f9165s;
        int i9 = this.f9166t;
        boolean z8 = this.f9167u;
        int i10 = this.f9163q;
        n nVar2 = this.f9169w;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Z5.a.d(obj);
                        return y.f7506a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8 = this.f9156h;
                C0316o c0316o = this.f9162p;
                it2 = this.f9160n;
                nVar2 = (n) this.f9159m;
                list3 = this.k;
                list2 = this.j;
                sVar2 = this.f9157i;
                Z5.a.d(obj);
                Object d2 = obj;
                if (d2 == null) {
                    list3.remove(c0316o);
                    sVar2.f13640d++;
                }
                if (!it2.hasNext()) {
                    c0316o = (C0316o) it2.next();
                    r rVar = nVar2.f9178d;
                    this.f9164r = null;
                    this.f9165s = null;
                    this.f9157i = sVar2;
                    this.j = list2;
                    this.k = list3;
                    this.f9158l = null;
                    this.f9159m = nVar2;
                    this.f9160n = it2;
                    this.f9161o = null;
                    this.f9162p = c0316o;
                    this.f9166t = i9;
                    this.f9167u = z8;
                    this.f9156h = i8;
                    this.f9163q = 2;
                    d2 = rVar.d(c0316o, this);
                } else {
                    C0530a c0530a = new C0530a(list3.size() + list2.size(), sVar2.f13640d, z8);
                    this.f9164r = null;
                    this.f9165s = null;
                    this.f9157i = null;
                    this.j = null;
                    this.k = null;
                    this.f9158l = null;
                    this.f9159m = null;
                    this.f9160n = null;
                    this.f9161o = null;
                    this.f9162p = null;
                    this.f9166t = i9;
                    this.f9167u = z8;
                    this.f9163q = 3;
                }
                return enumC0646a;
            }
            i4 = this.f9156h;
            n2.s sVar3 = this.f9161o;
            it = (Iterator) this.f9159m;
            nVar = this.f9158l;
            list = this.j;
            sVar = this.f9157i;
            Z5.a.d(obj);
            Object c6 = obj;
            if (c6 == null) {
                list.remove(sVar3);
                sVar.f13640d++;
            }
            if (!it.hasNext()) {
                sVar3 = (n2.s) it.next();
                C1229a c1229a = nVar.f9176b;
                this.f9164r = null;
                this.f9165s = list5;
                this.f9157i = sVar;
                this.j = list;
                this.k = null;
                this.f9158l = nVar;
                this.f9159m = it;
                this.f9160n = null;
                this.f9161o = sVar3;
                this.f9166t = i9;
                this.f9167u = z8;
                this.f9156h = i4;
                this.f9163q = 1;
                c6 = c1229a.f13440a.c(sVar3, null, this);
            } else {
                ArrayList S02 = AbstractC0436k.S0(list5);
                it2 = list5.iterator();
                sVar2 = sVar;
                list2 = list;
                list3 = S02;
                i8 = 0;
                if (!it2.hasNext()) {
                }
                return enumC0646a;
            }
        } else {
            Z5.a.d(obj);
            ?? obj2 = new Object();
            obj2.f13640d = i9;
            ArrayList S03 = AbstractC0436k.S0(list4);
            it = list4.iterator();
            nVar = nVar2;
            list = S03;
            i4 = 0;
            sVar = obj2;
            if (!it.hasNext()) {
            }
        }
    }
}
