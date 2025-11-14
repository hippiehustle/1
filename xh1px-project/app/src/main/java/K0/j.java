package K0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f2554a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2555b;

    /* renamed from: c, reason: collision with root package name */
    public float f2556c;

    /* renamed from: d, reason: collision with root package name */
    public float f2557d;

    /* renamed from: e, reason: collision with root package name */
    public float f2558e;

    /* renamed from: f, reason: collision with root package name */
    public float f2559f;

    /* renamed from: g, reason: collision with root package name */
    public float f2560g;

    /* renamed from: h, reason: collision with root package name */
    public float f2561h;

    /* renamed from: i, reason: collision with root package name */
    public float f2562i;
    public final Matrix j;
    public String k;

    public j() {
        this.f2554a = new Matrix();
        this.f2555b = new ArrayList();
        this.f2556c = 0.0f;
        this.f2557d = 0.0f;
        this.f2558e = 0.0f;
        this.f2559f = 1.0f;
        this.f2560g = 1.0f;
        this.f2561h = 0.0f;
        this.f2562i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // K0.k
    public final boolean a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f2555b;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i4)).a()) {
                return true;
            }
            i4++;
        }
    }

    @Override // K0.k
    public final boolean b(int[] iArr) {
        int i4 = 0;
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f2555b;
            if (i4 < arrayList.size()) {
                z8 |= ((k) arrayList.get(i4)).b(iArr);
                i4++;
            } else {
                return z8;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f2557d, -this.f2558e);
        matrix.postScale(this.f2559f, this.f2560g);
        matrix.postRotate(this.f2556c, 0.0f, 0.0f);
        matrix.postTranslate(this.f2561h + this.f2557d, this.f2562i + this.f2558e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f2557d;
    }

    public float getPivotY() {
        return this.f2558e;
    }

    public float getRotation() {
        return this.f2556c;
    }

    public float getScaleX() {
        return this.f2559f;
    }

    public float getScaleY() {
        return this.f2560g;
    }

    public float getTranslateX() {
        return this.f2561h;
    }

    public float getTranslateY() {
        return this.f2562i;
    }

    public void setPivotX(float f8) {
        if (f8 != this.f2557d) {
            this.f2557d = f8;
            c();
        }
    }

    public void setPivotY(float f8) {
        if (f8 != this.f2558e) {
            this.f2558e = f8;
            c();
        }
    }

    public void setRotation(float f8) {
        if (f8 != this.f2556c) {
            this.f2556c = f8;
            c();
        }
    }

    public void setScaleX(float f8) {
        if (f8 != this.f2559f) {
            this.f2559f = f8;
            c();
        }
    }

    public void setScaleY(float f8) {
        if (f8 != this.f2560g) {
            this.f2560g = f8;
            c();
        }
    }

    public void setTranslateX(float f8) {
        if (f8 != this.f2561h) {
            this.f2561h = f8;
            c();
        }
    }

    public void setTranslateY(float f8) {
        if (f8 != this.f2562i) {
            this.f2562i = f8;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [K0.l, K0.i] */
    public j(j jVar, t.e eVar) {
        l lVar;
        this.f2554a = new Matrix();
        this.f2555b = new ArrayList();
        this.f2556c = 0.0f;
        this.f2557d = 0.0f;
        this.f2558e = 0.0f;
        this.f2559f = 1.0f;
        this.f2560g = 1.0f;
        this.f2561h = 0.0f;
        this.f2562i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.f2556c = jVar.f2556c;
        this.f2557d = jVar.f2557d;
        this.f2558e = jVar.f2558e;
        this.f2559f = jVar.f2559f;
        this.f2560g = jVar.f2560g;
        this.f2561h = jVar.f2561h;
        this.f2562i = jVar.f2562i;
        String str = jVar.k;
        this.k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(jVar.j);
        ArrayList arrayList = jVar.f2555b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = arrayList.get(i4);
            if (obj instanceof j) {
                this.f2555b.add(new j((j) obj, eVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f2546e = 0.0f;
                    lVar2.f2548g = 1.0f;
                    lVar2.f2549h = 1.0f;
                    lVar2.f2550i = 0.0f;
                    lVar2.j = 1.0f;
                    lVar2.k = 0.0f;
                    lVar2.f2551l = Paint.Cap.BUTT;
                    lVar2.f2552m = Paint.Join.MITER;
                    lVar2.f2553n = 4.0f;
                    lVar2.f2545d = iVar.f2545d;
                    lVar2.f2546e = iVar.f2546e;
                    lVar2.f2548g = iVar.f2548g;
                    lVar2.f2547f = iVar.f2547f;
                    lVar2.f2565c = iVar.f2565c;
                    lVar2.f2549h = iVar.f2549h;
                    lVar2.f2550i = iVar.f2550i;
                    lVar2.j = iVar.j;
                    lVar2.k = iVar.k;
                    lVar2.f2551l = iVar.f2551l;
                    lVar2.f2552m = iVar.f2552m;
                    lVar2.f2553n = iVar.f2553n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f2555b.add(lVar);
                Object obj2 = lVar.f2564b;
                if (obj2 != null) {
                    eVar.put(obj2, lVar);
                }
            }
        }
    }
}
