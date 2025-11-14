package Z6;

import P6.w;
import Y6.l;
import Y6.n;
import f7.C0722b;
import f7.C0723c;
import java.security.AccessControlException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f7530l;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f7531m;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7532d;

    /* renamed from: e, reason: collision with root package name */
    public String f7533e;

    /* renamed from: f, reason: collision with root package name */
    public int f7534f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f7535g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f7536h;

    /* renamed from: i, reason: collision with root package name */
    public String[] f7537i;
    public a j;
    public String[] k;

    static {
        try {
            f7530l = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f7530l = false;
        }
        HashMap hashMap = new HashMap();
        f7531m = hashMap;
        hashMap.put(E2.c.D0(new C0723c("kotlin.jvm.internal.KotlinClass")), a.CLASS);
        hashMap.put(E2.c.D0(new C0723c("kotlin.jvm.internal.KotlinFileFacade")), a.FILE_FACADE);
        hashMap.put(E2.c.D0(new C0723c("kotlin.jvm.internal.KotlinMultifileClass")), a.MULTIFILE_CLASS);
        hashMap.put(E2.c.D0(new C0723c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.MULTIFILE_CLASS_PART);
        hashMap.put(E2.c.D0(new C0723c("kotlin.jvm.internal.KotlinSyntheticClass")), a.SYNTHETIC_CLASS);
    }

    @Override // Y6.n
    public final l a(C0722b c0722b, H6.a aVar) {
        a aVar2;
        C0723c a3 = c0722b.a();
        if (a3.equals(w.f4597a)) {
            return new d(this, 0);
        }
        if (a3.equals(w.f4609o)) {
            return new W5.a(7, this);
        }
        if (!f7530l && this.j == null && (aVar2 = (a) f7531m.get(c0722b)) != null) {
            this.j = aVar2;
            return new d(this, 1);
        }
        return null;
    }
}
