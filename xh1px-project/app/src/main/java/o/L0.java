package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.buzbuz.smartautoclicker.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import u.AbstractC1595a;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: g, reason: collision with root package name */
    public static L0 f13101g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f13103a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f13104b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f13105c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13106d;

    /* renamed from: e, reason: collision with root package name */
    public F3.a f13107e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f13100f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final K0 f13102h = new t.i(6);

    public static synchronized L0 b() {
        L0 l02;
        synchronized (L0.class) {
            try {
                if (f13101g == null) {
                    f13101g = new L0();
                }
                l02 = f13101g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l02;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (L0.class) {
            K0 k02 = f13102h;
            k02.getClass();
            int i8 = (31 + i4) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) k02.f(Integer.valueOf(mode.hashCode() + i8));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i4) {
        Drawable drawable;
        if (this.f13105c == null) {
            this.f13105c = new TypedValue();
        }
        TypedValue typedValue = this.f13105c;
        context.getResources().getValue(i4, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            t.g gVar = (t.g) this.f13104b.get(context);
            drawable = null;
            if (gVar != null) {
                WeakReference weakReference = (WeakReference) gVar.c(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b4 = AbstractC1595a.b(gVar.f14656e, gVar.f14658g, j);
                        if (b4 >= 0) {
                            Object[] objArr = gVar.f14657f;
                            Object obj = objArr[b4];
                            Object obj2 = t.h.f14659a;
                            if (obj != obj2) {
                                objArr[b4] = obj2;
                                gVar.f14655d = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f13107e != null) {
            if (i4 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i4 == R.drawable.abc_ratingbar_material) {
                layerDrawable = F3.a.s(this, context, R.dimen.abc_star_big);
            } else if (i4 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = F3.a.s(this, context, R.dimen.abc_star_medium);
            } else if (i4 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = F3.a.s(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        t.g gVar2 = (t.g) this.f13104b.get(context);
                        if (gVar2 == null) {
                            gVar2 = new t.g((Object) null);
                            this.f13104b.put(context, gVar2);
                        }
                        gVar2.g(j, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return layerDrawable;
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i4) {
        return d(context, i4, false);
    }

    public final synchronized Drawable d(Context context, int i4, boolean z8) {
        Drawable a3;
        try {
            if (!this.f13106d) {
                this.f13106d = true;
                Drawable c6 = c(context, R.drawable.abc_vector_test);
                if (c6 == null || (!(c6 instanceof K0.p) && !"android.graphics.drawable.VectorDrawable".equals(c6.getClass().getName()))) {
                    this.f13106d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a3 = a(context, i4);
            if (a3 == null) {
                a3 = context.getDrawable(i4);
            }
            if (a3 != null) {
                a3 = g(context, i4, z8, a3);
            }
            if (a3 != null) {
                AbstractC1202m0.a(a3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a3;
    }

    public final synchronized ColorStateList f(Context context, int i4) {
        ColorStateList colorStateList;
        t.k kVar;
        WeakHashMap weakHashMap = this.f13103a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (kVar = (t.k) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) kVar.b(i4);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            F3.a aVar = this.f13107e;
            if (aVar != null) {
                colorStateList2 = aVar.t(context, i4);
            }
            if (colorStateList2 != null) {
                if (this.f13103a == null) {
                    this.f13103a = new WeakHashMap();
                }
                t.k kVar2 = (t.k) this.f13103a.get(context);
                if (kVar2 == null) {
                    kVar2 = new t.k(0);
                    this.f13103a.put(context, kVar2);
                }
                kVar2.a(i4, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i4, boolean z8, Drawable drawable) {
        int i8;
        boolean z9;
        int round;
        ColorStateList f8 = f(context, i4);
        PorterDuff.Mode mode = null;
        if (f8 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f8);
            if (this.f13107e != null && i4 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.f13107e != null) {
            if (i4 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c6 = a1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1216u.f13388b;
                F3.a.A(findDrawableByLayerId, c6, mode2);
                F3.a.A(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), a1.c(context, R.attr.colorControlNormal), mode2);
                F3.a.A(layerDrawable.findDrawableByLayerId(android.R.id.progress), a1.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i4 == R.drawable.abc_ratingbar_material || i4 == R.drawable.abc_ratingbar_indicator_material || i4 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b4 = a1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1216u.f13388b;
                F3.a.A(findDrawableByLayerId2, b4, mode3);
                F3.a.A(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), a1.c(context, R.attr.colorControlActivated), mode3);
                F3.a.A(layerDrawable2.findDrawableByLayerId(android.R.id.progress), a1.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        F3.a aVar = this.f13107e;
        boolean z10 = false;
        if (aVar != null) {
            PorterDuff.Mode mode4 = C1216u.f13388b;
            if (F3.a.c((int[]) aVar.f1304e, i4)) {
                i8 = R.attr.colorControlNormal;
            } else if (F3.a.c((int[]) aVar.f1307h, i4)) {
                i8 = R.attr.colorControlActivated;
            } else {
                if (F3.a.c((int[]) aVar.f1308i, i4)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i4 == R.drawable.abc_list_divider_mtrl_alpha) {
                    round = Math.round(40.8f);
                    i8 = 16842800;
                    z9 = true;
                    if (z9) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C1216u.c(a1.c(context, i8), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z10 = true;
                    }
                } else if (i4 != R.drawable.abc_dialog_material_background) {
                    i8 = 0;
                    z9 = false;
                    round = -1;
                    if (z9) {
                    }
                }
                i8 = 16842801;
            }
            z9 = true;
            round = -1;
            if (z9) {
            }
        }
        if (!z10 && z8) {
            return null;
        }
        return drawable;
    }
}
