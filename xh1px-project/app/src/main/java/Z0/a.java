package Z0;

import android.graphics.Color;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f7249a;

    /* renamed from: b, reason: collision with root package name */
    public float f7250b;

    /* renamed from: c, reason: collision with root package name */
    public float f7251c;

    /* renamed from: d, reason: collision with root package name */
    public int f7252d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f7253e = null;

    public a(a aVar) {
        this.f7249a = 0.0f;
        this.f7250b = 0.0f;
        this.f7251c = 0.0f;
        this.f7252d = 0;
        this.f7249a = aVar.f7249a;
        this.f7250b = aVar.f7250b;
        this.f7251c = aVar.f7251c;
        this.f7252d = aVar.f7252d;
    }

    public final void a(int i4, O0.a aVar) {
        int alpha = Color.alpha(this.f7252d);
        int c6 = g.c(i4);
        Matrix matrix = k.f7301a;
        int i8 = (int) ((((alpha / 255.0f) * c6) / 255.0f) * 255.0f);
        if (i8 > 0) {
            aVar.setShadowLayer(Math.max(this.f7249a, Float.MIN_VALUE), this.f7250b, this.f7251c, Color.argb(i8, Color.red(this.f7252d), Color.green(this.f7252d), Color.blue(this.f7252d)));
        } else {
            aVar.clearShadowLayer();
        }
    }

    public final void b(int i4) {
        this.f7252d = Color.argb(Math.round((g.c(i4) * Color.alpha(this.f7252d)) / 255.0f), Color.red(this.f7252d), Color.green(this.f7252d), Color.blue(this.f7252d));
    }

    public final void c(Matrix matrix) {
        if (this.f7253e == null) {
            this.f7253e = new float[2];
        }
        float[] fArr = this.f7253e;
        fArr[0] = this.f7250b;
        fArr[1] = this.f7251c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f7253e;
        this.f7250b = fArr2[0];
        this.f7251c = fArr2[1];
        this.f7249a = matrix.mapRadius(this.f7249a);
    }
}
