package b3;

import L7.InterfaceC0163v;
import N7.s;
import S1.F;
import T1.C0316o;
import Z5.y;
import android.graphics.Point;
import android.net.Uri;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public R.g f9136h;

    /* renamed from: i, reason: collision with root package name */
    public List f9137i;
    public n j;
    public n k;

    /* renamed from: l, reason: collision with root package name */
    public Collection f9138l;

    /* renamed from: m, reason: collision with root package name */
    public Collection f9139m;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f9140n;

    /* renamed from: o, reason: collision with root package name */
    public Iterator f9141o;

    /* renamed from: p, reason: collision with root package name */
    public int f9142p;

    /* renamed from: q, reason: collision with root package name */
    public int f9143q;

    /* renamed from: r, reason: collision with root package name */
    public int f9144r;

    /* renamed from: s, reason: collision with root package name */
    public int f9145s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f9146t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f9147u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f9148v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Uri f9149w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Point f9150x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f9151y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, List list, List list2, Uri uri, Point point, s sVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9146t = nVar;
        this.f9147u = list;
        this.f9148v = list2;
        this.f9149w = uri;
        this.f9150x = point;
        this.f9151y = sVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new i(this.f9146t, this.f9147u, this.f9148v, this.f9149w, this.f9150x, this.f9151y, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x010b, code lost:
    
        if (r4 == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x014f, code lost:
    
        if (r12.l(r16.f9149w, r9, r11, r16.f9150x, r5, r16) == r8) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.util.Iterator, java.util.Collection, b3.n] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x010b -> B:13:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b5 -> B:24:0x00b7). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        R.g gVar;
        n nVar;
        Collection arrayList;
        Iterator it;
        int i4;
        int i8;
        int i9;
        ArrayList arrayList2;
        Iterator it2;
        List list;
        R.g gVar2;
        int i10;
        int i11;
        int i12;
        int i13 = this.f9145s;
        n nVar2 = this.f9146t;
        ?? r72 = 0;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        Z5.a.d(obj);
                        return y.f7506a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = this.f9144r;
                int i15 = this.f9143q;
                int i16 = this.f9142p;
                it2 = this.f9141o;
                ?? r9 = this.f9139m;
                n nVar3 = this.k;
                list = this.f9137i;
                gVar2 = this.f9136h;
                Z5.a.d(obj);
                i11 = i15;
                nVar2 = nVar3;
                i12 = i14;
                i10 = i16;
                Object I8 = obj;
                ArrayList arrayList3 = r9;
                C0316o c0316o = (C0316o) I8;
                arrayList2 = arrayList3;
                if (c0316o != null) {
                    arrayList3.add(c0316o);
                    arrayList2 = arrayList3;
                }
                if (!it2.hasNext()) {
                    long longValue = ((Number) it2.next()).longValue();
                    F r8 = nVar2.f9177c.r();
                    this.f9136h = gVar2;
                    this.f9137i = list;
                    this.j = null;
                    this.k = nVar2;
                    this.f9138l = null;
                    this.f9139m = arrayList2;
                    this.f9140n = null;
                    this.f9141o = it2;
                    this.f9142p = i10;
                    this.f9143q = i11;
                    this.f9144r = i12;
                    this.f9145s = 2;
                    I8 = r8.I(longValue, this);
                    arrayList3 = arrayList2;
                } else {
                    s sVar = this.f9151y;
                    A4.a aVar = new A4.a(new f(sVar, null, 0), new g(sVar, null), new h(sVar, null, 0), null);
                    this.f9136h = null;
                    this.f9137i = null;
                    this.j = null;
                    this.k = null;
                    this.f9138l = null;
                    this.f9139m = null;
                    this.f9140n = null;
                    this.f9141o = null;
                    this.f9145s = 3;
                }
                return enumC0646a;
            }
            int i17 = this.f9144r;
            i8 = this.f9143q;
            i9 = this.f9142p;
            it = this.f9140n;
            arrayList = this.f9138l;
            nVar = this.j;
            gVar = this.f9136h;
            Z5.a.d(obj);
            int i18 = i17;
            Object C8 = obj;
            n2.s sVar2 = (n2.s) C8;
            if (sVar2 != null) {
                arrayList.add(sVar2);
            }
            i4 = i18;
            r72 = 0;
            if (it.hasNext()) {
                long longValue2 = ((Number) it.next()).longValue();
                n2.j o7 = nVar.f9175a.o();
                this.f9136h = gVar;
                this.f9137i = r72;
                this.j = nVar;
                this.k = r72;
                this.f9138l = arrayList;
                this.f9139m = r72;
                this.f9140n = it;
                this.f9141o = r72;
                this.f9142p = i9;
                this.f9143q = i8;
                this.f9144r = i4;
                this.f9145s = 1;
                int i19 = i4;
                C8 = D2.f.C(this, new n2.h(longValue2, o7, 2), o7.f12901a, true, true);
                if (C8 != enumC0646a) {
                    i18 = i19;
                    n2.s sVar22 = (n2.s) C8;
                    if (sVar22 != null) {
                    }
                    i4 = i18;
                    r72 = 0;
                    if (it.hasNext()) {
                        arrayList2 = new ArrayList();
                        it2 = this.f9148v.iterator();
                        list = (List) arrayList;
                        gVar2 = gVar;
                        i10 = 0;
                        i11 = 0;
                        i12 = 0;
                        if (!it2.hasNext()) {
                        }
                    }
                }
                return enumC0646a;
            }
        } else {
            Z5.a.d(obj);
            R.g gVar3 = nVar2.f9179e;
            gVar = gVar3;
            nVar = nVar2;
            arrayList = new ArrayList();
            it = this.f9147u.iterator();
            i4 = 0;
            i8 = 0;
            i9 = 0;
            if (it.hasNext()) {
            }
        }
    }
}
