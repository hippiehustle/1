package X;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* renamed from: X.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343k extends AbstractC0720j implements InterfaceC1163b {

    /* renamed from: h, reason: collision with root package name */
    public Object f6747h;

    /* renamed from: i, reason: collision with root package name */
    public Serializable f6748i;
    public Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f6749l;

    /* renamed from: m, reason: collision with root package name */
    public int f6750m;

    /* renamed from: n, reason: collision with root package name */
    public int f6751n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H f6752o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ A4.a f6753p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0343k(H h8, A4.a aVar, InterfaceC0617c interfaceC0617c) {
        super(1, interfaceC0617c);
        this.f6752o = h8;
        this.f6753p = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        return new C0343k(this.f6752o, this.f6753p, (InterfaceC0617c) obj).v(Z5.y.f7506a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ff, code lost:
    
        if (r14 != r8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Type inference failed for: r0v2, types: [o6.u] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [o6.u] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7, types: [o6.u] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        U7.a cVar;
        ?? r9;
        o6.r rVar;
        ?? r02;
        U7.a aVar;
        Iterator it;
        U7.a aVar2;
        o6.r rVar2;
        o6.u uVar;
        C0342j c0342j;
        o6.r rVar3;
        o6.u uVar2;
        o6.r rVar4;
        Object obj2;
        int i4;
        int i8;
        int i9 = this.f6751n;
        A4.a aVar3 = this.f6753p;
        H h8 = this.f6752o;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            i8 = this.f6750m;
                            obj2 = this.f6747h;
                            Z5.a.d(obj);
                            return new C0334b(obj2, i8, ((Number) obj).intValue());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (U7.a) this.j;
                    uVar2 = (o6.u) this.f6748i;
                    rVar4 = (o6.r) this.f6747h;
                    Z5.a.d(obj);
                    try {
                        rVar4.f13639d = true;
                        aVar.a(null);
                        obj2 = uVar2.f13642d;
                        if (obj2 == null) {
                            i4 = obj2.hashCode();
                        } else {
                            i4 = 0;
                        }
                        i8 = i4;
                        b0 h9 = h8.h();
                        this.f6747h = obj2;
                        this.f6748i = null;
                        this.j = null;
                        this.f6750m = i8;
                        this.f6751n = 4;
                        obj = h9.a();
                    } catch (Throwable th) {
                        aVar.a(null);
                        throw th;
                    }
                } else {
                    it = this.f6749l;
                    c0342j = (C0342j) this.k;
                    uVar = (o6.u) this.j;
                    rVar2 = (o6.r) this.f6748i;
                    aVar2 = (U7.a) this.f6747h;
                    Z5.a.d(obj);
                    while (it.hasNext()) {
                        InterfaceC1164c interfaceC1164c = (InterfaceC1164c) it.next();
                        this.f6747h = aVar2;
                        this.f6748i = rVar2;
                        this.j = uVar;
                        this.k = c0342j;
                        this.f6749l = it;
                        this.f6751n = 2;
                        if (interfaceC1164c.l(c0342j, this) == enumC0646a) {
                            break;
                        }
                    }
                    r9 = uVar;
                    rVar3 = rVar2;
                    aVar = aVar2;
                    aVar3.f282g = null;
                    this.f6747h = rVar3;
                    this.f6748i = r9;
                    this.j = aVar;
                    this.k = null;
                    this.f6749l = null;
                    this.f6751n = 3;
                    if (aVar.d(this) != enumC0646a) {
                        uVar2 = r9;
                        rVar4 = rVar3;
                        rVar4.f13639d = true;
                        aVar.a(null);
                        obj2 = uVar2.f13642d;
                        if (obj2 == null) {
                        }
                        i8 = i4;
                        b0 h92 = h8.h();
                        this.f6747h = obj2;
                        this.f6748i = null;
                        this.j = null;
                        this.f6750m = i8;
                        this.f6751n = 4;
                        obj = h92.a();
                    }
                    return enumC0646a;
                }
            } else {
                o6.u uVar3 = (o6.u) this.k;
                r9 = (o6.u) this.j;
                o6.r rVar5 = (o6.r) this.f6748i;
                cVar = (U7.a) this.f6747h;
                Z5.a.d(obj);
                r02 = uVar3;
                rVar = rVar5;
            }
        } else {
            Z5.a.d(obj);
            cVar = new U7.c();
            ?? obj3 = new Object();
            Object obj4 = new Object();
            this.f6747h = cVar;
            this.f6748i = obj3;
            this.j = obj4;
            this.k = obj4;
            this.f6751n = 1;
            obj = H.f(h8, true, this);
            if (obj != enumC0646a) {
                r9 = obj4;
                r02 = obj4;
                rVar = obj3;
            }
            return enumC0646a;
        }
        r02.f13642d = ((C0334b) obj).f6711b;
        C0342j c0342j2 = new C0342j(cVar, rVar, r9, h8);
        List list = (List) aVar3.f282g;
        if (list != null) {
            it = list.iterator();
            aVar2 = cVar;
            rVar2 = rVar;
            uVar = r9;
            c0342j = c0342j2;
            while (it.hasNext()) {
            }
            r9 = uVar;
            rVar3 = rVar2;
            aVar = aVar2;
            aVar3.f282g = null;
            this.f6747h = rVar3;
            this.f6748i = r9;
            this.j = aVar;
            this.k = null;
            this.f6749l = null;
            this.f6751n = 3;
            if (aVar.d(this) != enumC0646a) {
            }
            return enumC0646a;
        }
        aVar = cVar;
        rVar3 = rVar;
        aVar3.f282g = null;
        this.f6747h = rVar3;
        this.f6748i = r9;
        this.j = aVar;
        this.k = null;
        this.f6749l = null;
        this.f6751n = 3;
        if (aVar.d(this) != enumC0646a) {
        }
        return enumC0646a;
    }
}
