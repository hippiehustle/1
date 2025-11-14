package L6;

import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public int f3088a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3089b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3090c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3091d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3092e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3093f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3094g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3095h;

    public V(String str, int i4) {
        o6.j.e(str, "name");
        this.f3088a = i4;
        this.f3089b = new ArrayList(0);
        this.f3090c = new ArrayList(0);
        this.f3091d = new ArrayList(0);
        this.f3092e = new ArrayList();
        this.f3093f = new ArrayList(0);
        this.f3094g = new ArrayList(0);
        N6.k.f3794a.getClass();
        List a3 = N6.j.a();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(a3, 10));
        Iterator it = a3.iterator();
        while (it.hasNext()) {
            ((O6.d) ((N6.k) it.next())).getClass();
            arrayList.add(new Object());
        }
        this.f3095h = arrayList;
    }
}
