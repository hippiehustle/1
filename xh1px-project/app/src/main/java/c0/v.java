package c0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f9418a;

    /* renamed from: b, reason: collision with root package name */
    public y f9419b;

    public v(int i4) {
        this.f9418a = new SparseArray(i4);
    }

    public final void a(y yVar, int i4, int i8) {
        v vVar;
        int a3 = yVar.a(i4);
        SparseArray sparseArray = this.f9418a;
        if (sparseArray == null) {
            vVar = null;
        } else {
            vVar = (v) sparseArray.get(a3);
        }
        if (vVar == null) {
            vVar = new v(1);
            sparseArray.put(yVar.a(i4), vVar);
        }
        if (i8 > i4) {
            vVar.a(yVar, i4 + 1, i8);
        } else {
            vVar.f9419b = yVar;
        }
    }
}
