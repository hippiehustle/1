package G5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f1822h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f1823b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1824c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1825d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1826e;

    /* renamed from: f, reason: collision with root package name */
    public float f1827f;

    /* renamed from: g, reason: collision with root package name */
    public float f1828g;

    public r(float f8, float f9, float f10, float f11) {
        this.f1823b = f8;
        this.f1824c = f9;
        this.f1825d = f10;
        this.f1826e = f11;
    }

    @Override // G5.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1831a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f8 = this.f1825d;
        float f9 = this.f1826e;
        RectF rectF = f1822h;
        rectF.set(this.f1823b, this.f1824c, f8, f9);
        path.arcTo(rectF, this.f1827f, this.f1828g, false);
        path.transform(matrix);
    }
}
