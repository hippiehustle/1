package P0;

import a1.C0414a;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements T0.e {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4335d;

    public c() {
        this.f4335d = new ArrayList();
    }

    @Override // T0.e
    public List B0() {
        return this.f4335d;
    }

    @Override // T0.e
    public boolean E0() {
        ArrayList arrayList = this.f4335d;
        if (arrayList.size() != 1 || !((C0414a) arrayList.get(0)).c()) {
            return false;
        }
        return true;
    }

    public void a(Path path) {
        ArrayList arrayList = this.f4335d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            Matrix matrix = Z0.k.f7301a;
            if (uVar != null && !uVar.f4447a) {
                Z0.k.a(path, uVar.f4450d.l() / 100.0f, uVar.f4451e.l() / 100.0f, uVar.f4452f.l() / 360.0f);
            }
        }
    }

    @Override // T0.e
    public Q0.e r0() {
        ArrayList arrayList = this.f4335d;
        if (((C0414a) arrayList.get(0)).c()) {
            return new Q0.j(1, arrayList);
        }
        return new Q0.m(arrayList);
    }

    public c(ArrayList arrayList) {
        this.f4335d = arrayList;
    }
}
