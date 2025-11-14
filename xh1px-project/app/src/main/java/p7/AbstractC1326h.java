package p7;

import C6.M;
import F6.AbstractC0042b;
import F6.N;
import f7.C0725e;
import i.AbstractC0862a;
import java.util.Collection;
import java.util.List;
import n6.InterfaceC1163b;
import o6.v;

/* renamed from: p7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1326h extends AbstractC1334p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f13828d = {v.f13643a.f(new o6.p(AbstractC1326h.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0042b f13829b;

    /* renamed from: c, reason: collision with root package name */
    public final v7.i f13830c;

    /* JADX WARN: Type inference failed for: r0v2, types: [v7.i, v7.h] */
    public AbstractC1326h(v7.k kVar, AbstractC0042b abstractC0042b) {
        o6.j.e(kVar, "storageManager");
        this.f13829b = abstractC0042b;
        this.f13830c = new v7.h(kVar, new B6.j(14, this));
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        if (!c1324f.a(C1324f.f13818n.f13825b)) {
            return a6.s.f7766d;
        }
        return (List) AbstractC0862a.j(this.f13830c, f13828d[0]);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        List list = (List) AbstractC0862a.j(this.f13830c, f13828d[0]);
        if (list.isEmpty()) {
            return a6.s.f7766d;
        }
        F7.f fVar = new F7.f();
        for (Object obj : list) {
            if ((obj instanceof M) && o6.j.a(((M) obj).getName(), c0725e)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        List list = (List) AbstractC0862a.j(this.f13830c, f13828d[0]);
        if (list.isEmpty()) {
            return a6.s.f7766d;
        }
        F7.f fVar = new F7.f();
        for (Object obj : list) {
            if ((obj instanceof N) && o6.j.a(((N) obj).getName(), c0725e)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    public abstract List h();
}
