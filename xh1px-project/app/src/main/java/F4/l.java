package F4;

import L7.InterfaceC0163v;
import S1.F;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public List f1397h;

    /* renamed from: i, reason: collision with root package name */
    public s f1398i;
    public Iterator j;
    public Collection k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f1399l;

    /* renamed from: m, reason: collision with root package name */
    public Object f1400m;

    /* renamed from: n, reason: collision with root package name */
    public int f1401n;

    /* renamed from: o, reason: collision with root package name */
    public int f1402o;

    /* renamed from: p, reason: collision with root package name */
    public int f1403p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ s f1404q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0999a f1406s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, int i4, C0999a c0999a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f1404q = sVar;
        this.f1405r = i4;
        this.f1406s = c0999a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new l(this.f1404q, this.f1405r, this.f1406s, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        if (r15.H(r7, r14) == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        if (r15 == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005a, code lost:
    
        if (r15 == r6) goto L55;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0133 -> B:9:0x0138). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bb -> B:27:0x00bf). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        List arrayList;
        Iterator it;
        int i4;
        s sVar;
        int i8;
        List list;
        Collection arrayList2;
        Iterator it2;
        int i9;
        s sVar2;
        int i10;
        int i11;
        Object obj2;
        int i12 = this.f1403p;
        y yVar = y.f7506a;
        C0999a c0999a = this.f1406s;
        int i13 = 0;
        s sVar3 = this.f1404q;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        switch (i12) {
            case 0:
                Z5.a.d(obj);
                this.f1403p = 1;
                obj = s.a(sVar3, this.f1405r, this);
                break;
            case 1:
                Z5.a.d(obj);
                if (!o6.j.a((C0999a) obj, c0999a)) {
                    Objects.toString(c0999a);
                    arrayList = new ArrayList();
                    S1.w q6 = sVar3.f1424a.q();
                    long j = c0999a.f12187a;
                    this.f1397h = arrayList;
                    this.f1403p = 2;
                    obj = q6.A(j, this);
                    break;
                }
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                arrayList = this.f1397h;
                Z5.a.d(obj);
                it = ((Iterable) obj).iterator();
                i4 = 0;
                sVar = sVar3;
                if (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    S1.p p8 = sVar.f1424a.p();
                    this.f1397h = arrayList;
                    this.f1398i = sVar;
                    this.j = it;
                    this.k = null;
                    this.f1401n = i4;
                    this.f1402o = 0;
                    this.f1403p = 3;
                    Object k = p8.k(longValue, this);
                    if (k != enumC0646a) {
                        List list2 = arrayList;
                        i8 = i4;
                        obj = k;
                        list = list2;
                        for (String str : (Iterable) obj) {
                            if (!list.contains(str)) {
                                list.add(str);
                            }
                        }
                        i4 = i8;
                        arrayList = list;
                        if (it.hasNext()) {
                            F r8 = sVar3.f1424a.r();
                            long j5 = c0999a.f12187a;
                            this.f1397h = arrayList;
                            this.f1398i = null;
                            this.j = null;
                            this.k = null;
                            this.f1403p = 4;
                            break;
                        }
                    }
                }
                return enumC0646a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                i8 = this.f1401n;
                it = this.j;
                sVar = this.f1398i;
                list = this.f1397h;
                Z5.a.d(obj);
                while (r15.hasNext()) {
                }
                i4 = i8;
                arrayList = list;
                if (it.hasNext()) {
                }
                return enumC0646a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                arrayList = this.f1397h;
                Z5.a.d(obj);
                arrayList2 = new ArrayList();
                it2 = arrayList.iterator();
                i9 = 0;
                sVar2 = sVar3;
                if (it2.hasNext()) {
                    Object next = it2.next();
                    S1.p p9 = sVar2.f1424a.p();
                    this.f1397h = null;
                    this.f1398i = sVar2;
                    this.j = null;
                    this.k = arrayList2;
                    this.f1399l = it2;
                    this.f1400m = next;
                    this.f1401n = i13;
                    this.f1402o = i9;
                    this.f1403p = 5;
                    Object n3 = p9.n((String) next, this);
                    if (n3 != enumC0646a) {
                        i10 = i9;
                        obj = n3;
                        i11 = i13;
                        obj2 = next;
                        if (((Number) obj).intValue() == 0) {
                            arrayList2.add(obj2);
                        }
                        i9 = i10;
                        i13 = i11;
                        if (it2.hasNext()) {
                            q1.e eVar = sVar3.f1425b;
                            this.f1397h = null;
                            this.f1398i = null;
                            this.j = null;
                            this.k = null;
                            this.f1399l = null;
                            this.f1400m = null;
                            this.f1403p = 6;
                            Object y4 = eVar.f13924b.y((List) arrayList2, this);
                            if (y4 != enumC0646a) {
                                y4 = yVar;
                            }
                            if (y4 != enumC0646a) {
                                return yVar;
                            }
                        }
                    }
                }
                return enumC0646a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                i10 = this.f1402o;
                i11 = this.f1401n;
                obj2 = this.f1400m;
                it2 = this.f1399l;
                arrayList2 = this.k;
                sVar2 = this.f1398i;
                Z5.a.d(obj);
                if (((Number) obj).intValue() == 0) {
                }
                i9 = i10;
                i13 = i11;
                if (it2.hasNext()) {
                }
                return enumC0646a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Z5.a.d(obj);
                return yVar;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
