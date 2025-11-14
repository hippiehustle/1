package X7;

import a6.s;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7048a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7049b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f7050c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7051d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7052e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7053f;

    public a(String str) {
        o6.j.e(str, "serialName");
        this.f7048a = str;
        this.f7049b = new ArrayList();
        this.f7050c = new HashSet();
        this.f7051d = new ArrayList();
        this.f7052e = new ArrayList();
        this.f7053f = new ArrayList();
    }

    public static void a(a aVar, String str, f fVar) {
        aVar.getClass();
        o6.j.e(fVar, "descriptor");
        if (aVar.f7050c.add(str)) {
            aVar.f7049b.add(str);
            aVar.f7051d.add(fVar);
            aVar.f7052e.add(s.f7766d);
            aVar.f7053f.add(false);
            return;
        }
        StringBuilder s8 = A.j.s("Element with name '", str, "' is already registered in ");
        s8.append(aVar.f7048a);
        throw new IllegalArgumentException(s8.toString().toString());
    }
}
