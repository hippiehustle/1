package F5;

import H.b;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1438i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f1439l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1440a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1441b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1442c;

    /* renamed from: d, reason: collision with root package name */
    public int f1443d;

    /* renamed from: e, reason: collision with root package name */
    public int f1444e;

    /* renamed from: f, reason: collision with root package name */
    public int f1445f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f1446g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f1447h;

    public a() {
        Paint paint = new Paint();
        this.f1447h = paint;
        this.f1440a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f1441b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f1442c = new Paint(paint2);
    }

    public final void a(int i4) {
        this.f1443d = b.e(i4, 68);
        this.f1444e = b.e(i4, 20);
        this.f1445f = b.e(i4, 0);
        this.f1440a.setColor(this.f1443d);
    }
}
