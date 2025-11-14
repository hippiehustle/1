package P0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements d, Q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4447a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4448b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f4449c;

    /* renamed from: d, reason: collision with root package name */
    public final Q0.i f4450d;

    /* renamed from: e, reason: collision with root package name */
    public final Q0.i f4451e;

    /* renamed from: f, reason: collision with root package name */
    public final Q0.i f4452f;

    public u(V0.b bVar, U0.p pVar) {
        this.f4447a = pVar.f6015e;
        this.f4449c = pVar.f6011a;
        Q0.i r02 = pVar.f6012b.r0();
        this.f4450d = r02;
        Q0.i r03 = pVar.f6013c.r0();
        this.f4451e = r03;
        Q0.i r04 = pVar.f6014d.r0();
        this.f4452f = r04;
        bVar.d(r02);
        bVar.d(r03);
        bVar.d(r04);
        r02.a(this);
        r03.a(this);
        r04.a(this);
    }

    @Override // Q0.a
    public final void b() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4448b;
            if (i4 < arrayList.size()) {
                ((Q0.a) arrayList.get(i4)).b();
                i4++;
            } else {
                return;
            }
        }
    }

    public final void d(Q0.a aVar) {
        this.f4448b.add(aVar);
    }

    @Override // P0.d
    public final void c(List list, List list2) {
    }
}
