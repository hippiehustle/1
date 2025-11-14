package T2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import o6.j;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: f, reason: collision with root package name */
    public final int f5661f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5662g;

    /* renamed from: h, reason: collision with root package name */
    public final d f5663h;

    public a(Context context, int i4, Rect rect, int i8, int[] iArr, boolean[] zArr, boolean z8) {
        super(context, i4, rect, iArr[0], new boolean[]{zArr[0]});
        this.f5661f = i8;
        this.f5662g = z8;
        this.f5663h = new d(context, i4, rect, iArr[1], new boolean[]{zArr[1]});
    }

    @Override // T2.d
    public final void a(Canvas canvas) {
        super.a(canvas);
        this.f5663h.a(canvas);
    }

    @Override // T2.d
    public final void b(Rect rect, int i4, int i8, boolean[] zArr) {
        j.e(rect, "selectorArea");
        boolean z8 = this.f5662g;
        d dVar = this.f5663h;
        int i9 = this.f5678c;
        int i10 = this.f5661f;
        if (z8) {
            super.b(rect, i4, (i8 - i10) - i9, new boolean[]{zArr[0]});
            dVar.b(rect, i4, i8 + i10 + i9, new boolean[]{zArr[1]});
        } else {
            super.b(rect, (i4 - i10) - i9, i8, new boolean[]{zArr[0]});
            dVar.b(rect, i4 + i10 + i9, i8, new boolean[]{zArr[1]});
        }
    }

    @Override // T2.d
    public final void c(int i4) {
        super.c(i4);
        this.f5663h.c(i4);
    }
}
