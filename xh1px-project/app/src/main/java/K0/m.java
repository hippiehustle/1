package K0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f2566p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f2567a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f2568b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f2569c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f2570d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f2571e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f2572f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2573g;

    /* renamed from: h, reason: collision with root package name */
    public float f2574h;

    /* renamed from: i, reason: collision with root package name */
    public float f2575i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public int f2576l;

    /* renamed from: m, reason: collision with root package name */
    public String f2577m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f2578n;

    /* renamed from: o, reason: collision with root package name */
    public final t.e f2579o;

    /* JADX WARN: Type inference failed for: r0v4, types: [t.j, t.e] */
    public m() {
        this.f2569c = new Matrix();
        this.f2574h = 0.0f;
        this.f2575i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.f2576l = 255;
        this.f2577m = null;
        this.f2578n = null;
        this.f2579o = new t.j(0);
        this.f2573g = new j();
        this.f2567a = new Path();
        this.f2568b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i4, int i8) {
        int i9;
        float f8;
        float f9;
        int i10;
        float f10;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f2554a;
        ArrayList arrayList = jVar.f2555b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f2554a;
        matrix3.preConcat(jVar.j);
        canvas.save();
        char c6 = 0;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            k kVar = (k) arrayList.get(i11);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i4, i8);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f11 = i4 / this.j;
                float f12 = i8 / this.k;
                float min = Math.min(f11, f12);
                Matrix matrix4 = this.f2569c;
                matrix4.set(matrix3);
                matrix4.postScale(f11, f12);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c6], fArr[1]);
                boolean z8 = c6;
                i9 = i11;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f13 = (fArr[z8 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                if (max > 0.0f) {
                    f8 = Math.abs(f13) / max;
                } else {
                    f8 = 0.0f;
                }
                if (f8 != 0.0f) {
                    lVar.getClass();
                    Path path = this.f2567a;
                    path.reset();
                    H.e[] eVarArr = lVar.f2563a;
                    if (eVarArr != null) {
                        H.e.b(eVarArr, path);
                    }
                    Path path2 = this.f2568b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f2565c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f14 = iVar.f2550i;
                        if (f14 != 0.0f || iVar.j != 1.0f) {
                            float f15 = iVar.k;
                            float f16 = (f14 + f15) % 1.0f;
                            float f17 = (iVar.j + f15) % 1.0f;
                            if (this.f2572f == null) {
                                this.f2572f = new PathMeasure();
                            }
                            this.f2572f.setPath(path, z8);
                            float length = this.f2572f.getLength();
                            float f18 = f16 * length;
                            float f19 = f17 * length;
                            path.reset();
                            if (f18 > f19) {
                                this.f2572f.getSegment(f18, length, path, true);
                                f9 = 0.0f;
                                this.f2572f.getSegment(0.0f, f19, path, true);
                            } else {
                                f9 = 0.0f;
                                this.f2572f.getSegment(f18, f19, path, true);
                            }
                            path.rLineTo(f9, f9);
                        }
                        path2.addPath(path, matrix4);
                        G.d dVar = iVar.f2547f;
                        if (((Shader) dVar.f1651c) != null || dVar.f1650b != 0) {
                            if (this.f2571e == null) {
                                i10 = 16777215;
                                Paint paint = new Paint(1);
                                this.f2571e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i10 = 16777215;
                            }
                            Paint paint2 = this.f2571e;
                            Shader shader = (Shader) dVar.f1651c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f2549h * 255.0f));
                                f10 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i12 = dVar.f1650b;
                                float f20 = iVar.f2549h;
                                PorterDuff.Mode mode = p.f2591m;
                                f10 = 255.0f;
                                paint2.setColor((i12 & i10) | (((int) (Color.alpha(i12) * f20)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f2565c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f10 = 255.0f;
                            i10 = 16777215;
                        }
                        G.d dVar2 = iVar.f2545d;
                        if (((Shader) dVar2.f1651c) != null || dVar2.f1650b != 0) {
                            if (this.f2570d == null) {
                                Paint paint3 = new Paint(1);
                                this.f2570d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f2570d;
                            Paint.Join join = iVar.f2552m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f2551l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f2553n);
                            Shader shader2 = (Shader) dVar2.f1651c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f2548g * f10));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i13 = dVar2.f1650b;
                                float f21 = iVar.f2548g;
                                PorterDuff.Mode mode2 = p.f2591m;
                                paint4.setColor((i13 & i10) | (((int) (Color.alpha(i13) * f21)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f2546e * min * f8);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i11 = i9 + 1;
                c6 = 0;
            }
            i9 = i11;
            i11 = i9 + 1;
            c6 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2576l;
    }

    public void setAlpha(float f8) {
        setRootAlpha((int) (f8 * 255.0f));
    }

    public void setRootAlpha(int i4) {
        this.f2576l = i4;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [t.j, t.e] */
    public m(m mVar) {
        this.f2569c = new Matrix();
        this.f2574h = 0.0f;
        this.f2575i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.f2576l = 255;
        this.f2577m = null;
        this.f2578n = null;
        ?? jVar = new t.j(0);
        this.f2579o = jVar;
        this.f2573g = new j(mVar.f2573g, jVar);
        this.f2567a = new Path(mVar.f2567a);
        this.f2568b = new Path(mVar.f2568b);
        this.f2574h = mVar.f2574h;
        this.f2575i = mVar.f2575i;
        this.j = mVar.j;
        this.k = mVar.k;
        this.f2576l = mVar.f2576l;
        this.f2577m = mVar.f2577m;
        String str = mVar.f2577m;
        if (str != null) {
            jVar.put(str, this);
        }
        this.f2578n = mVar.f2578n;
    }
}
