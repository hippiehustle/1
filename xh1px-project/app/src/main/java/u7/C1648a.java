package u7;

import f7.C0723c;
import i.AbstractC0862a;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1162a;
import u6.AbstractC1638C;

/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1648a implements D6.j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15384e = {o6.v.f13643a.f(new o6.p(C1648a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public final v7.i f15385d;

    /* JADX WARN: Type inference failed for: r0v1, types: [v7.i, v7.h] */
    public C1648a(v7.n nVar, InterfaceC1162a interfaceC1162a) {
        o6.j.e(nVar, "storageManager");
        this.f15385d = new v7.h((v7.k) nVar, interfaceC1162a);
    }

    @Override // D6.j
    public final boolean a(C0723c c0723c) {
        return AbstractC1638C.B(this, c0723c);
    }

    @Override // D6.j
    public final D6.c e(C0723c c0723c) {
        return AbstractC1638C.v(this, c0723c);
    }

    @Override // D6.j
    public boolean isEmpty() {
        return ((List) AbstractC0862a.j(this.f15385d, f15384e[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) AbstractC0862a.j(this.f15385d, f15384e[0])).iterator();
    }
}
