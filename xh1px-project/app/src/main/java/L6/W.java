package L6;

import a6.AbstractC0438m;
import c7.AbstractC0586e;
import c7.C0583b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f3096l;

    /* renamed from: a, reason: collision with root package name */
    public int f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3098b;

    /* renamed from: c, reason: collision with root package name */
    public final X f3099c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3100d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3101e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3102f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3103g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3104h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3105i;
    public final ArrayList j;
    public final ArrayList k;

    static {
        o6.m mVar = new o6.m(W.class, "_hasSetter", "get_hasSetter()Z", 0);
        o6.w wVar = o6.v.f13643a;
        f3096l = new u6.s[]{wVar.d(mVar), A.j.u(W.class, "_hasGetter", "get_hasGetter()Z", 0, wVar)};
    }

    public W(int i4, int i8, int i9, String str) {
        int i10;
        X x8;
        o6.j.e(str, "name");
        this.f3097a = i4;
        C0583b c0583b = AbstractC0586e.f9682A;
        o6.j.d(c0583b, "HAS_SETTER");
        M6.h hVar = new M6.h(c0583b);
        M6.e eVar = M6.e.k;
        int i11 = hVar.f3495b;
        if (i11 == 1 && (i10 = hVar.f3496c) == 1) {
            C0583b c0583b2 = AbstractC0586e.f9720z;
            o6.j.d(c0583b2, "HAS_GETTER");
            M6.h hVar2 = new M6.h(c0583b2);
            if (hVar2.f3495b == 1 && hVar2.f3496c == 1) {
                int i12 = 1 << hVar2.f3494a;
                X x9 = new X(i8);
                u6.s[] sVarArr = f3096l;
                o6.j.e(sVarArr[1], "property");
                eVar.e(this, Integer.valueOf(i12 | ((Number) eVar.get(this)).intValue()));
                this.f3098b = x9;
                o6.j.e(sVarArr[0], "property");
                if (((((Number) eVar.get(this)).intValue() >>> hVar.f3494a) & ((1 << i11) - 1)) == i10) {
                    x8 = new X(i9);
                } else {
                    x8 = null;
                }
                this.f3099c = x8;
                this.f3100d = new ArrayList(0);
                this.f3101e = new ArrayList(0);
                this.f3102f = new ArrayList(0);
                this.f3103g = new ArrayList(0);
                this.f3104h = new ArrayList(0);
                this.f3105i = new ArrayList(0);
                this.j = new ArrayList(0);
                N6.k.f3794a.getClass();
                List a3 = N6.j.a();
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(a3, 10));
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    ((O6.d) ((N6.k) it.next())).getClass();
                    arrayList.add(new Object());
                }
                this.k = arrayList;
                return;
            }
            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar2, " was passed").toString());
        }
        throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
    }
}
