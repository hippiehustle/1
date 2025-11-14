package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188f0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f13243l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f13244m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f13245a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13246b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f13247c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f13248d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f13249e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f13250f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f13251g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f13252h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f13253i;
    public final Context j;
    public final C1182c0 k;

    public C1188f0(TextView textView) {
        this.f13253i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new C1184d0();
        } else {
            this.k = new C1182c0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i4 : iArr) {
                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i8 = 0; i8 < size; i8++) {
                    iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f13244m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
                return method;
            }
            return method;
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e9);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e9);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (f()) {
            if (this.f13246b) {
                if (this.f13253i.getMeasuredHeight() > 0 && this.f13253i.getMeasuredWidth() > 0) {
                    if (this.k.b(this.f13253i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f13253i.getMeasuredWidth() - this.f13253i.getTotalPaddingLeft()) - this.f13253i.getTotalPaddingRight();
                    }
                    int height = (this.f13253i.getHeight() - this.f13253i.getCompoundPaddingBottom()) - this.f13253i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f13243l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c6 = c(rectF);
                                if (c6 != this.f13253i.getTextSize()) {
                                    g(0, c6);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f13246b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.f13250f.length;
        if (length != 0) {
            int i4 = length - 1;
            int i8 = 0;
            int i9 = 1;
            while (i9 <= i4) {
                int i10 = (i9 + i4) / 2;
                int i11 = this.f13250f[i10];
                TextView textView = this.f13253i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f13252h;
                if (textPaint == null) {
                    this.f13252h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f13252h.set(textView.getPaint());
                this.f13252h.setTextSize(i11);
                StaticLayout a3 = AbstractC1180b0.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f13253i, this.f13252h, this.k);
                if ((maxLines != -1 && (a3.getLineCount() > maxLines || a3.getLineEnd(a3.getLineCount() - 1) != charSequence.length())) || a3.getHeight() > rectF.bottom) {
                    i8 = i10 - 1;
                    i4 = i8;
                } else {
                    int i12 = i10 + 1;
                    i8 = i9;
                    i9 = i12;
                }
            }
            return this.f13250f[i8];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f13245a != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i4, float f8) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i4, f8, resources.getDisplayMetrics());
        TextView textView = this.f13253i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f13246b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, null);
                    }
                } catch (Exception e9) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e9);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f13245a == 1) {
            if (!this.f13251g || this.f13250f.length == 0) {
                int floor = ((int) Math.floor((this.f13249e - this.f13248d) / this.f13247c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round((i4 * this.f13247c) + this.f13248d);
                }
                this.f13250f = b(iArr);
            }
            this.f13246b = true;
        } else {
            this.f13246b = false;
        }
        return this.f13246b;
    }

    public final boolean i() {
        boolean z8;
        if (this.f13250f.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f13251g = z8;
        if (z8) {
            this.f13245a = 1;
            this.f13248d = r0[0];
            this.f13249e = r0[r1 - 1];
            this.f13247c = -1.0f;
        }
        return z8;
    }

    public final boolean j() {
        return !(this.f13253i instanceof C1220w);
    }

    public final void k(float f8, float f9, float f10) {
        if (f8 > 0.0f) {
            if (f9 > f8) {
                if (f10 > 0.0f) {
                    this.f13245a = 1;
                    this.f13248d = f8;
                    this.f13249e = f9;
                    this.f13247c = f10;
                    this.f13251g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
    }
}
