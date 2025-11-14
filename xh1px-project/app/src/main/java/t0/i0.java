package t0;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f14857a;

    /* renamed from: b, reason: collision with root package name */
    public int f14858b;

    /* renamed from: c, reason: collision with root package name */
    public Set f14859c;

    public final h0 a(int i4) {
        SparseArray sparseArray = this.f14857a;
        h0 h0Var = (h0) sparseArray.get(i4);
        if (h0Var == null) {
            h0 h0Var2 = new h0();
            sparseArray.put(i4, h0Var2);
            return h0Var2;
        }
        return h0Var;
    }
}
