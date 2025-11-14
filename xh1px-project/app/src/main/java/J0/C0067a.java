package J0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: J0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067a extends p {

    /* renamed from: H, reason: collision with root package name */
    public int f2271H;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f2269F = new ArrayList();

    /* renamed from: G, reason: collision with root package name */
    public boolean f2270G = true;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2272I = false;

    /* renamed from: J, reason: collision with root package name */
    public int f2273J = 0;

    public C0067a() {
        O(1);
        L(new C0073g(2));
        L(new p());
        L(new C0073g(1));
    }

    @Override // J0.p
    public final void A(View view) {
        super.A(view);
        int size = this.f2269F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p) this.f2269F.get(i4)).A(view);
        }
    }

    @Override // J0.p
    public final void B() {
        if (this.f2269F.isEmpty()) {
            J();
            m();
            return;
        }
        u uVar = new u();
        uVar.f2342b = this;
        Iterator it = this.f2269F.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(uVar);
        }
        this.f2271H = this.f2269F.size();
        if (!this.f2270G) {
            for (int i4 = 1; i4 < this.f2269F.size(); i4++) {
                ((p) this.f2269F.get(i4 - 1)).a(new u((p) this.f2269F.get(i4), 2));
            }
            p pVar = (p) this.f2269F.get(0);
            if (pVar != null) {
                pVar.B();
                return;
            }
            return;
        }
        Iterator it2 = this.f2269F.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).B();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // J0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(long j, long j5) {
        boolean z8;
        long j8;
        long j9 = this.f2333z;
        long j10 = 0;
        if (this.f2319l != null) {
            if (j >= 0 || j5 >= 0) {
                if (j > j9 && j5 > j9) {
                    return;
                }
            } else {
                return;
            }
        }
        if (j < j5) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((j >= 0 && j5 < 0) || (j <= j9 && j5 > j9)) {
            this.f2328u = false;
            w(this, o.f2302b, z8);
        }
        if (this.f2270G) {
            for (int i4 = 0; i4 < this.f2269F.size(); i4++) {
                ((p) this.f2269F.get(i4)).C(j, j5);
            }
        } else {
            int i8 = 1;
            while (true) {
                if (i8 < this.f2269F.size()) {
                    if (((p) this.f2269F.get(i8)).f2312A > j5) {
                        break;
                    } else {
                        i8++;
                    }
                } else {
                    i8 = this.f2269F.size();
                    break;
                }
            }
            int i9 = i8 - 1;
            if (j >= j5) {
                while (i9 < this.f2269F.size()) {
                    p pVar = (p) this.f2269F.get(i9);
                    long j11 = pVar.f2312A;
                    j8 = j10;
                    long j12 = j - j11;
                    if (j12 < j8) {
                        break;
                    }
                    pVar.C(j12, j5 - j11);
                    i9++;
                    j10 = j8;
                }
            } else {
                j8 = 0;
                while (i9 >= 0) {
                    p pVar2 = (p) this.f2269F.get(i9);
                    long j13 = pVar2.f2312A;
                    long j14 = j - j13;
                    pVar2.C(j14, j5 - j13);
                    if (j14 >= 0) {
                        break;
                    } else {
                        i9--;
                    }
                }
            }
            if (this.f2319l == null) {
                if ((j > j9 && j5 <= j9) || (j < 0 && j5 >= j8)) {
                    if (j > j9) {
                        this.f2328u = true;
                    }
                    w(this, o.f2303c, z8);
                    return;
                }
                return;
            }
            return;
        }
        j8 = j10;
        if (this.f2319l == null) {
        }
    }

    @Override // J0.p
    public final void E(E2.c cVar) {
        this.f2273J |= 8;
        int size = this.f2269F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p) this.f2269F.get(i4)).E(cVar);
        }
    }

    @Override // J0.p
    public final void G(G5.e eVar) {
        super.G(eVar);
        this.f2273J |= 4;
        if (this.f2269F != null) {
            for (int i4 = 0; i4 < this.f2269F.size(); i4++) {
                ((p) this.f2269F.get(i4)).G(eVar);
            }
        }
    }

    @Override // J0.p
    public final void H() {
        this.f2273J |= 2;
        int size = this.f2269F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p) this.f2269F.get(i4)).H();
        }
    }

    @Override // J0.p
    public final void I(long j) {
        this.f2314e = j;
    }

    @Override // J0.p
    public final String K(String str) {
        String K = super.K(str);
        for (int i4 = 0; i4 < this.f2269F.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(K);
            sb.append("\n");
            sb.append(((p) this.f2269F.get(i4)).K(str + "  "));
            K = sb.toString();
        }
        return K;
    }

    public final void L(p pVar) {
        this.f2269F.add(pVar);
        pVar.f2319l = this;
        long j = this.f2315f;
        if (j >= 0) {
            pVar.D(j);
        }
        if ((this.f2273J & 1) != 0) {
            pVar.F(this.f2316g);
        }
        if ((this.f2273J & 2) != 0) {
            pVar.H();
        }
        if ((this.f2273J & 4) != 0) {
            pVar.G(this.f2332y);
        }
        if ((this.f2273J & 8) != 0) {
            pVar.E(null);
        }
    }

    @Override // J0.p
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void D(long j) {
        ArrayList arrayList;
        this.f2315f = j;
        if (j >= 0 && (arrayList = this.f2269F) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((p) this.f2269F.get(i4)).D(j);
            }
        }
    }

    @Override // J0.p
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void F(TimeInterpolator timeInterpolator) {
        this.f2273J |= 1;
        ArrayList arrayList = this.f2269F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((p) this.f2269F.get(i4)).F(timeInterpolator);
            }
        }
        this.f2316g = timeInterpolator;
    }

    public final void O(int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                this.f2270G = false;
                return;
            }
            throw new AndroidRuntimeException(A.j.l("Invalid parameter for TransitionSet ordering: ", i4));
        }
        this.f2270G = true;
    }

    @Override // J0.p
    public final void c() {
        super.c();
        int size = this.f2269F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p) this.f2269F.get(i4)).c();
        }
    }

    @Override // J0.p
    public final void d(x xVar) {
        if (u(xVar.f2345b)) {
            Iterator it = this.f2269F.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (pVar.u(xVar.f2345b)) {
                    pVar.d(xVar);
                    xVar.f2346c.add(pVar);
                }
            }
        }
    }

    @Override // J0.p
    public final void f(x xVar) {
        int size = this.f2269F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p) this.f2269F.get(i4)).f(xVar);
        }
    }

    @Override // J0.p
    public final void g(x xVar) {
        if (u(xVar.f2345b)) {
            Iterator it = this.f2269F.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (pVar.u(xVar.f2345b)) {
                    pVar.g(xVar);
                    xVar.f2346c.add(pVar);
                }
            }
        }
    }

    @Override // J0.p
    /* renamed from: j */
    public final p clone() {
        C0067a c0067a = (C0067a) super.clone();
        c0067a.f2269F = new ArrayList();
        int size = this.f2269F.size();
        for (int i4 = 0; i4 < size; i4++) {
            p clone = ((p) this.f2269F.get(i4)).clone();
            c0067a.f2269F.add(clone);
            clone.f2319l = c0067a;
        }
        return c0067a;
    }

    @Override // J0.p
    public final void l(ViewGroup viewGroup, A4.a aVar, A4.a aVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f2314e;
        int size = this.f2269F.size();
        for (int i4 = 0; i4 < size; i4++) {
            p pVar = (p) this.f2269F.get(i4);
            if (j > 0 && (this.f2270G || i4 == 0)) {
                long j5 = pVar.f2314e;
                if (j5 > 0) {
                    pVar.I(j5 + j);
                } else {
                    pVar.I(j);
                }
            }
            pVar.l(viewGroup, aVar, aVar2, arrayList, arrayList2);
        }
    }

    @Override // J0.p
    public final boolean s() {
        for (int i4 = 0; i4 < this.f2269F.size(); i4++) {
            if (((p) this.f2269F.get(i4)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.p
    public final void x(View view) {
        super.x(view);
        int size = this.f2269F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p) this.f2269F.get(i4)).x(view);
        }
    }

    @Override // J0.p
    public final void y() {
        this.f2333z = 0L;
        int i4 = 0;
        u uVar = new u(this, i4);
        while (i4 < this.f2269F.size()) {
            p pVar = (p) this.f2269F.get(i4);
            pVar.a(uVar);
            pVar.y();
            long j = pVar.f2333z;
            if (this.f2270G) {
                this.f2333z = Math.max(this.f2333z, j);
            } else {
                long j5 = this.f2333z;
                pVar.f2312A = j5;
                this.f2333z = j5 + j;
            }
            i4++;
        }
    }

    @Override // J0.p
    public final p z(n nVar) {
        super.z(nVar);
        return this;
    }
}
