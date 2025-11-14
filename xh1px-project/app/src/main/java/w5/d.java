package w5;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class d implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f15729a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f15730b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f15731c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f15732d;

    public d(j jVar) {
        this.f15732d = jVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f8, Object obj, Object obj2) {
        this.f15732d.f15773p = f8;
        float[] fArr = this.f15729a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f15730b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i4 = 0; i4 < 9; i4++) {
            float f9 = fArr2[i4];
            float f10 = fArr[i4];
            fArr2[i4] = AbstractC1149a.a(f9, f10, f8, f10);
        }
        Matrix matrix = this.f15731c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
