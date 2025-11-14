package C5;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import f5.AbstractC0710a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m extends Drawable implements Animatable {

    /* renamed from: n */
    public static final g f693n = new g(Float.class, "growFraction", 2);

    /* renamed from: d */
    public final Context f694d;

    /* renamed from: e */
    public final i f695e;

    /* renamed from: g */
    public ObjectAnimator f697g;

    /* renamed from: h */
    public ObjectAnimator f698h;

    /* renamed from: i */
    public ArrayList f699i;
    public boolean j;
    public float k;

    /* renamed from: m */
    public int f701m;

    /* renamed from: l */
    public final Paint f700l = new Paint();

    /* renamed from: f */
    public a f696f = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, C5.a] */
    public m(Context context, i iVar) {
        this.f694d = context;
        this.f695e = iVar;
        setAlpha(255);
    }

    public final float b() {
        i iVar = this.f695e;
        if (iVar.f680e != 0 || iVar.f681f != 0) {
            return this.k;
        }
        return 1.0f;
    }

    public final boolean c(boolean z8, boolean z9, boolean z10) {
        boolean z11;
        a aVar = this.f696f;
        ContentResolver contentResolver = this.f694d.getContentResolver();
        aVar.getClass();
        float f8 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z10 && f8 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        return d(z8, z9, z11);
    }

    public boolean d(boolean z8, boolean z9, boolean z10) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        boolean z11;
        ObjectAnimator objectAnimator3 = this.f697g;
        g gVar = f693n;
        if (objectAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, gVar, 0.0f, 1.0f);
            this.f697g = ofFloat;
            ofFloat.setDuration(500L);
            this.f697g.setInterpolator(AbstractC0710a.f10767b);
            ObjectAnimator objectAnimator4 = this.f697g;
            if (objectAnimator4 != null && objectAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f697g = objectAnimator4;
            objectAnimator4.addListener(new l(this, 0));
        }
        if (this.f698h == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, gVar, 1.0f, 0.0f);
            this.f698h = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f698h.setInterpolator(AbstractC0710a.f10767b);
            ObjectAnimator objectAnimator5 = this.f698h;
            if (objectAnimator5 != null && objectAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f698h = objectAnimator5;
            objectAnimator5.addListener(new l(this, 1));
        }
        if (isVisible() || z8) {
            if (z8) {
                objectAnimator = this.f697g;
            } else {
                objectAnimator = this.f698h;
            }
            if (z8) {
                objectAnimator2 = this.f698h;
            } else {
                objectAnimator2 = this.f697g;
            }
            if (!z10) {
                if (objectAnimator2.isRunning()) {
                    boolean z12 = this.j;
                    this.j = true;
                    new ValueAnimator[]{objectAnimator2}[0].cancel();
                    this.j = z12;
                }
                if (objectAnimator.isRunning()) {
                    objectAnimator.end();
                } else {
                    boolean z13 = this.j;
                    this.j = true;
                    new ValueAnimator[]{objectAnimator}[0].end();
                    this.j = z13;
                }
                return super.setVisible(z8, false);
            }
            if (!objectAnimator.isRunning()) {
                if (z8 && !super.setVisible(z8, false)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i iVar = this.f695e;
                if (!z8 ? iVar.f681f != 0 : iVar.f680e != 0) {
                    if (!z9 && objectAnimator.isPaused()) {
                        objectAnimator.resume();
                        return z11;
                    }
                    objectAnimator.start();
                    return z11;
                }
                boolean z14 = this.j;
                this.j = true;
                new ValueAnimator[]{objectAnimator}[0].end();
                this.j = z14;
                return z11;
            }
        }
        return false;
    }

    public final void e(c cVar) {
        ArrayList arrayList = this.f699i;
        if (arrayList != null && arrayList.contains(cVar)) {
            this.f699i.remove(cVar);
            if (this.f699i.isEmpty()) {
                this.f699i = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f701m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f697g;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f698h;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f701m = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f700l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        return c(z8, z9, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
