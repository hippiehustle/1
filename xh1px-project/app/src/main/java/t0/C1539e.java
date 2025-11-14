package t0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539e {

    /* renamed from: h, reason: collision with root package name */
    public static final M.m f14831h = new M.m();

    /* renamed from: a, reason: collision with root package name */
    public final g0.L f14832a;

    /* renamed from: b, reason: collision with root package name */
    public final C1536c f14833b;

    /* renamed from: e, reason: collision with root package name */
    public List f14836e;

    /* renamed from: g, reason: collision with root package name */
    public int f14838g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f14835d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f14837f = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public final M.m f14834c = f14831h;

    public C1539e(g0.L l6, C1536c c1536c) {
        this.f14832a = l6;
        this.f14833b = c1536c;
    }

    public final void a() {
        Iterator it = this.f14835d.iterator();
        while (it.hasNext()) {
            L l6 = ((K) it.next()).f14776a;
        }
    }
}
