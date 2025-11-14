package y6;

import P6.w;
import a6.AbstractC0437l;
import f7.C0722b;
import f7.C0723c;
import java.util.LinkedHashSet;
import java.util.List;
import o6.j;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1841a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f16513a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0722b f16514b;

    static {
        List<C0723c> X8 = AbstractC0437l.X(w.f4597a, w.f4604h, w.f4605i, w.f4599c, w.f4600d, w.f4602f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C0723c c0723c : X8) {
            j.e(c0723c, "topLevelFqName");
            linkedHashSet.add(new C0722b(c0723c.b(), c0723c.f10797a.f()));
        }
        f16513a = linkedHashSet;
        C0723c c0723c2 = w.f4603g;
        j.d(c0723c2, "REPEATABLE_ANNOTATION");
        f16514b = new C0722b(c0723c2.b(), c0723c2.f10797a.f());
    }
}
