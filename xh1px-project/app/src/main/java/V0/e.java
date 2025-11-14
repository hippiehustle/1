package V0;

import N0.C0202j;
import R3.r;
import java.util.List;
import java.util.Locale;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f6256a;

    /* renamed from: b, reason: collision with root package name */
    public final C0202j f6257b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6258c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6259d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6260e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6261f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6262g;

    /* renamed from: h, reason: collision with root package name */
    public final List f6263h;

    /* renamed from: i, reason: collision with root package name */
    public final T0.d f6264i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6265l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6266m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6267n;

    /* renamed from: o, reason: collision with root package name */
    public final float f6268o;

    /* renamed from: p, reason: collision with root package name */
    public final float f6269p;

    /* renamed from: q, reason: collision with root package name */
    public final T0.a f6270q;

    /* renamed from: r, reason: collision with root package name */
    public final r f6271r;

    /* renamed from: s, reason: collision with root package name */
    public final T0.b f6272s;

    /* renamed from: t, reason: collision with root package name */
    public final List f6273t;

    /* renamed from: u, reason: collision with root package name */
    public final int f6274u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f6275v;

    /* renamed from: w, reason: collision with root package name */
    public final W0.d f6276w;

    /* renamed from: x, reason: collision with root package name */
    public final A4.d f6277x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6278y;

    public e(List list, C0202j c0202j, String str, long j, int i4, long j5, String str2, List list2, T0.d dVar, int i8, int i9, int i10, float f8, float f9, float f10, float f11, T0.a aVar, r rVar, List list3, int i11, T0.b bVar, boolean z8, W0.d dVar2, A4.d dVar3, int i12) {
        this.f6256a = list;
        this.f6257b = c0202j;
        this.f6258c = str;
        this.f6259d = j;
        this.f6260e = i4;
        this.f6261f = j5;
        this.f6262g = str2;
        this.f6263h = list2;
        this.f6264i = dVar;
        this.j = i8;
        this.k = i9;
        this.f6265l = i10;
        this.f6266m = f8;
        this.f6267n = f9;
        this.f6268o = f10;
        this.f6269p = f11;
        this.f6270q = aVar;
        this.f6271r = rVar;
        this.f6273t = list3;
        this.f6274u = i11;
        this.f6272s = bVar;
        this.f6275v = z8;
        this.f6276w = dVar2;
        this.f6277x = dVar3;
        this.f6278y = i12;
    }

    public final String a(String str) {
        int i4;
        StringBuilder a3 = AbstractC1769h.a(str);
        a3.append(this.f6258c);
        a3.append("\n");
        long j = this.f6261f;
        C0202j c0202j = this.f6257b;
        e eVar = (e) c0202j.f3609i.c(j);
        if (eVar != null) {
            a3.append("\t\tParents: ");
            a3.append(eVar.f6258c);
            for (e eVar2 = (e) c0202j.f3609i.c(eVar.f6261f); eVar2 != null; eVar2 = (e) c0202j.f3609i.c(eVar2.f6261f)) {
                a3.append("->");
                a3.append(eVar2.f6258c);
            }
            a3.append(str);
            a3.append("\n");
        }
        List list = this.f6263h;
        if (!list.isEmpty()) {
            a3.append(str);
            a3.append("\tMasks: ");
            a3.append(list.size());
            a3.append("\n");
        }
        int i8 = this.j;
        if (i8 != 0 && (i4 = this.k) != 0) {
            a3.append(str);
            a3.append("\tBackground: ");
            a3.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(this.f6265l)));
        }
        List list2 = this.f6256a;
        if (!list2.isEmpty()) {
            a3.append(str);
            a3.append("\tShapes:\n");
            for (Object obj : list2) {
                a3.append(str);
                a3.append("\t\t");
                a3.append(obj);
                a3.append("\n");
            }
        }
        return a3.toString();
    }

    public final String toString() {
        return a("");
    }
}
