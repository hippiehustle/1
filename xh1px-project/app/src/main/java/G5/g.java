package G5;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import u5.C1635a;

/* loaded from: classes.dex */
public class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public l f1752a;

    /* renamed from: b, reason: collision with root package name */
    public C1635a f1753b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1754c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1755d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1756e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1757f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f1758g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1759h;

    /* renamed from: i, reason: collision with root package name */
    public float f1760i;
    public float j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public float f1761l;

    /* renamed from: m, reason: collision with root package name */
    public float f1762m;

    /* renamed from: n, reason: collision with root package name */
    public int f1763n;

    /* renamed from: o, reason: collision with root package name */
    public int f1764o;

    /* renamed from: p, reason: collision with root package name */
    public int f1765p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1766q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint.Style f1767r;

    public g(l lVar) {
        this.f1754c = null;
        this.f1755d = null;
        this.f1756e = null;
        this.f1757f = PorterDuff.Mode.SRC_IN;
        this.f1758g = null;
        this.f1759h = 1.0f;
        this.f1760i = 1.0f;
        this.k = 255;
        this.f1761l = 0.0f;
        this.f1762m = 0.0f;
        this.f1763n = 0;
        this.f1764o = 0;
        this.f1765p = 0;
        this.f1766q = 0;
        this.f1767r = Paint.Style.FILL_AND_STROKE;
        this.f1752a = lVar;
        this.f1753b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f1773h = true;
        return hVar;
    }

    public g(g gVar) {
        this.f1754c = null;
        this.f1755d = null;
        this.f1756e = null;
        this.f1757f = PorterDuff.Mode.SRC_IN;
        this.f1758g = null;
        this.f1759h = 1.0f;
        this.f1760i = 1.0f;
        this.k = 255;
        this.f1761l = 0.0f;
        this.f1762m = 0.0f;
        this.f1763n = 0;
        this.f1764o = 0;
        this.f1765p = 0;
        this.f1766q = 0;
        this.f1767r = Paint.Style.FILL_AND_STROKE;
        this.f1752a = gVar.f1752a;
        this.f1753b = gVar.f1753b;
        this.j = gVar.j;
        this.f1754c = gVar.f1754c;
        this.f1755d = gVar.f1755d;
        this.f1757f = gVar.f1757f;
        this.f1756e = gVar.f1756e;
        this.k = gVar.k;
        this.f1759h = gVar.f1759h;
        this.f1765p = gVar.f1765p;
        this.f1763n = gVar.f1763n;
        this.f1760i = gVar.f1760i;
        this.f1761l = gVar.f1761l;
        this.f1762m = gVar.f1762m;
        this.f1764o = gVar.f1764o;
        this.f1766q = gVar.f1766q;
        this.f1767r = gVar.f1767r;
        if (gVar.f1758g != null) {
            this.f1758g = new Rect(gVar.f1758g);
        }
    }
}
