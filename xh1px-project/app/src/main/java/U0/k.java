package U0;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5986a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f5987b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5988c;

    public k(PointF pointF, boolean z8, List list) {
        this.f5987b = pointF;
        this.f5988c = z8;
        this.f5986a = new ArrayList(list);
    }

    public final void a(float f8, float f9) {
        if (this.f5987b == null) {
            this.f5987b = new PointF();
        }
        this.f5987b.set(f8, f9);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f5986a.size() + "closed=" + this.f5988c + '}';
    }

    public k() {
        this.f5986a = new ArrayList();
    }
}
