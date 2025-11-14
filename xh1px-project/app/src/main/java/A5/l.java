package A5;

import J0.C0067a;
import J0.t;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import h5.C0833a;
import h5.C0834b;
import n.SubMenuC1103E;
import n.y;

/* loaded from: classes.dex */
public final class l implements y {

    /* renamed from: d, reason: collision with root package name */
    public i f377d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f378e;

    /* renamed from: f, reason: collision with root package name */
    public int f379f;

    @Override // n.y
    public final void d(Parcelable parcelable) {
        C0833a c0833a;
        if (parcelable instanceof k) {
            i iVar = this.f377d;
            k kVar = (k) parcelable;
            int i4 = kVar.f375d;
            int size = iVar.f352H.f12646f.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                MenuItem item = iVar.f352H.getItem(i8);
                if (i4 == item.getItemId()) {
                    iVar.j = i4;
                    iVar.k = i8;
                    item.setChecked(true);
                    break;
                }
                i8++;
            }
            Context context = this.f377d.getContext();
            x5.h hVar = kVar.f376e;
            SparseArray sparseArray = new SparseArray(hVar.size());
            for (int i9 = 0; i9 < hVar.size(); i9++) {
                int keyAt = hVar.keyAt(i9);
                C0834b c0834b = (C0834b) hVar.valueAt(i9);
                if (c0834b != null) {
                    c0833a = new C0833a(context, c0834b);
                } else {
                    c0833a = null;
                }
                sparseArray.put(keyAt, c0833a);
            }
            i iVar2 = this.f377d;
            SparseArray sparseArray2 = iVar2.f369v;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int keyAt2 = sparseArray.keyAt(i10);
                if (sparseArray2.indexOfKey(keyAt2) < 0) {
                    sparseArray2.append(keyAt2, (C0833a) sparseArray.get(keyAt2));
                }
            }
            f[] fVarArr = iVar2.f358i;
            if (fVarArr != null) {
                for (f fVar : fVarArr) {
                    C0833a c0833a2 = (C0833a) sparseArray2.get(fVar.getId());
                    if (c0833a2 != null) {
                        fVar.setBadge(c0833a2);
                    }
                }
            }
        }
    }

    @Override // n.y
    public final boolean f(n.o oVar) {
        return false;
    }

    @Override // n.y
    public final void g(boolean z8) {
        C0067a c0067a;
        if (!this.f378e) {
            if (z8) {
                this.f377d.a();
                return;
            }
            i iVar = this.f377d;
            n.m mVar = iVar.f352H;
            if (mVar != null && iVar.f358i != null) {
                int size = mVar.f12646f.size();
                if (size != iVar.f358i.length) {
                    iVar.a();
                    return;
                }
                int i4 = iVar.j;
                for (int i8 = 0; i8 < size; i8++) {
                    MenuItem item = iVar.f352H.getItem(i8);
                    if (item.isChecked()) {
                        iVar.j = item.getItemId();
                        iVar.k = i8;
                    }
                }
                if (i4 != iVar.j && (c0067a = iVar.f353d) != null) {
                    t.a(iVar, c0067a);
                }
                boolean f8 = i.f(iVar.f357h, iVar.f352H.l().size());
                for (int i9 = 0; i9 < size; i9++) {
                    iVar.f351G.f378e = true;
                    iVar.f358i[i9].setLabelVisibilityMode(iVar.f357h);
                    iVar.f358i[i9].setShifting(f8);
                    iVar.f358i[i9].a((n.o) iVar.f352H.getItem(i9));
                    iVar.f351G.f378e = false;
                }
            }
        }
    }

    @Override // n.y
    public final int getId() {
        return this.f379f;
    }

    @Override // n.y
    public final void h(Context context, n.m mVar) {
        this.f377d.f352H = mVar;
    }

    @Override // n.y
    public final boolean i(SubMenuC1103E subMenuC1103E) {
        return false;
    }

    @Override // n.y
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, A5.k] */
    /* JADX WARN: Type inference failed for: r2v0, types: [x5.h, android.util.SparseArray] */
    @Override // n.y
    public final Parcelable k() {
        C0834b c0834b;
        ?? obj = new Object();
        obj.f375d = this.f377d.getSelectedItemId();
        SparseArray<C0833a> badgeDrawables = this.f377d.getBadgeDrawables();
        ?? sparseArray = new SparseArray();
        for (int i4 = 0; i4 < badgeDrawables.size(); i4++) {
            int keyAt = badgeDrawables.keyAt(i4);
            C0833a valueAt = badgeDrawables.valueAt(i4);
            if (valueAt != null) {
                c0834b = valueAt.f11376h.f11411a;
            } else {
                c0834b = null;
            }
            sparseArray.put(keyAt, c0834b);
        }
        obj.f376e = sparseArray;
        return obj;
    }

    @Override // n.y
    public final boolean m(n.o oVar) {
        return false;
    }

    @Override // n.y
    public final void a(n.m mVar, boolean z8) {
    }
}
