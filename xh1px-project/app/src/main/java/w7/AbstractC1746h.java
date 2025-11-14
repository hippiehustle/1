package w7;

import t0.C1536c;
import u6.InterfaceC1642c;

/* renamed from: w7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1746h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15995a;

    /* renamed from: b, reason: collision with root package name */
    public static final C7.p f15996b;

    /* JADX WARN: Type inference failed for: r2v3, types: [C7.p, java.lang.Object] */
    static {
        o6.p pVar = new o6.p(AbstractC1746h.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        o6.w wVar = o6.v.f13643a;
        f15995a = new u6.s[]{wVar.f(pVar)};
        C1536c c1536c = G.f15953e;
        InterfaceC1642c b4 = wVar.b(C1745g.class);
        c1536c.getClass();
        String a3 = b4.a();
        o6.j.b(a3);
        int l6 = c1536c.l(a3);
        ?? obj = new Object();
        obj.f818a = l6;
        f15996b = obj;
    }

    public static final D6.j a(G g8) {
        D6.j jVar;
        o6.j.e(g8, "<this>");
        u6.s sVar = f15995a[0];
        C7.p pVar = f15996b;
        pVar.getClass();
        o6.j.e(sVar, "property");
        C1745g c1745g = (C1745g) g8.f791d.get(pVar.f818a);
        if (c1745g != null && (jVar = c1745g.f15994a) != null) {
            return jVar;
        }
        return D6.i.f1043a;
    }
}
