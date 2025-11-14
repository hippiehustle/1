package K0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: m, reason: collision with root package name */
    public static final PorterDuff.Mode f2591m = PorterDuff.Mode.SRC_IN;

    /* renamed from: e, reason: collision with root package name */
    public n f2592e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuffColorFilter f2593f;

    /* renamed from: g, reason: collision with root package name */
    public ColorFilter f2594g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2595h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2596i;
    public final float[] j;
    public final Matrix k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f2597l;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, K0.n] */
    public p() {
        this.f2596i = true;
        this.j = new float[9];
        this.k = new Matrix();
        this.f2597l = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f2582c = null;
        constantState.f2583d = f2591m;
        constantState.f2581b = new m();
        this.f2592e = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f2597l;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f2594g;
            if (colorFilter == null) {
                colorFilter = this.f2593f;
            }
            Matrix matrix = this.k;
            canvas.getMatrix(matrix);
            float[] fArr = this.j;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (rect.width() * abs);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f2592e;
                Bitmap bitmap = nVar.f2585f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f2585f.getHeight()) {
                    nVar.f2585f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.k = true;
                }
                if (!this.f2596i) {
                    n nVar2 = this.f2592e;
                    nVar2.f2585f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f2585f);
                    m mVar = nVar2.f2581b;
                    mVar.a(mVar.f2573g, m.f2566p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f2592e;
                    if (nVar3.k || nVar3.f2586g != nVar3.f2582c || nVar3.f2587h != nVar3.f2583d || nVar3.j != nVar3.f2584e || nVar3.f2588i != nVar3.f2581b.getRootAlpha()) {
                        n nVar4 = this.f2592e;
                        nVar4.f2585f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f2585f);
                        m mVar2 = nVar4.f2581b;
                        mVar2.a(mVar2.f2573g, m.f2566p, canvas3, min, min2);
                        n nVar5 = this.f2592e;
                        nVar5.f2586g = nVar5.f2582c;
                        nVar5.f2587h = nVar5.f2583d;
                        nVar5.f2588i = nVar5.f2581b.getRootAlpha();
                        nVar5.j = nVar5.f2584e;
                        nVar5.k = false;
                    }
                }
                n nVar6 = this.f2592e;
                if (nVar6.f2581b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f2589l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f2589l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f2589l.setAlpha(nVar6.f2581b.getRootAlpha());
                    nVar6.f2589l.setColorFilter(colorFilter);
                    paint = nVar6.f2589l;
                }
                canvas.drawBitmap(nVar6.f2585f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f2592e.f2581b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f2592e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f2594g;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2544d != null) {
            return new o(this.f2544d.getConstantState());
        }
        this.f2592e.f2580a = getChangingConfigurations();
        return this.f2592e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f2592e.f2581b.f2575i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f2592e.f2581b.f2574h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f2592e.f2584e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f2592e;
            if (nVar != null) {
                m mVar = nVar.f2581b;
                if (mVar.f2578n == null) {
                    mVar.f2578n = Boolean.valueOf(mVar.f2573g.a());
                }
                if (!mVar.f2578n.booleanValue()) {
                    ColorStateList colorStateList = this.f2592e.f2582c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, K0.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2595h && super.mutate() == this) {
            n nVar = this.f2592e;
            ?? constantState = new Drawable.ConstantState();
            constantState.f2582c = null;
            constantState.f2583d = f2591m;
            if (nVar != null) {
                constantState.f2580a = nVar.f2580a;
                m mVar = new m(nVar.f2581b);
                constantState.f2581b = mVar;
                if (nVar.f2581b.f2571e != null) {
                    mVar.f2571e = new Paint(nVar.f2581b.f2571e);
                }
                if (nVar.f2581b.f2570d != null) {
                    constantState.f2581b.f2570d = new Paint(nVar.f2581b.f2570d);
                }
                constantState.f2582c = nVar.f2582c;
                constantState.f2583d = nVar.f2583d;
                constantState.f2584e = nVar.f2584e;
            }
            this.f2592e = constantState;
            this.f2595h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z8;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f2592e;
        ColorStateList colorStateList = nVar.f2582c;
        if (colorStateList != null && (mode = nVar.f2583d) != null) {
            this.f2593f = a(colorStateList, mode);
            invalidateSelf();
            z8 = true;
        } else {
            z8 = false;
        }
        m mVar = nVar.f2581b;
        if (mVar.f2578n == null) {
            mVar.f2578n = Boolean.valueOf(mVar.f2573g.a());
        }
        if (mVar.f2578n.booleanValue()) {
            boolean b4 = nVar.f2581b.f2573g.b(iArr);
            nVar.k |= b4;
            if (b4) {
                invalidateSelf();
                return true;
            }
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f2592e.f2581b.getRootAlpha() != i4) {
            this.f2592e.f2581b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setAutoMirrored(z8);
        } else {
            this.f2592e.f2584e = z8;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2594g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            E2.b.K(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f2592e;
        if (nVar.f2582c != colorStateList) {
            nVar.f2582c = colorStateList;
            this.f2593f = a(colorStateList, nVar.f2583d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f2592e;
        if (nVar.f2583d != mode) {
            nVar.f2583d = mode;
            this.f2593f = a(nVar.f2582c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            return drawable.setVisible(z8, z9);
        }
        return super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [K0.l, K0.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i4;
        char c6;
        int i8;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f2544d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f2592e;
        nVar.f2581b = new m();
        TypedArray f8 = G.b.f(resources, theme, attributeSet, a.f2525a);
        n nVar2 = this.f2592e;
        m mVar = nVar2.f2581b;
        int i9 = !G.b.c(xmlPullParser, "tintMode") ? -1 : f8.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i9 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i9 != 5) {
            if (i9 != 9) {
                switch (i9) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f2583d = mode;
        ColorStateList colorStateList = null;
        int i10 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f8.getValue(1, typedValue);
            int i11 = typedValue.type;
            if (i11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i11 >= 28 && i11 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f8.getResources();
                int resourceId = f8.getResourceId(1, 0);
                ThreadLocal threadLocal = G.c.f1648a;
                try {
                    colorStateList = G.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e9) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e9);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f2582c = colorStateList2;
        }
        boolean z8 = nVar2.f2584e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z8 = f8.getBoolean(5, z8);
        }
        nVar2.f2584e = z8;
        float f9 = mVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f9 = f8.getFloat(7, f9);
        }
        mVar.j = f9;
        float f10 = mVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = f8.getFloat(8, f10);
        }
        mVar.k = f10;
        if (mVar.j <= 0.0f) {
            throw new XmlPullParserException(f8.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 > 0.0f) {
            mVar.f2574h = f8.getDimension(3, mVar.f2574h);
            float dimension = f8.getDimension(2, mVar.f2575i);
            mVar.f2575i = dimension;
            if (mVar.f2574h <= 0.0f) {
                throw new XmlPullParserException(f8.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f8.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = f8.getString(0);
                if (string != null) {
                    mVar.f2577m = string;
                    mVar.f2579o.put(string, mVar);
                }
                f8.recycle();
                nVar.f2580a = getChangingConfigurations();
                nVar.k = true;
                n nVar3 = this.f2592e;
                m mVar2 = nVar3.f2581b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f2573g;
                t.e eVar = mVar2.f2579o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z9 = true;
                while (eventType != i10 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i4 = depth;
                        if ("path".equals(name)) {
                            ?? lVar = new l();
                            lVar.f2546e = 0.0f;
                            lVar.f2548g = 1.0f;
                            lVar.f2549h = 1.0f;
                            lVar.f2550i = 0.0f;
                            lVar.j = 1.0f;
                            lVar.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f2551l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f2552m = join2;
                            lVar.f2553n = 4.0f;
                            TypedArray f11 = G.b.f(resources, theme, attributeSet, a.f2527c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f11.getString(0);
                                if (string2 != null) {
                                    lVar.f2564b = string2;
                                }
                                String string3 = f11.getString(2);
                                if (string3 != null) {
                                    lVar.f2563a = D2.f.h(string3);
                                }
                                lVar.f2547f = G.b.b(f11, xmlPullParser, theme, "fillColor", 1);
                                float f12 = lVar.f2549h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = f11.getFloat(12, f12);
                                }
                                lVar.f2549h = f12;
                                int i12 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f11.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f2551l;
                                if (i12 == 0) {
                                    cap = cap2;
                                } else if (i12 != 1) {
                                    cap = i12 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f2551l = cap;
                                int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f11.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f2552m;
                                if (i13 == 0) {
                                    join = join2;
                                } else if (i13 != 1) {
                                    join = i13 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f2552m = join;
                                float f13 = lVar.f2553n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = f11.getFloat(10, f13);
                                }
                                lVar.f2553n = f13;
                                lVar.f2545d = G.b.b(f11, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = lVar.f2548g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = f11.getFloat(11, f14);
                                }
                                lVar.f2548g = f14;
                                float f15 = lVar.f2546e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = f11.getFloat(4, f15);
                                }
                                lVar.f2546e = f15;
                                float f16 = lVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = f11.getFloat(6, f16);
                                }
                                lVar.j = f16;
                                float f17 = lVar.k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = f11.getFloat(7, f17);
                                }
                                lVar.k = f17;
                                float f18 = lVar.f2550i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = f11.getFloat(5, f18);
                                }
                                lVar.f2550i = f18;
                                int i14 = lVar.f2565c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i14 = f11.getInt(13, i14);
                                }
                                lVar.f2565c = i14;
                            }
                            f11.recycle();
                            jVar2.f2555b.add(lVar);
                            if (lVar.getPathName() != null) {
                                eVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f2580a = nVar3.f2580a;
                            z9 = false;
                            c6 = '\b';
                        } else {
                            c6 = '\b';
                            if ("clip-path".equals(name)) {
                                l lVar2 = new l();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f19 = G.b.f(resources, theme, attributeSet, a.f2528d);
                                    String string4 = f19.getString(0);
                                    if (string4 != null) {
                                        lVar2.f2564b = string4;
                                    }
                                    String string5 = f19.getString(1);
                                    if (string5 != null) {
                                        lVar2.f2563a = D2.f.h(string5);
                                    }
                                    lVar2.f2565c = !G.b.c(xmlPullParser, "fillType") ? 0 : f19.getInt(2, 0);
                                    f19.recycle();
                                }
                                jVar2.f2555b.add(lVar2);
                                if (lVar2.getPathName() != null) {
                                    eVar.put(lVar2.getPathName(), lVar2);
                                }
                                nVar3.f2580a = nVar3.f2580a;
                            } else if ("group".equals(name)) {
                                j jVar3 = new j();
                                TypedArray f20 = G.b.f(resources, theme, attributeSet, a.f2526b);
                                float f21 = jVar3.f2556c;
                                if (G.b.c(xmlPullParser, "rotation")) {
                                    f21 = f20.getFloat(5, f21);
                                }
                                jVar3.f2556c = f21;
                                jVar3.f2557d = f20.getFloat(1, jVar3.f2557d);
                                jVar3.f2558e = f20.getFloat(2, jVar3.f2558e);
                                float f22 = jVar3.f2559f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f22 = f20.getFloat(3, f22);
                                }
                                jVar3.f2559f = f22;
                                float f23 = jVar3.f2560g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f23 = f20.getFloat(4, f23);
                                }
                                jVar3.f2560g = f23;
                                float f24 = jVar3.f2561h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f24 = f20.getFloat(6, f24);
                                }
                                jVar3.f2561h = f24;
                                float f25 = jVar3.f2562i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f25 = f20.getFloat(7, f25);
                                }
                                jVar3.f2562i = f25;
                                String string6 = f20.getString(0);
                                if (string6 != null) {
                                    jVar3.k = string6;
                                }
                                jVar3.c();
                                f20.recycle();
                                jVar2.f2555b.add(jVar3);
                                arrayDeque.push(jVar3);
                                if (jVar3.getGroupName() != null) {
                                    eVar.put(jVar3.getGroupName(), jVar3);
                                }
                                nVar3.f2580a = nVar3.f2580a;
                            }
                        }
                        i8 = 1;
                    } else {
                        i4 = depth;
                        c6 = '\b';
                        i8 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i10 = i8;
                    depth = i4;
                }
                if (!z9) {
                    this.f2593f = a(nVar.f2582c, nVar.f2583d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f8.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f8.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f2596i = true;
        this.j = new float[9];
        this.k = new Matrix();
        this.f2597l = new Rect();
        this.f2592e = nVar;
        this.f2593f = a(nVar.f2582c, nVar.f2583d);
    }
}
