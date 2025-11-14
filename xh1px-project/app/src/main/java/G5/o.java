package G5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o extends u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f1817d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.f1816c = arrayList;
        this.f1817d = matrix;
    }

    @Override // G5.u
    public final void a(Matrix matrix, F5.a aVar, int i4, Canvas canvas) {
        Iterator it = this.f1816c.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(this.f1817d, aVar, i4, canvas);
        }
    }
}
