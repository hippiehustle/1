package w7;

import java.util.Iterator;
import java.util.List;
import t0.C1536c;

/* loaded from: classes.dex */
public final class G extends C7.d {

    /* renamed from: e, reason: collision with root package name */
    public static final C1536c f15953e = new C1536c(17);

    /* renamed from: f, reason: collision with root package name */
    public static final G f15954f = new G(a6.s.f7766d);

    /* JADX WARN: Type inference failed for: r5v1, types: [C7.c, C7.a, java.lang.Object] */
    public G(List list) {
        this.f791d = C7.k.f808d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1745g c1745g = (C1745g) it.next();
            c1745g.getClass();
            String a3 = o6.v.f13643a.b(C1745g.class).a();
            o6.j.b(a3);
            int l6 = f15953e.l(a3);
            int g8 = this.f791d.g();
            if (g8 != 0) {
                if (g8 == 1) {
                    C7.a aVar = this.f791d;
                    try {
                        o6.j.c(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        C7.q qVar = (C7.q) aVar;
                        int i4 = qVar.f820e;
                        if (i4 == l6) {
                            this.f791d = new C7.q(l6, c1745g);
                        } else {
                            ?? obj = new Object();
                            obj.f789d = new Object[20];
                            obj.f790e = 0;
                            obj.h(i4, qVar.f819d);
                            this.f791d = obj;
                        }
                    } catch (ClassCastException e9) {
                        throw new IllegalStateException(C7.d.g(aVar, 1, "OneElementArrayMap"), e9);
                    }
                }
                this.f791d.h(l6, c1745g);
            } else {
                C7.a aVar2 = this.f791d;
                if (aVar2 instanceof C7.k) {
                    this.f791d = new C7.q(l6, c1745g);
                } else {
                    throw new IllegalStateException(C7.d.g(aVar2, 0, "EmptyArrayMap"));
                }
            }
        }
    }
}
