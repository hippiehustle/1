package com.airbnb.lottie;

import A.j;
import A4.d;
import E.a;
import N0.A;
import N0.AbstractC0194b;
import N0.B;
import N0.C;
import N0.C0197e;
import N0.C0199g;
import N0.C0201i;
import N0.C0202j;
import N0.E;
import N0.EnumC0193a;
import N0.EnumC0200h;
import N0.F;
import N0.G;
import N0.H;
import N0.I;
import N0.InterfaceC0195c;
import N0.J;
import N0.k;
import N0.o;
import N0.s;
import N0.w;
import N0.x;
import N0.y;
import R3.r;
import S0.e;
import V0.c;
import Z0.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.buzbuz.smartautoclicker.R;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: t, reason: collision with root package name */
    public static final C0197e f9731t = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final C0201i f9732g;

    /* renamed from: h, reason: collision with root package name */
    public final C0201i f9733h;

    /* renamed from: i, reason: collision with root package name */
    public A f9734i;
    public int j;
    public final x k;

    /* renamed from: l, reason: collision with root package name */
    public String f9735l;

    /* renamed from: m, reason: collision with root package name */
    public int f9736m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9737n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9738o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9739p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f9740q;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f9741r;

    /* renamed from: s, reason: collision with root package name */
    public E f9742s;

    /* JADX WARN: Type inference failed for: r2v8, types: [android.graphics.PorterDuffColorFilter, N0.I] */
    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        boolean remove;
        this.f9732g = new C0201i(this, 1);
        this.f9733h = new C0201i(this, 0);
        this.j = 0;
        x xVar = new x();
        this.k = xVar;
        this.f9737n = false;
        this.f9738o = false;
        this.f9739p = true;
        HashSet hashSet = new HashSet();
        this.f9740q = hashSet;
        this.f9741r = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, G.f3575a, R.attr.lottieAnimationViewStyle, 0);
        this.f9739p = obtainStyledAttributes.getBoolean(4, true);
        boolean hasValue = obtainStyledAttributes.hasValue(16);
        boolean hasValue2 = obtainStyledAttributes.hasValue(11);
        boolean hasValue3 = obtainStyledAttributes.hasValue(21);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(10, 0));
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.f9738o = true;
        }
        if (obtainStyledAttributes.getBoolean(14, false)) {
            xVar.f3675e.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(19)) {
            setRepeatMode(obtainStyledAttributes.getInt(19, 1));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            setRepeatCount(obtainStyledAttributes.getInt(18, -1));
        }
        if (obtainStyledAttributes.hasValue(20)) {
            setSpeed(obtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(6, true));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(5, false));
        }
        if (obtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(13));
        boolean hasValue4 = obtainStyledAttributes.hasValue(15);
        float f8 = obtainStyledAttributes.getFloat(15, 0.0f);
        if (hasValue4) {
            hashSet.add(EnumC0200h.f3594e);
        }
        xVar.t(f8);
        boolean z8 = obtainStyledAttributes.getBoolean(9, false);
        HashSet hashSet2 = (HashSet) xVar.f3683o.f6489e;
        y yVar = y.f3695d;
        if (z8) {
            remove = hashSet2.add(yVar);
        } else {
            remove = hashSet2.remove(yVar);
        }
        if (xVar.f3674d != null && remove) {
            xVar.c();
        }
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.hasValue(7)) {
            xVar.a(new e("**"), B.f3535F, new r((I) new PorterDuffColorFilter(AbstractC1492c.o(getContext(), obtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            int i4 = obtainStyledAttributes.getInt(17, 0);
            setRenderMode(H.values()[i4 >= H.values().length ? 0 : i4]);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int i8 = obtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(EnumC0193a.values()[i8 >= H.values().length ? 0 : i8]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(12, false));
        if (obtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(22, false));
        }
        obtainStyledAttributes.recycle();
    }

    private void setCompositionTask(E e9) {
        C c6 = e9.f3571d;
        x xVar = this.k;
        if (c6 != null && xVar == getDrawable() && xVar.f3674d == c6.f3564a) {
            return;
        }
        this.f9740q.add(EnumC0200h.f3593d);
        this.k.d();
        a();
        e9.b(this.f9732g);
        e9.a(this.f9733h);
        this.f9742s = e9;
    }

    public final void a() {
        E e9 = this.f9742s;
        if (e9 != null) {
            C0201i c0201i = this.f9732g;
            synchronized (e9) {
                e9.f3568a.remove(c0201i);
            }
            E e10 = this.f9742s;
            C0201i c0201i2 = this.f9733h;
            synchronized (e10) {
                e10.f3569b.remove(c0201i2);
            }
        }
    }

    public EnumC0193a getAsyncUpdates() {
        EnumC0193a enumC0193a = this.k.f3667O;
        if (enumC0193a != null) {
            return enumC0193a;
        }
        return EnumC0193a.f3580d;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC0193a enumC0193a = this.k.f3667O;
        if (enumC0193a == null) {
            enumC0193a = EnumC0193a.f3580d;
        }
        if (enumC0193a == EnumC0193a.f3581e) {
            return true;
        }
        return false;
    }

    public boolean getClipTextToBoundingBox() {
        return this.k.f3692x;
    }

    public boolean getClipToCompositionBounds() {
        return this.k.f3685q;
    }

    public C0202j getComposition() {
        Drawable drawable = getDrawable();
        x xVar = this.k;
        if (drawable == xVar) {
            return xVar.f3674d;
        }
        return null;
    }

    public long getDuration() {
        if (getComposition() != null) {
            return r0.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.k.f3675e.k;
    }

    public String getImageAssetsFolder() {
        return this.k.k;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.k.f3684p;
    }

    public float getMaxFrame() {
        return this.k.f3675e.b();
    }

    public float getMinFrame() {
        return this.k.f3675e.c();
    }

    public F getPerformanceTracker() {
        C0202j c0202j = this.k.f3674d;
        if (c0202j != null) {
            return c0202j.f3601a;
        }
        return null;
    }

    public float getProgress() {
        return this.k.f3675e.a();
    }

    public H getRenderMode() {
        if (this.k.f3694z) {
            return H.f3578f;
        }
        return H.f3577e;
    }

    public int getRepeatCount() {
        return this.k.f3675e.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.k.f3675e.getRepeatMode();
    }

    public float getSpeed() {
        return this.k.f3675e.f7263g;
    }

    @Override // android.view.View
    public final void invalidate() {
        H h8;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof x) {
            boolean z8 = ((x) drawable).f3694z;
            H h9 = H.f3578f;
            if (z8) {
                h8 = h9;
            } else {
                h8 = H.f3577e;
            }
            if (h8 == h9) {
                this.k.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        x xVar = this.k;
        if (drawable2 == xVar) {
            super.invalidateDrawable(xVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f9738o) {
            this.k.k();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i4;
        if (!(parcelable instanceof C0199g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0199g c0199g = (C0199g) parcelable;
        super.onRestoreInstanceState(c0199g.getSuperState());
        this.f9735l = c0199g.f3587d;
        HashSet hashSet = this.f9740q;
        EnumC0200h enumC0200h = EnumC0200h.f3593d;
        if (!hashSet.contains(enumC0200h) && !TextUtils.isEmpty(this.f9735l)) {
            setAnimation(this.f9735l);
        }
        this.f9736m = c0199g.f3588e;
        if (!hashSet.contains(enumC0200h) && (i4 = this.f9736m) != 0) {
            setAnimation(i4);
        }
        boolean contains = hashSet.contains(EnumC0200h.f3594e);
        x xVar = this.k;
        if (!contains) {
            xVar.t(c0199g.f3589f);
        }
        EnumC0200h enumC0200h2 = EnumC0200h.f3598i;
        if (!hashSet.contains(enumC0200h2) && c0199g.f3590g) {
            hashSet.add(enumC0200h2);
            xVar.k();
        }
        if (!hashSet.contains(EnumC0200h.f3597h)) {
            setImageAssetsFolder(c0199g.f3591h);
        }
        if (!hashSet.contains(EnumC0200h.f3595f)) {
            setRepeatMode(c0199g.f3592i);
        }
        if (!hashSet.contains(EnumC0200h.f3596g)) {
            setRepeatCount(c0199g.j);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, N0.g] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z8;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f3587d = this.f9735l;
        baseSavedState.f3588e = this.f9736m;
        x xVar = this.k;
        Z0.e eVar = xVar.f3675e;
        Z0.e eVar2 = xVar.f3675e;
        baseSavedState.f3589f = eVar.a();
        if (xVar.isVisible()) {
            z8 = eVar2.f7270p;
        } else {
            int i4 = xVar.f3673U;
            if (i4 != 2 && i4 != 3) {
                z8 = false;
            } else {
                z8 = true;
            }
        }
        baseSavedState.f3590g = z8;
        baseSavedState.f3591h = xVar.k;
        baseSavedState.f3592i = eVar2.getRepeatMode();
        baseSavedState.j = eVar2.getRepeatCount();
        return baseSavedState;
    }

    public void setAnimation(final int i4) {
        E a3;
        this.f9736m = i4;
        final String str = null;
        this.f9735l = null;
        if (isInEditMode()) {
            a3 = new E(new Callable() { // from class: N0.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z8 = lottieAnimationView.f9739p;
                    int i8 = i4;
                    if (z8) {
                        Context context = lottieAnimationView.getContext();
                        return o.f(context, i8, o.k(context, i8));
                    }
                    return o.f(lottieAnimationView.getContext(), i8, null);
                }
            }, true);
        } else if (this.f9739p) {
            Context context = getContext();
            final String k = o.k(context, i4);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            a3 = o.a(k, new Callable() { // from class: N0.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return o.f(context2, i4, k);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap hashMap = o.f3627a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            a3 = o.a(null, new Callable() { // from class: N0.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return o.f(context22, i4, str);
                }
            }, null);
        }
        setCompositionTask(a3);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(o.a(null, new Callable() { // from class: N0.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.d(byteArrayInputStream, null);
            }
        }, new a(5, byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) {
        E a3;
        int i4 = 0;
        String str2 = null;
        if (this.f9739p) {
            Context context = getContext();
            HashMap hashMap = o.f3627a;
            String o7 = j.o("url_", str);
            a3 = o.a(o7, new k(context, str, o7, i4), null);
        } else {
            a3 = o.a(null, new k(getContext(), str, str2, i4), null);
        }
        setCompositionTask(a3);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z8) {
        this.k.f3690v = z8;
    }

    public void setApplyingShadowToLayersEnabled(boolean z8) {
        this.k.f3691w = z8;
    }

    public void setAsyncUpdates(EnumC0193a enumC0193a) {
        this.k.f3667O = enumC0193a;
    }

    public void setCacheComposition(boolean z8) {
        this.f9739p = z8;
    }

    public void setClipTextToBoundingBox(boolean z8) {
        x xVar = this.k;
        if (z8 != xVar.f3692x) {
            xVar.f3692x = z8;
            xVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z8) {
        x xVar = this.k;
        if (z8 != xVar.f3685q) {
            xVar.f3685q = z8;
            c cVar = xVar.f3686r;
            if (cVar != null) {
                cVar.f6245L = z8;
            }
            xVar.invalidateSelf();
        }
    }

    public void setComposition(C0202j c0202j) {
        boolean z8;
        x xVar = this.k;
        xVar.setCallback(this);
        boolean z9 = true;
        this.f9737n = true;
        ArrayList arrayList = xVar.f3679i;
        Z0.e eVar = xVar.f3675e;
        boolean z10 = false;
        if (xVar.f3674d == c0202j) {
            z9 = false;
        } else {
            xVar.f3666N = true;
            xVar.d();
            xVar.f3674d = c0202j;
            xVar.c();
            if (eVar.f7269o == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            eVar.f7269o = c0202j;
            if (z8) {
                eVar.i(Math.max(eVar.f7267m, c0202j.f3610l), Math.min(eVar.f7268n, c0202j.f3611m));
            } else {
                eVar.i((int) c0202j.f3610l, (int) c0202j.f3611m);
            }
            float f8 = eVar.k;
            eVar.k = 0.0f;
            eVar.j = 0.0f;
            eVar.h((int) f8);
            eVar.f();
            xVar.t(eVar.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (wVar != null) {
                    wVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            c0202j.f3601a.f3572a = xVar.f3688t;
            xVar.e();
            Drawable.Callback callback = xVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(xVar);
            }
        }
        if (this.f9738o) {
            xVar.k();
        }
        this.f9737n = false;
        if (getDrawable() != xVar || z9) {
            if (!z9) {
                if (eVar != null) {
                    z10 = eVar.f7270p;
                }
                setImageDrawable(null);
                setImageDrawable(xVar);
                if (z10) {
                    xVar.m();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f9741r.iterator();
            if (!it2.hasNext()) {
                return;
            }
            it2.next().getClass();
            throw new ClassCastException();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        x xVar = this.k;
        xVar.f3682n = str;
        d i4 = xVar.i();
        if (i4 != null) {
            i4.f299i = str;
        }
    }

    public void setFailureListener(A a3) {
        this.f9734i = a3;
    }

    public void setFallbackResource(int i4) {
        this.j = i4;
    }

    public void setFontAssetDelegate(AbstractC0194b abstractC0194b) {
        d dVar = this.k.f3680l;
    }

    public void setFontMap(Map<String, Typeface> map) {
        x xVar = this.k;
        if (map == xVar.f3681m) {
            return;
        }
        xVar.f3681m = map;
        xVar.invalidateSelf();
    }

    public void setFrame(int i4) {
        this.k.n(i4);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z8) {
        this.k.f3677g = z8;
    }

    public void setImageAssetDelegate(InterfaceC0195c interfaceC0195c) {
        R0.a aVar = this.k.j;
    }

    public void setImageAssetsFolder(String str) {
        this.k.k = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f9736m = 0;
        this.f9735l = null;
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f9736m = 0;
        this.f9735l = null;
        a();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        this.f9736m = 0;
        this.f9735l = null;
        a();
        super.setImageResource(i4);
    }

    public void setMaintainOriginalImageBounds(boolean z8) {
        this.k.f3684p = z8;
    }

    public void setMaxFrame(int i4) {
        this.k.o(i4);
    }

    public void setMaxProgress(float f8) {
        x xVar = this.k;
        C0202j c0202j = xVar.f3674d;
        if (c0202j == null) {
            xVar.f3679i.add(new s(xVar, f8, 0));
            return;
        }
        Z0.e eVar = xVar.f3675e;
        eVar.i(eVar.f7267m, g.f(c0202j.f3610l, c0202j.f3611m, f8));
    }

    public void setMinAndMaxFrame(String str) {
        this.k.q(str);
    }

    public void setMinFrame(int i4) {
        this.k.r(i4);
    }

    public void setMinProgress(float f8) {
        x xVar = this.k;
        C0202j c0202j = xVar.f3674d;
        if (c0202j == null) {
            xVar.f3679i.add(new s(xVar, f8, 1));
        } else {
            xVar.r((int) g.f(c0202j.f3610l, c0202j.f3611m, f8));
        }
    }

    public void setOutlineMasksAndMattes(boolean z8) {
        x xVar = this.k;
        if (xVar.f3689u != z8) {
            xVar.f3689u = z8;
            c cVar = xVar.f3686r;
            if (cVar != null) {
                cVar.q(z8);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        x xVar = this.k;
        xVar.f3688t = z8;
        C0202j c0202j = xVar.f3674d;
        if (c0202j != null) {
            c0202j.f3601a.f3572a = z8;
        }
    }

    public void setProgress(float f8) {
        this.f9740q.add(EnumC0200h.f3594e);
        this.k.t(f8);
    }

    public void setRenderMode(H h8) {
        x xVar = this.k;
        xVar.f3693y = h8;
        xVar.e();
    }

    public void setRepeatCount(int i4) {
        this.f9740q.add(EnumC0200h.f3596g);
        this.k.f3675e.setRepeatCount(i4);
    }

    public void setRepeatMode(int i4) {
        this.f9740q.add(EnumC0200h.f3595f);
        this.k.f3675e.setRepeatMode(i4);
    }

    public void setSafeMode(boolean z8) {
        this.k.f3678h = z8;
    }

    public void setSpeed(float f8) {
        this.k.f3675e.f7263g = f8;
    }

    public void setTextDelegate(J j) {
        this.k.getClass();
    }

    public void setUseCompositionFrameRate(boolean z8) {
        this.k.f3675e.f7271q = z8;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        x xVar;
        boolean z8;
        boolean z9 = this.f9737n;
        boolean z10 = false;
        if (!z9 && drawable == (xVar = this.k)) {
            Z0.e eVar = xVar.f3675e;
            if (eVar == null) {
                z8 = false;
            } else {
                z8 = eVar.f7270p;
            }
            if (z8) {
                this.f9738o = false;
                xVar.j();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z9 && (drawable instanceof x)) {
            x xVar2 = (x) drawable;
            Z0.e eVar2 = xVar2.f3675e;
            if (eVar2 != null) {
                z10 = eVar2.f7270p;
            }
            if (z10) {
                xVar2.j();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.k.p(str);
    }

    public void setMinFrame(String str) {
        this.k.s(str);
    }

    public void setAnimation(final String str) {
        E a3;
        this.f9735l = str;
        this.f9736m = 0;
        int i4 = 1;
        if (isInEditMode()) {
            a3 = new E(new Callable() { // from class: N0.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z8 = lottieAnimationView.f9739p;
                    String str2 = str;
                    if (z8) {
                        Context context = lottieAnimationView.getContext();
                        HashMap hashMap = o.f3627a;
                        return o.b(context, str2, "asset_" + str2);
                    }
                    return o.b(lottieAnimationView.getContext(), str2, null);
                }
            }, true);
        } else {
            String str2 = null;
            if (this.f9739p) {
                Context context = getContext();
                HashMap hashMap = o.f3627a;
                String o7 = j.o("asset_", str);
                a3 = o.a(o7, new k(context.getApplicationContext(), str, o7, i4), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = o.f3627a;
                a3 = o.a(null, new k(context2.getApplicationContext(), str, str2, i4), null);
            }
        }
        setCompositionTask(a3);
    }
}
