package G5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import e5.AbstractC0645a;
import s3.AbstractC1492c;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: m, reason: collision with root package name */
    public static final j f1793m = new j(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public AbstractC1492c f1794a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1492c f1795b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1492c f1796c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1492c f1797d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f1798e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f1799f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f1800g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f1801h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f1802i;
    public e j;
    public e k;

    /* renamed from: l, reason: collision with root package name */
    public e f1803l;

    /* JADX WARN: Type inference failed for: r0v0, types: [s3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [s3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [s3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [s3.c, java.lang.Object] */
    public l() {
        int i4 = 0;
        this.f1802i = new e(i4);
        this.j = new e(i4);
        this.k = new e(i4);
        this.f1803l = new e(i4);
    }

    public static F3.f a(Context context, int i4, int i8, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
        if (i8 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i8);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0645a.f10623M);
        try {
            int i9 = obtainStyledAttributes.getInt(0, 0);
            int i10 = obtainStyledAttributes.getInt(3, i9);
            int i11 = obtainStyledAttributes.getInt(4, i9);
            int i12 = obtainStyledAttributes.getInt(2, i9);
            int i13 = obtainStyledAttributes.getInt(1, i9);
            c c6 = c(obtainStyledAttributes, 5, cVar);
            c c9 = c(obtainStyledAttributes, 8, c6);
            c c10 = c(obtainStyledAttributes, 9, c6);
            c c11 = c(obtainStyledAttributes, 7, c6);
            c c12 = c(obtainStyledAttributes, 6, c6);
            F3.f fVar = new F3.f();
            AbstractC1492c r8 = AbstractC1638C.r(i10);
            fVar.f1333e = r8;
            F3.f.b(r8);
            fVar.f1337i = c9;
            AbstractC1492c r9 = AbstractC1638C.r(i11);
            fVar.f1334f = r9;
            F3.f.b(r9);
            fVar.j = c10;
            AbstractC1492c r10 = AbstractC1638C.r(i12);
            fVar.f1335g = r10;
            F3.f.b(r10);
            fVar.k = c11;
            AbstractC1492c r11 = AbstractC1638C.r(i13);
            fVar.f1336h = r11;
            F3.f.b(r11);
            fVar.f1338l = c12;
            return fVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static F3.f b(Context context, AttributeSet attributeSet, int i4, int i8) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10614C, i4, i8);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i4, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue != null) {
            int i8 = peekValue.type;
            if (i8 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i8 == 6) {
                return new j(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (this.f1803l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.f1802i.getClass().equals(e.class) && this.k.getClass().equals(e.class)) {
            z8 = true;
        } else {
            z8 = false;
        }
        float a3 = this.f1798e.a(rectF);
        if (this.f1799f.a(rectF) == a3 && this.f1801h.a(rectF) == a3 && this.f1800g.a(rectF) == a3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((this.f1795b instanceof k) && (this.f1794a instanceof k) && (this.f1796c instanceof k) && (this.f1797d instanceof k)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z8 || !z9 || !z10) {
            return false;
        }
        return true;
    }

    public final F3.f e() {
        F3.f fVar = new F3.f(false);
        fVar.f1333e = this.f1794a;
        fVar.f1334f = this.f1795b;
        fVar.f1335g = this.f1796c;
        fVar.f1336h = this.f1797d;
        fVar.f1337i = this.f1798e;
        fVar.j = this.f1799f;
        fVar.k = this.f1800g;
        fVar.f1338l = this.f1801h;
        fVar.f1339m = this.f1802i;
        fVar.f1340n = this.j;
        fVar.f1341o = this.k;
        fVar.f1342p = this.f1803l;
        return fVar;
    }
}
