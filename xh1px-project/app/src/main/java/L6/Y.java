package L6;

import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public int f3108a;

    /* renamed from: b, reason: collision with root package name */
    public D2.f f3109b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3110c = new ArrayList(0);

    /* renamed from: d, reason: collision with root package name */
    public Y f3111d;

    /* renamed from: e, reason: collision with root package name */
    public Y f3112e;

    /* renamed from: f, reason: collision with root package name */
    public U f3113f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3114g;

    public Y(int i4) {
        this.f3108a = i4;
        N6.k.f3794a.getClass();
        List a3 = N6.j.a();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(a3, 10));
        Iterator it = a3.iterator();
        while (it.hasNext()) {
            ((O6.d) ((N6.k) it.next())).getClass();
            arrayList.add(new O6.f());
        }
        this.f3114g = arrayList;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (Y.class.equals(cls)) {
                o6.j.c(obj, "null cannot be cast to non-null type kotlin.metadata.KmType");
                Y y4 = (Y) obj;
                if (this.f3108a == y4.f3108a) {
                    D2.f fVar = this.f3109b;
                    if (fVar != null) {
                        D2.f fVar2 = y4.f3109b;
                        if (fVar2 != null) {
                            if (!fVar.equals(fVar2) || !o6.j.a(this.f3110c, y4.f3110c) || !o6.j.a(this.f3112e, y4.f3112e) || !o6.j.a(this.f3111d, y4.f3111d) || !o6.j.a(this.f3113f, y4.f3113f) || !o6.j.a(this.f3114g, y4.f3114g)) {
                                return false;
                            }
                            return true;
                        }
                        o6.j.i("classifier");
                        throw null;
                    }
                    o6.j.i("classifier");
                    throw null;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = this.f3108a * 31;
        D2.f fVar = this.f3109b;
        if (fVar != null) {
            return this.f3110c.hashCode() + ((fVar.hashCode() + i4) * 31);
        }
        o6.j.i("classifier");
        throw null;
    }
}
