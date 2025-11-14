package K0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* renamed from: f, reason: collision with root package name */
    public final Context f2540f;

    /* renamed from: g, reason: collision with root package name */
    public H5.e f2541g = null;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f2542h = null;

    /* renamed from: i, reason: collision with root package name */
    public final c f2543i = new c(this);

    /* renamed from: e, reason: collision with root package name */
    public final d f2539e = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable$ConstantState, K0.d] */
    public f(Context context, int i4) {
        this.f2540f = context;
    }

    public static f a(Context context, int i4) {
        f fVar = new f(context, 0);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = G.n.f1676a;
        Drawable drawable = resources.getDrawable(i4, theme);
        fVar.f2544d = drawable;
        drawable.setCallback(fVar.f2543i);
        new e(fVar.f2544d.getConstantState());
        return fVar;
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f2539e;
        dVar.f2533a.draw(canvas);
        if (dVar.f2534b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f2539e.f2533a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2539e.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f2539e.f2533a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2544d != null) {
            return new e(this.f2544d.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f2539e.f2533a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f2539e.f2533a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f2539e.f2533a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [t.j, t.e] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f2539e;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f8 = G.b.f(resources, theme, attributeSet, a.f2529e);
                    int resourceId = f8.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = G.n.f1676a;
                        pVar.f2544d = resources.getDrawable(resourceId, theme);
                        new o(pVar.f2544d.getConstantState());
                        pVar.f2596i = false;
                        pVar.setCallback(this.f2543i);
                        p pVar2 = dVar.f2533a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f2533a = pVar;
                    }
                    f8.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f2530f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2540f;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f2533a.f2592e.f2581b.f2579o.get(string));
                            if (dVar.f2535c == null) {
                                dVar.f2535c = new ArrayList();
                                dVar.f2536d = new t.j(0);
                            }
                            dVar.f2535c.add(loadAnimator);
                            dVar.f2536d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f2534b == null) {
            dVar.f2534b = new AnimatorSet();
        }
        dVar.f2534b.playTogether(dVar.f2535c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f2539e.f2533a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f2539e.f2534b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f2539e.f2533a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2539e.f2533a.setBounds(rect);
        }
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        return this.f2539e.f2533a.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f2539e.f2533a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f2539e.f2533a.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setAutoMirrored(z8);
        } else {
            this.f2539e.f2533a.setAutoMirrored(z8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2539e.f2533a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            E2.b.K(drawable, i4);
        } else {
            this.f2539e.f2533a.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f2539e.f2533a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f2539e.f2533a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.setVisible(z8, z9);
        }
        this.f2539e.f2533a.setVisible(z8, z9);
        return super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f2539e;
        if (dVar.f2534b.isStarted()) {
            return;
        }
        dVar.f2534b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2539e.f2534b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
