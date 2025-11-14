package P0;

import N0.B;
import N0.x;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements n, Q0.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f4436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4437c;

    /* renamed from: d, reason: collision with root package name */
    public final x f4438d;

    /* renamed from: e, reason: collision with root package name */
    public final Q0.n f4439e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4440f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4435a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f4441g = new c();

    public s(x xVar, V0.b bVar, U0.n nVar) {
        this.f4436b = nVar.f5998a;
        this.f4437c = nVar.f6001d;
        this.f4438d = xVar;
        Q0.n nVar2 = new Q0.n((List) nVar.f6000c.f1023e);
        this.f4439e = nVar2;
        bVar.d(nVar2);
        nVar2.a(this);
    }

    @Override // Q0.a
    public final void b() {
        this.f4440f = false;
        this.f4438d.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        ArrayList arrayList = null;
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i4 < arrayList2.size()) {
                d dVar = (d) arrayList2.get(i4);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f4449c == 1) {
                        this.f4441g.f4335d.add(uVar);
                        uVar.d(this);
                        i4++;
                    }
                }
                if (dVar instanceof r) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    r rVar = (r) dVar;
                    rVar.f4433b.a(this);
                    arrayList.add(rVar);
                }
                i4++;
            } else {
                this.f4439e.f4744m = arrayList;
                return;
            }
        }
    }

    @Override // S0.f
    public final void e(R3.r rVar, Object obj) {
        if (obj == B.K) {
            this.f4439e.j(rVar);
        }
    }

    @Override // P0.n
    public final Path f() {
        boolean z8 = this.f4440f;
        Q0.n nVar = this.f4439e;
        Path path = this.f4435a;
        if (z8 && nVar.f4722e == null) {
            return path;
        }
        path.reset();
        if (this.f4437c) {
            this.f4440f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f4441g.a(path);
        this.f4440f = true;
        return path;
    }

    @Override // P0.d
    public final String getName() {
        return this.f4436b;
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        Z0.g.g(eVar, i4, arrayList, eVar2, this);
    }
}
