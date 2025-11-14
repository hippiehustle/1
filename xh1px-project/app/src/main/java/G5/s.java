package G5;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: b, reason: collision with root package name */
    public float f1829b;

    /* renamed from: c, reason: collision with root package name */
    public float f1830c;

    @Override // G5.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1831a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1829b, this.f1830c);
        path.transform(matrix);
    }
}
