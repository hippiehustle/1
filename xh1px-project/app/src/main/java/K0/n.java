package K0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f2580a;

    /* renamed from: b, reason: collision with root package name */
    public m f2581b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2582c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f2583d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2584e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f2585f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2586g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2587h;

    /* renamed from: i, reason: collision with root package name */
    public int f2588i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f2589l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2580a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
