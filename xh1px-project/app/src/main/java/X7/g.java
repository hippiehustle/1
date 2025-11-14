package X7;

import H7.q;
import Z5.n;
import Z7.InterfaceC0389j;
import Z7.Q;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.s;
import a6.v;
import a6.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q4.X;

/* loaded from: classes.dex */
public final class g implements f, InterfaceC0389j {

    /* renamed from: a, reason: collision with root package name */
    public final String f7062a;

    /* renamed from: b, reason: collision with root package name */
    public final X f7063b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7064c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f7065d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f7066e;

    /* renamed from: f, reason: collision with root package name */
    public final f[] f7067f;

    /* renamed from: g, reason: collision with root package name */
    public final List[] f7068g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f7069h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f7070i;
    public final f[] j;
    public final n k;

    public g(String str, X x8, int i4, List list, a aVar) {
        o6.j.e(str, "serialName");
        this.f7062a = str;
        this.f7063b = x8;
        this.f7064c = i4;
        ArrayList arrayList = aVar.f7049b;
        o6.j.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(x.N0(AbstractC0438m.d0(arrayList, 12)));
        AbstractC0436k.O0(arrayList, hashSet);
        this.f7065d = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f7066e = strArr;
        this.f7067f = Q.c(aVar.f7051d);
        this.f7068g = (List[]) aVar.f7052e.toArray(new List[0]);
        this.f7069h = AbstractC0436k.N0(aVar.f7053f);
        o6.j.e(strArr, "<this>");
        q qVar = new q(3, new B0.e(14, strArr));
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(qVar, 10));
        Iterator it = qVar.iterator();
        while (true) {
            H7.b bVar = (H7.b) it;
            if (bVar.f2047e.hasNext()) {
                v vVar = (v) bVar.next();
                arrayList2.add(new Z5.j(vVar.f7770b, Integer.valueOf(vVar.f7769a)));
            } else {
                this.f7070i = x.R0(arrayList2);
                this.j = Q.c(list);
                this.k = new n(new B0.e(12, this));
                return;
            }
        }
    }

    @Override // X7.f
    public final int a(String str) {
        o6.j.e(str, "name");
        Integer num = (Integer) this.f7070i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // X7.f
    public final String b() {
        return this.f7062a;
    }

    @Override // X7.f
    public final int c() {
        return this.f7064c;
    }

    @Override // X7.f
    public final String d(int i4) {
        return this.f7066e[i4];
    }

    @Override // X7.f
    public final X e() {
        return this.f7063b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                f fVar = (f) obj;
                if (o6.j.a(this.f7062a, fVar.b()) && Arrays.equals(this.j, ((g) obj).j)) {
                    int c6 = fVar.c();
                    int i4 = this.f7064c;
                    if (i4 == c6) {
                        for (int i8 = 0; i8 < i4; i8++) {
                            f[] fVarArr = this.f7067f;
                            if (o6.j.a(fVarArr[i8].b(), fVar.j(i8).b()) && o6.j.a(fVarArr[i8].e(), fVar.j(i8).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // Z7.InterfaceC0389j
    public final Set f() {
        return this.f7065d;
    }

    @Override // X7.f
    public final boolean g() {
        return false;
    }

    @Override // X7.f
    public final List getAnnotations() {
        return s.f7766d;
    }

    @Override // X7.f
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // X7.f
    public final List i(int i4) {
        return this.f7068g[i4];
    }

    @Override // X7.f
    public final f j(int i4) {
        return this.f7067f[i4];
    }

    @Override // X7.f
    public final boolean k(int i4) {
        return this.f7069h[i4];
    }

    public final String toString() {
        return Q.h(this);
    }
}
